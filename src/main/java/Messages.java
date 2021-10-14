public class Messages {
    int id_message;
    String message;
    String authorMessages;
    String dateMessages;

    public Messages(){
        this.message = message;
        this.authorMessages = authorMessages;
        this.dateMessages = dateMessages;
    }

    public int getId_message() {
        return id_message;
    }

    public void setId_message(int id_message) {
        this.id_message = id_message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthorMessages() {
        return authorMessages;
    }

    public void setAuthorMessages(String authorMessages) {
        this.authorMessages = authorMessages;
    }

    public String getDateMessages() {
        return dateMessages;
    }

    public void setDateMessages(String dateMessages) {
        this.dateMessages = dateMessages;
    }
}
