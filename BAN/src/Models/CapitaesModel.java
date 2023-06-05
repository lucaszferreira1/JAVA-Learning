package Models;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

import Beans.BarcoBean;
import Beans.CapitaoBean;
import Beans.FuncionarioBean;

public class CapitaesModel {
	public static void create(CapitaoBean c, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO CAPITAO(ID_BARCO, ID_CAPITAO) VALUES(?, ?)\r\n"
            		+ "");
            st.setInt(1, c.getBarco());
            st.setInt(2, c.getFuncionario());
            st.execute();
            st.close();
    }
	
	public static HashSet listBarcosWithCapitao(Connection con) throws SQLException {
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
