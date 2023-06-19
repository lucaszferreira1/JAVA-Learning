import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Controller.BarcosController;
import Controller.CapitaesController;
import Controller.FuncionariosController;

public class Principal {

    public static void main(String[] args) throws SQLException {
        Conexao c = new Conexao();
        Connection con = c.getConnection();
        int op = 0;
        do{
            op = menu();
            try {
                switch (op) {
                    case 1: new BarcosController().createBarco(con);
                            break;
                    case 2: new FuncionariosController().createFuncionario(con);
                            break;
                    case 3: new CapitaesController().createCapitao(con);
            				break;
                    case 4: new BarcosController().listarBarcos(con);
                            break;
                    case 5: new FuncionariosController().listarFuncionarios(con);
                            break;
                    case 6: new CapitaesController().listarCapitaesBarcos(con);
                            break;
                    case 7: new BarcosController().listarContTiposBarcos(con);
                    	    break;
                    case 8: new BarcosController().listarBarcosSemCapitao(con);
                		    break;
                }
            }catch(SQLException ex) {
                //ex.printStackTrace();
                System.out.println(ex.getMessage());
                continue;
            }
        } while(op>0 && op<9);  
        con.close();
    }    
    
    private static int menu() {
        System.out.println("");
        System.out.println("Informe o número da opção que desejas executar: ");
        System.out.println("1 - Inserir um novo Barco");
        System.out.println("2 - Inserir um novo Funcionário");
        System.out.println("3 - Inserir um novo Capitão");
        System.out.println("4 - Exibir todos os Barcos");
        System.out.println("5 - Exibir todos os Funcionarios");
        System.out.println("6 - Exibir todos os Capitães e seus respectivos Barcos");
        System.out.println("7 - Listar quantidade de cada tipo de Barco");
        System.out.println("8 - Listar Barcos sem Capitão");
        System.out.println("Digite qualquer outro valor para sair");
        System.out.print("Sua opção: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
