import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public Connection get_conection() throws SQLException {
        Connection conection = null;
        try{
            conection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mensajes_app",
                    "root",
                    ""
            );

        } catch(SQLException e){
            System.out.println(e);
        }
        return  conection;
    }

}
