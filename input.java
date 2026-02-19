/**
 * Write a description of class input here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;// keybord input
public class input
{  
    public static void main(String[] args){
      
     Scanner keyboard = new Scanner(System.in);
     
     System.out.println("Please enter an a integer");
     int number = keyboard.nextInt();
     
     System.out.println("Please enter a double");
     double otherNumber = keyboard.nextDouble();
     
     System.out.println("Your integer was:" + number);
     System.out.println("Your double was:" + otherNumber);
 }
}
