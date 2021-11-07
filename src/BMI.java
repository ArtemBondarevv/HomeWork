import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        int weight;
        double height;
        double bmi;
        Scanner console;
        console = new Scanner (System.in);
        System.out.print("How much do you weigh (in kg)? ");
        weight = console.nextInt(); 
        System.out.print("How tall are you (in meter)? ");
        height = console.nextDouble();
        bmi= weight /(height*height);
        double weightLb;
        weightLb = weight * 2.205;
        double heightFt;
        heightFt = height * 3.2808;
        double heightInch;
        heightInch = height * 39.370;

        System.out.println("Your height (feet only) " + heightFt);
        System.out.println("Your height (inches) " + heightInch);
        System.out.println("Your height in meter " + height);
        System.out.println("Your weight in kg " + weight);
        System.out.println("Your weight in pounds " + weightLb);
        System.out.println("Your BMI is " + bmi);
        console.close();
    }
}