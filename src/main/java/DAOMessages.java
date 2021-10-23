import java.sql.*;

public class DAOMessages {
    public static void createMessageDB(Messages messages){
        DBConnection dbConnected = new DBConnection();

        try (Connection connected = dbConnected.get_conection()){

            PreparedStatement ps = null;
            try{
                String query="INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
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
        DBConnection dbConnected = new DBConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection connected = dbConnected.get_conection()){
                String query="SELECT * FROM mensajes";
                ps = connected.prepareStatement(query);
                rs= ps.executeQuery();
                while (rs.next()){
                    System.out.println("ID: " + rs.getInt("id_mensaje"));
                    System.out.println("Mensaje: "+rs.getString("mensaje"));
                    System.out.println("Autor: "+rs.getString("autor_mensaje"));
                    System.out.println("Fecha: "+rs.getString("fecha_mensaje"));
                    System.out.println("-----------");
                }
        }
        catch (SQLException e){
            System.out.println("No can't read dates");
            System.out.println(e);
        }
    }

    public static void deleteMessageDB(int idMessage){
        DBConnection dbConnected = new DBConnection();

        try (Connection connected = dbConnected.get_conection()){
            PreparedStatement ps = null;
            try {
                String query="DELETE FROM mensajes WHERE mensajes.id_mensaje = ?";
                ps = connected.prepareStatement(query);
                ps.setInt(1, idMessage);
                ps.executeUpdate();
                System.out.println("The message "+idMessage + " was deleted");
            }catch(SQLException e) {
                System.out.println(e);
                System.out.println("No possible delete message");
            }
        }
        catch (SQLException e){
            System.out.println(e);

        }
    }

    public static void upgradeMessageDB(Messages messages){

    }
}
