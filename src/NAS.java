import java.util.Scanner;
 
public class NAS {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Hello.  What is your name?");
        String name = in.nextLine();
        System.out.print("Hi," + name +"!  How old are you?");
        String age = in.nextLine();
        System.out.print("So you're " + age + ", eh? That's not old at all! How much do you make," + name + "?");
        String salary = in.nextLine();
        System.out.printf(salary + " I hope that's per hour and not per year! LOL!");
        in.close();
    }
}