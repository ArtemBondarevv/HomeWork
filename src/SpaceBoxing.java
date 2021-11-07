import java.util.Scanner;
 
public class SpaceBoxing {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your current earth weight:");
        double weight = in.nextDouble();
        System.out.println("I have information for the following planets:" + "\f\n1. Venus   2. Mars    3. Jupiter" + "\n4. Saturn  5. Uranus  6. Neptune");
        System.out.print("\fWhich planet are you visiting?");
        int planet = in.nextInt();
        switch (planet) {
            case 1: 
            double weightOnVenus;
            weightOnVenus = weight * 0.78;
            System.out.print("Your weight would be " + weightOnVenus + " pounds on that planet.");
            break;
            case 2: 
            double weightOnMars;
            weightOnMars = weight * 0.39;
            System.out.print("Your weight would be " + weightOnMars + " pounds on that planet.");
            break;
            case 3: 
            double weightOnJupiter;
            weightOnJupiter = weight * 2.65;
            System.out.print("Your weight would be " + weightOnJupiter + " pounds on that planet.");
            break;
            case 4: 
            double weightOnSaturn;
            weightOnSaturn = weight * 1.17;
            System.out.print("Your weight would be " + weightOnSaturn + " pounds on that planet.");
            break;
            case 5: 
            double weightOnUranus;
            weightOnUranus = weight * 1.05;
            System.out.print("Your weight would be " + weightOnUranus + " pounds on that planet.");
            break;
            case 6: 
            double weightOnNeptune;
            weightOnNeptune = weight * 1.23;
            System.out.print("Your weight would be " + weightOnNeptune + " pounds on that planet.");
            break;

            }
        in.close();
    }
}