//Code below belongs to TutorialsPoint.com

public class MessageUtil {


    private String message;

    public MessageUtil(String message){
        this.message = message;
    }

    public String printMessage(){
        System.out.println(message);
        return message;
    }

    public String salutationMessage(){
        message = "Hello, " + message;
        System.out.println(message);
        return message;
    }

}
