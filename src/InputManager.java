import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {
    String[] numArray = new String[2];
    Scanner scanner = new Scanner(System.in);

    private int insertDigit(){
        System.out.println("Iveskite skaiciu: ");
        try {
            int number = scanner.nextInt();
            return number;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Neteisingai ivedete. Turite ivesti skaiciu.");
            return insertDigit();
        }
    }

    public void askForInput(){
        numArray[0] = String.valueOf(insertDigit());
        numArray[1] = String.valueOf(insertDigit());
        scanner.close();
    }

}
