import java.util.Random;
public class Dice{
    public static void main(String[] args) {
        Random dice = new Random();
        System.out.println("HERE COMES THE DICE!");
        int dice1 = dice.nextInt(1,7);
        int dice2 = dice.nextInt(1,7);
        int sum = dice1 + dice2;
        
        System.out.println("Roll #" + dice1);
        System.out.println("Roll #" + dice2);
        System.out.println("The total is " + sum);
    }
}