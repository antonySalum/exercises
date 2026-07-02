import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSort
{
    public static void main(String[] args){
        int[] numbers = {7,12,14,3,8,9,6,1,4};
        int count = 0;
        int temp = 0;
        for(int j=0; j<numbers.length; j++){
            for(int i=0; i<numbers.length - (1+j); i++){
                if (numbers[i]>numbers[i+1]){
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    
                }
                count++;
            }
            for(int i=0; i<numbers.length; i++){
                System.out.print(numbers[i]+", ");
            }
            System.out.println();
        }
        System.out.println(count);
    }
}