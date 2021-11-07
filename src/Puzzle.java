import java.util.*;
import java.io.*;
public class Puzzle{
  public static void main(String[] args) throws Exception{

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Open which file: ");
    
    String file = keyboard.nextLine();
    System.out.println();

    File in = new File(file);
    Scanner input = new Scanner(in);

    String puzzletxt=input.nextLine();
    input.close();

    for(int i=0; i<puzzletxt.length(); i++){
      if ( (i+1) % 3 == 0 )
        System.out.print( puzzletxt.charAt(i) );
    }
    System.out.println();
    keyboard.close();
  }
}