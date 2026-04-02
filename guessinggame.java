import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class guessinggame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class guessinggame
{
    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    Random random = new Random();
    int randomNumber = random.nextInt(100) +1; 
    System.out.println("Welcome to the guessing game");
    System.out.println("A random number between 1 to 100 was generated");
    
    System.out.println("Player 1, enter with your guess: ");
    int player1guess = keyboard.nextInt();
    
    System.out.println("Player 2, enter with your guess");
    int player2guess = keyboard.nextInt();
    
    int diferenceplayer1 = (randomNumber - player1guess);
    System.out.println(diferenceplayer1);
    int diferenceplayer2 = (randomNumber - player2guess);
    System.out.println(diferenceplayer2);
    
    System.out.println(randomNumber);
    }
}