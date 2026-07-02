import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a description of class SlangDictionary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SlangDictionary
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the dictionary português-english");
        System.out.println("Words avaible to check:");
        String[] words ={"Cerveja","Suco de laranja","Água","maçã","Uva","Bom dia","Boa noite","Comer","Beber","Dinheiro"};   
        String[] translations ={"Beer","Orange juice","Water","Apple","Grape","Good morning","Good night","Eat","Drink","Money"};

        for(String item : words){
            System.out.println(item);
        }

        while (true){  
            System.out.println("Type the word would you like to see translated or 'Stop' to leave and 'List' to see the list again");
            String entered = keyboard.nextLine();
            if (entered.equals("Stop")){
                System.out.println("Bye");
                break;
            }else if(entered.equals("List")){
                for(String item : words){
                    System.out.println(item);
                }
            } else 
                for (int i=0; i<words.length; i++)
                    if(entered.equals(words[i]))
                        System.out.println("The translation of "+entered+" is "+translations[i]);
        }
    }
}