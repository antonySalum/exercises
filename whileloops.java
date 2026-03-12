import java.util.Scanner;
/**
 * Write a description of class whileloops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class whileloops
{  
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    int counter =0;
    boolean stillWriting=true;
    while (stillWriting){
        System.out.println("I must not text in class");
        //counter++;
        System.out.println("Will we go again ? (y/n) ");
        String again = keyboard.nextLine();
        if (again.equals("n")){
             stillWriting=false;
        }
    }
    }
}         