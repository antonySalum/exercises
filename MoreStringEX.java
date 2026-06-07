import java.util.Scanner;
/**
 * Write a description of class MoreStringEX here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MoreStringEX
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);  

        //PasswordComplexity  
        String S1 = keyboard.nextLine();
        String S2 = S1;
        S2=S2.replace("0","o"); 
        S2=S2.replace("3","e");
        S2=S2.replace("5","s");
        System.out.println(S1);
        System.out.println(S2);

        //IntsToStrings 
        System.out.println("Enter with 2 numbers");
        String Num1 = keyboard.nextLine();
        String Num2 = keyboard.nextLine();
        int Num11=Integer.parseInt(Num1);
        int Num22=Integer.parseInt(Num2);
        int Num33=Num11+Num22;
        System.out.println("The sum of the 2 numbers is " +Num33);

        //StringEquivalence
        System.out.println("Enter with 2 words");
        String S3 = keyboard.nextLine();
        String S4 = keyboard.nextLine();

    }
}
