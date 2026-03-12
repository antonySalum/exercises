import java.util.Scanner;
/**
 * Write a description of class conditions1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class conditions
{
    public static void main(String[] args)
    { 
    Scanner keyboard = new Scanner(System.in);
    System.out.println("enter with a number");
    int number = keyboard.nextInt();
    int firstnumber = number/10;
    int secondnumber = number%10;
    switch (firstnumber) {
        case 1:
            System.out.print("");
            break;
        case 2:
            System.out.print("rua");
            break;
        case 3: 
            System.out.print("toru");
            break;
        case 4:
            System.out.print("whā");
            break;
        case 5:
            System.out.print("rima");
            break;
        case 6:
            System.out.print("ono");
            break;
        case 7:
            System.out.print("whitu");
            break;
        case 8: 
            System.out.print("waru");
            break;
        case 9:
            System.out.print("iwa");
            break;
        } 
    if  (secondnumber == 0) {
       System.out.print(" tekau "); 
        } else { 
           System.out.print(" tekau ma "); 
        }
    switch (secondnumber) {
        case 1:   
            System.out.print("tahi");
        case 2:
            System.out.print("rua");
        case 3: 
            System.out.print("toru");
        case 4:
            System.out.print("whā");
        case 5:
            System.out.print("rima");
        case 6:
           System.out.print("ono");
        case 7:
            System.out.print("whitu");
        case 8:
            System.out.print("waru");
        case 9:
            System.out.print("iwa");
    } 
    }  
}