import java.util.Scanner;
public class HOAY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hey, what's your name?");
        String name = in.nextLine();
        System.out.print("Ok, " + name +", how old are you?");
        int age = in.nextInt();
        if (age <= 16){
        System.out.println("You can't drive." + "\nYou can't vote." + "\nYou can't rent a car.");
        }
        else if (age <= 18){
        System.out.println("You can't vote." + "\nYou can't rent a car.");
    }
        else if (age <= 25){
        System.out.println("You can't rent a car.");
        }
        else if (age >=25){
        System.out.println("You can do anything that's legal.");
        }
        in.close();
    }
}