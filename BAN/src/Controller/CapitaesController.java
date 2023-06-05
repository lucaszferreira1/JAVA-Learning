package Controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import Beans.CapitaoBean;
import Beans.FuncionarioBean;
import Models.CapitaesModel;

public class CapitaesController {
	public void createCapitao(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        new BarcosController().listarBarcos(con);
        System.out.println("Insira o código do barco: ");
        int barco = input.nextInt();
        new FuncionariosController().listarFuncionarios(con);
        System.out.print("Insira o código do funcionário: ");
        int func = input.nextInt();
        
        CapitaoBean fun = new CapitaoBean(barco, func);
        CapitaesModel.create(fun, con);
        System.out.println("Funcionário ligado ao barco com sucesso.");     
    }
	
	public void listarCapitaesBarcos(Connection con) throws SQLException {
        HashSet all = CapitaesModel.listBarcosWithCapitao(con);
        Iterator<FuncionarioBean> it = all.iterator();
        while(it.hasNext()) {
        	FuncionarioBean fun = it.next();
        	System.out.println(fun.getBarco().toString() + " | " + fun.toString());
        }
    }
}
