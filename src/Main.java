import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        InputManager input = new InputManager();
        IntDivider divider = new IntDivider();
        input.askForInput();
        System.out.println("Dalybos rezultatas: " + divider.divide(input.numArray));

    }
}