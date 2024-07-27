import java.util.Scanner;

public class GreetUserProgram1_2 {
    public static void main(String[] args) {

        // creating Scanner object for reading from keyboard
        Scanner obj1 = new Scanner(System.in);
        String userName = obj1.nextLine();
        System.out.println("Hello " + userName + "!");

        // close the Scanner object
        obj1.close();
    }
}