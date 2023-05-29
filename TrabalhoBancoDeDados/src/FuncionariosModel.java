import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncionariosModel {

    static void create(FuncionarioBean f, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO FUNCIONARIO(ID, NOME, TRABALHO, EMAIL, FONE, CPF) VALUES(DEFAULT, ?, ?, ?, ?, ?)\r\n"
            		+ "");
            st.setString(1, f.getNome());
            st.setString(2, f.getTrabalho());
            st.setString(3, f.getEmail());
            st.setString(4, f.getFone());
            st.setLong(5, f.getCpf());
            st.execute();
            st.close();
    }
    
    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT * FROM FUNCIONARIO";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new FuncionarioBean(result.getInt(1), result.getString(2), result.getString(3), 
                result.getString(4), result.getString(5), result.getInt(6)));
            }
        return list;
    }    

    static HashSet listBarcosWithCapitao(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT B.*, F.* FROM BARCO B JOIN CAPITAO C ON C.ID_BARCO = B.ID JOIN FUNCIONARIO F ON F.ID = C.ID_CAPITAO ";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
        	BarcoBean bar = new BarcoBean(result.getInt(1), result.getString(2), result.getString(3));
        	FuncionarioBean fun = new FuncionarioBean(result.getInt(4), result.getString(5), result.getString(6),
                    result.getString(7), result.getString(8), result.getInt(9));
            
            fun.setBarco(bar);
            list.add(fun);
        }
        return list;
    }
}
