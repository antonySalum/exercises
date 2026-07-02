import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a description of class Arrays2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arrays2
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String[] hotBar = {"Diamond pickaxe","Spyglass","Iron sword","Coal","Grass block"}; 

        for(String item : hotBar){
            System.out.println(item);
        }

        Arrays.sort(hotBar);

        for (String item : hotBar){
            System.out.println(item);
        }

        String english[]={"one","two","three"};
        String portuguese[]={"um","dois","tres"};

        System.out.println("Enter a number in English");
        String entered = keyboard.nextLine();
        for (int i=0; i< english.length; i++)
            if (entered.equals(english[i]))
               System.out.println("The portuguese word for "+entered+" is "+portuguese[i]);
    }
}