import java.util.Scanner;
/**
 * Write a description of class conditions1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class conditions1
{
    public static void main(String[] args)
    { 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = keyboard.nextInt();
    
        if (age < 18){    
            System.out.println("too young for yhe club");
            System.out.println("How much will you bribe me to get in?");
            int bribe = keyboard.nextInt();
            
            if(bribe >= 20){
               System.out.println("You may enter");
            } else {
                System.out.println("Go home you scoundrel");
            }    
        } else {
          System.out.println("you may enter");  
        }
    }   
}  
