import java.sql.Connection;
import java.util.Scanner;

public class Main {

    public static  void main (String arg[]) {

        Scanner sc = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("--------------------");
            System.out.println("Apliction of messages");
            System.out.println("1 . . . . create message");
            System.out.println("2 . . . . list of message");
            System.out.println("3 . . . . edit message");
            System.out.println("4 . . . . delete message");
            System.out.println("5 . . . . exit");
            // read user option
            option = sc.nextInt();

            switch (option){
                case 1:
                    MessagesService.createMessage();
                    break;
                case 2:
                    MessagesService.listMessage();
                    break;
                case 3:
                    MessagesService.upgradeMessage();
                    break;
                case 4:
                    MessagesService.deleteMessage();
                    break;
                default:
                    break;
            }

        } while (option != 5);
/*
        Conection conection = new Conection();
        try (Connection cnx = conection.get_conection()){

        }
        catch (Exception e){

        }
*/
    }
}
