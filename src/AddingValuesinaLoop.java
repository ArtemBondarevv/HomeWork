import java.util.Scanner;

public class AddingValuesinaLoop {
    public static void main(String[] args) {
        System.out.println("I will add up the numbers you give me.");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        while  ( number !=0 ){
            sum = sum + number;
            System.out.println("The total so far is " + sum);    
            System.out.print("Number:");
            number = sc.nextInt();
        }
        System.out.print("The total is " + sum); 
     sc.close();
    }

}
