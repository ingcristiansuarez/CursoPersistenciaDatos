import java.util.Scanner;

public class MessagesService {

    public static void createMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the message: ");
        String message = sc.nextLine();

        System.out.println("Write your name");
        String name = sc.nextLine();

        Messages register = new Messages();
        register.setMessage(message);
        register.setAuthorMessages(name);

        DAOMessages.createMessageDB(register);

    }

    public static void listMessage(){

    }

    public static void deleteMessage(){

    }

    public static void upgradeMessage(){

    }

}
