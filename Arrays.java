import java.util.Scanner;
/**
 * Write a description of class Arrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arrays
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String[] suits = {"Clubs","Spades","Hearts","Diamonds"}; 
        String[] faces = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        String[] player1Hand = new String[6];
        for (int i=0; i<player1Hand.length; i++){
            int randomSuits = (int)(Math.random() * suits.length);
            int randomFaces = (int)(Math.random() * faces.length);
            player1Hand[i] = faces[randomFaces] + " of " + suits[randomSuits];
        }
        /*System.out.println(player1Hand);*/

        for (int i=0; i<player1Hand.length; i++){
            System.out.println(player1Hand[i]);
        }

        String[] Temp= new String[29]; 
    
    }
}
    