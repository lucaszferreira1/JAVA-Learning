package Models;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import Beans.FuncionarioBean;

public class FuncionariosModel {

    public static void create(FuncionarioBean f, Connection con) throws SQLException {
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
    
    public static HashSet listAll(Connection con) throws SQLException {
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
}
