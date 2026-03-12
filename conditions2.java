import java.util.Scanner;
/**
 * Write a description of class conditions1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class conditions2
{
    public static void main(String[] args)
    { 
    Scanner keyboard = new Scanner(System.in);
    System.out.println("enter with a number");
    int number = keyboard.nextInt();
    int firstnumber = number/10;
    int secondnumber = number%10;
    if (firstnumber == 1){
            System.out.print("");
        }else  if(firstnumber == 2){
            System.out.print("rua");
        }else if (firstnumber == 3){
            System.out.print("toru");
        }else if(firstnumber == 4){
            System.out.print("whā");
        }else if (firstnumber == 5){
            System.out.print("rima");
        }else if(firstnumber == 6){
            System.out.print("ono");
        }else if (firstnumber == 7){
            System.out.print("whitu");
        }else if (firstnumber == 8){
            System.out.print("waru");
        } else if (firstnumber == 9){
            System.out.print("iwa");
        } 
        if (firstnumber ==0) 
            System.out.print("");
        else if (secondnumber == 0){
            System.out.print(" tekau");
        } else {
        System.out.print(" tekau ma ");
    }
        if (secondnumber == 1) {
            System.out.print("tahi");
        }else  if(secondnumber == 2){
            System.out.print("rua");
        }else if (secondnumber == 3){
            System.out.print("toru");
        }else if(secondnumber == 4){
            System.out.print("whā");
        }else if (secondnumber == 5){
            System.out.print("rima");
        }else if(secondnumber == 6){
            System.out.print("ono");
        }else if (secondnumber == 7){
            System.out.print("whitu");
        }else if (secondnumber == 8){
            System.out.print("waru");
        } else if (secondnumber == 9){
            System.out.print("iwa");
        } 
    }  
}