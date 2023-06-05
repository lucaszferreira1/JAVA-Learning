package Controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import Beans.BarcoBean;
import Models.BarcosModel;

public class BarcosController {
    
    public void createBarco(Connection con) throws SQLException {
    	Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para a criar um novo Barco: ");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Tipo: ");
        String tipo = input.nextLine();
        BarcoBean bar = new BarcoBean(0, nome, tipo);
        BarcosModel.create(bar, con);
        System.out.println("Barco criado com sucesso!!");
    }

    public void listarBarcos(Connection con) throws SQLException {
        HashSet all = BarcosModel.listAll(con);
        Iterator<BarcoBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
