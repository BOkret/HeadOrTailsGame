import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    private final int obverse = 1;
    private final int reverse = 0;
    private final int noChoice = -1;
    private int userChoice = noChoice;
    private int flipResult;

    private void showOptions(){
        System.out.println("Wybierz jedną z dwóch opcji:");
        System.out.println(obverse + " orzeł");
        System.out.println(reverse + " reszka");
    }

    void betResult(){
        showOptions();
        userChoice = input.nextInt();
    }

    void flipCoin(){
        flipResult = random.nextInt(2);
    }

    void showResult(){
        if (userChoice == flipResult) {
            if (flipResult == obverse)
                System.out.println("Brawo, wypadł orzeł, wygrywasz");
            else
                System.out.println("Brawo, wypadła reszka, wygrywasz");
        } else
            System.out.println("Twój wybór jest błędny, przegrywasz");
    }
}

