import java.util.Scanner;
/**
 * Write a description of class mutipleconditions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mutipleconditions
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);  
    int age = -1;
    while (!((age>0 && age<51)|| (age %5 == 0))){
        System.out.println("Enter with a number:");   
        age = keyboard.nextInt(); 
    }
    }
}