import java.util.Scanner;
/**
 * Write a description of class StringEX here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringEX
{
    //Strings exercises
    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);    
    // EX1/2
    String A1;
    A1 = keyboard.nextLine();
    String A2;
    A2 = keyboard.nextLine();
    System.out.println(A1);
    System.out.println(A2);
    //EX3
    String A3;
    A3 = A1+A2; 
    //EX4
    System.out.println(A3);
    int n=A3.length();
    System.out.println(A3.charAt(n-1));
    //EXpasswordchecker
    String Pass;
    Pass = "password";
    String input = "";
    while (!(Pass.equals(input))){
        input= keyboard.nextLine();
    }
    
    String A4 = "Thomas";
    System.out.println(A4);
    int len = A4.length();
    int inverse = len-1;
    while (inverse>=0){
        System.out.print(A4.charAt(inverse));
        inverse--;
    }
    }
}