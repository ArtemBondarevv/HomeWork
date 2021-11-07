import java.util.*;
public class KeepGuessing {
    public static void main(String[] args) {
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        int random;
        int guess;
        Random dice = new Random();
        random = dice.nextInt(1,10);
        do {Scanner in = new Scanner(System.in);
        System.out.println("Your guess:");
        guess = in.nextInt();
        System.out.println("That is incorrect. Guess again.");
        in.close();}
        while (guess != random);{
        {System.out.println("That's right! You're a good guesser.");}
        }
    }
    }