
/**
 * Write a description of class inputExercises here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class inputExercises
{ 
    public static void  main(String[] args){
     Scanner keyboard = new Scanner(System.in);
     
     System.out.print("Enter with a Number"); 
     double number= keyboard.nextDouble();
     
     System.out.println("Enter with other number");
     double otherNumber = keyboard.nextDouble();
     
     System.out.println("The answer of your fist pick + the second is =" + (number + otherNumber));
     System.out.println("The answer of your fist pick mutiplied by the second is =" + (number * otherNumber));
     System.out.println("The answer of your fist pick divided by the second is =" + (number / otherNumber));
     System.out.println("The answer of your second pick - the first one is =" + (otherNumber - number));
    }
}
