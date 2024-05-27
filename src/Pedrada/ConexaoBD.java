package Pedrada;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static final String user="root";
    private static final String password="coutinho";
    private static String url="jdbc:mysql://127.0.0.1:3306/pedrada";


    public static Connection getConnection() {
        Connection aux = null;
        try {
            aux = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão feita com sucesso");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
            throw new RuntimeException(e);
        }
        return aux;
    }
}
