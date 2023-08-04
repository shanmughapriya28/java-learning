package Functions_Lectures;

public class Stringexample {

    public static void main(String[] args) {
        //String message=greet();
        //System.out.println(message);

        String personalized = myGreet("Shanmugha Priya");
        System.out.println(personalized);
    }

    static String myGreet(String name) {
        String message = "Hello "+name;
        return message;
    }


    static String greet() {

        String greeting = "Hey hi how are you";
        return greeting;
    }
}
