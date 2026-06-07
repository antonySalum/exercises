import java.util.Scanner;
/**
 * Write a description of class ForLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForLoops
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter with a phrase");
        String Phrase = keyboard.nextLine();
        System.out.println("How many times would you like the phrase to be repeated?");
        int Times= keyboard.nextInt();
        for(int i=0; i<Times; i++){
            System.out.print(Phrase + " ");
        }
        //TimesTable 1 and 2
        for (int Num = 7;  Num < 100; Num += 7) {       
            //System.out.println(Num);
            if (Num % 5 == 0) {
                System.out.println("***"); 
            } else{
                System.out.println(Num);
            }
        }

        //Grid1
        int Rows = 6;
        int Cols = 6;
        for (int i=0; i<Rows; i++){
            for (int j=0; j<Cols; j++){
                System.out.print(i+j);
            }
            System.out.println(); 
        }   
    }
}