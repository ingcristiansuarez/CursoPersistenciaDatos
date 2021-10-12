import java.sql.Connection;

public class Inicio {

    public static  void main (String arg[]) throws Exception{
        Conexion conexion = new Conexion();
        try (Connection cnx = conexion.get_conection()){

        }
        catch (Exception e){

        }

    }
}
