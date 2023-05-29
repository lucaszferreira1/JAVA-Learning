import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

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
                    case 3: new BarcosController().listarBarcos(con);
                            break;
                    case 4: new FuncionariosController().listarFuncionarios(con);
                            break;
                    case 5: new FuncionariosController().listarCapitaesBarcos(con);
                            break;
                }
            }catch(SQLException ex) {
                //ex.printStackTrace();
                System.out.println(ex.getMessage());
                continue;
            }
        } while(op>0 && op<6);  
        con.close();
    }    
    
    private static int menu() {
        System.out.println("");
        System.out.println("Informe o número da opção que desejas executar: ");
        System.out.println("1 - Inserir um novo Barco");
        System.out.println("2 - Inserir um novo Funcionário");
        System.out.println("3 - Exibir todos os Barcos");
        System.out.println("4 - Exibir todos os Funcionarios");
        System.out.println("5 - Exibir todos os Capitães e seus respectivos Barcos");
        System.out.println("Digite qualquer outro valor para sair");
        System.out.print("Sua opção: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
