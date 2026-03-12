import java.util.Scanner;
/**
 * Write a description of class maths here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class maths
{
    public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter with your first grade");
      int grade1 = keyboard.nextInt();
      
      System.out.println("Enter with your second grade");
      int grade2 = keyboard.nextInt();
      
      System.out.println("Enter with your third grade");
      int grade3 = keyboard.nextInt();
      
      System.out.println("your average grade is = " + (grade1 + grade2 +grade3) /3 );
    }
}
