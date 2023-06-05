package Controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import Beans.FuncionarioBean;
import Models.FuncionariosModel;


public class FuncionariosController {
    public void createFuncionario(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para a criar um novo funcionário: ");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Trabalho: ");
        String trabalho = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine(); 
        System.out.print("Fone: ");
        String fone= input.nextLine(); 
        System.out.print("Cpf: ");
        long cpf = input.nextLong();
        
        FuncionarioBean fun = new FuncionarioBean(0, nome, trabalho, email, fone, cpf);
        FuncionariosModel.create(fun, con);
        System.out.println("Funcionário criado com sucesso!!");     
    }

    public void listarFuncionarios(Connection con) throws SQLException {
        HashSet all = FuncionariosModel.listAll(con);
        Iterator<FuncionarioBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}