import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";
        System.out.println("Please type in something (put stop to stop)");
        userInput = keyboard.next();

        while (!userInput.equalsIgnoreCase("stop")) {
            System.out.println(userInput);
            System.out.println("Please type in something (put stop to stop)");
            userInput = keyboard.nextLine();
        }
        System.out.println("Goodbye");
    }
}