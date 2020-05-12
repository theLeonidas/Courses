public class WelcomeToJava {

    String message;

    public void printMessage(){
        System.out.println(message);
    }

    public static void main(String[] args) {
        WelcomeToJava myFirstObject = new WelcomeToJava();
        myFirstObject.message = "Welcome to Java !!";
        myFirstObject.printMessage();
    }
}