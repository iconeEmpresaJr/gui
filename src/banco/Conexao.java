
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexao {

    public Connection getConnection() {
        Connection conexao;
        try {
            String stringConexao = "jdbc:postgresql://localhost:5432/";
            String nomeBanco = "gerenciador";
            String usuarioBanco = "postgres";
            String senhaBanco = "matheus23";

            Class.forName("org.postgresql.Driver");

            conexao = DriverManager.getConnection(stringConexao + nomeBanco,
                    usuarioBanco, senhaBanco);

        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            conexao = null;
        }
        
        return conexao;
    }
}
