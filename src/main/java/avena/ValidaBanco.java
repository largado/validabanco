package avena;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ValidaBanco {
    public static void main(String[] args) throws SQLException {
        Connection conecta = DriverManager.getConnection("jdbc:oracle:thin@ip do banco de dados:1521","usuário", "senha");

        Statement consulta = conecta.createStatement();
        boolean resultado = consulta.execute("SELECT * FROM DUAL");

        System.out.println(resultado);







        conecta.close();

    }

}
