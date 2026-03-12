import java.util.Scanner;
/**
 * Write a description of class whileloopsexer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class whileloopsexer{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);  
    int number = 1;
    while (number<=100){
    if (number % 5 == 0){
        System.out.println(number);
    }
    number++;
    }
    int counter = 1;
    while (counter<=10){
        System.out.println(counter);
        counter ++;
    }
    boolean loopy = true;
    while (loopy){
        System.out.println("I'm going absolutely loopy");
        System.out.println("Would you like to go again yes(1) or no(0)?");
        int answer = keyboard.nextInt();
     if (answer == 0){
            loopy = false;
    } else if(answer >1) 
        System.out.println("this is not a correct number");
    }
    }
}
