import java.util.Scanner;
/**
 * Write a description of class math here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class math
{
    public static void main(String[] args){
      
      Scanner keyboard = new Scanner(System.in);
      double width = 1.2;
      double height = 1.8;
      double panelArea = ( width * height);
      int coverage = 16;
      double totalPanels = (coverage / panelArea);
      double answer = (coverage % panelArea); 
      System.out.println(totalPanels);
      System.out.println(answer);
    }
}