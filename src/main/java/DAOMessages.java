import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOMessages {
    public static void createMessageDB(Messages messages){
        DBConnection dbConnected = new DBConnection();

        try (Connection connected = dbConnected.get_conection()){

            PreparedStatement ps = null;
            try{
                String query="INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,? )5";
                ps = connected.prepareStatement(query);
                ps.setString(1, messages.getMessage());
                ps.setString(2, messages.getAuthorMessages());
                ps.executeUpdate();
                System.out.println("mensaje creado");

            }catch (SQLException ex){
                System.out.println(ex);
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void readMessagesDB(){



    }

    public static void deleteMessageDB(int idMessage){

    }

    public static void upgradeMessageDB(Messages messages){

    }
}
