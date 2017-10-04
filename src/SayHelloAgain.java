import java.util.Scanner;

public class SayHelloAgain {

    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        String name = "Bart";
        System.out.println("Enter your Name: ");
        name = keyboard.nextLine();

        System.out.println(helloNameEng(name));
        System.out.println(helloNameFren(name));
        System.out.println(helloNameTwi(name));
        System.out.println(helloNameAfaa(name));
    }

    // english
    public static String helloNameEng(String name) {
        return "Hello, " + name + "!";
    }
     //french
    public static String helloNameFren(String name) {
        return "Bonjour, " + name + "!";
    }
    //twi
    public static String helloNameTwi(String name) {
        return "Mahai, " + name + "!";
    }
    //Afaanoromo
    public static String helloNameAfaa(String name) {
        return "Akam, " + name + "!";
    }


}
