package Models;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import Beans.BarcoBean;

public class BarcosModel {

    public static void create(BarcoBean a, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO BARCO (ID, NOME, TIPO) VALUES (DEFAULT,?,?)");
            st.setString(1, a.getNome());
            st.setString(2, a.getTipo());
            st.execute();
            st.close();  
    }

    public static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT * FROM BARCO";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new BarcoBean(result.getInt(1), result.getString(2), result.getString(3)));
            }
        return list;
    }
}
