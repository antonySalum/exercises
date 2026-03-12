import java.util.Scanner;
/**
 * Write a description of class math here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculadora
{
    public static void main(String[] args){
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("digite um numero");
      double number = keyboard.nextInt();
      double Raizquadrada = Math.sqrt(number); 
      System.out.println("voce escolheu " + number);
      System.out.println("escolha outro numero");
      double number2 = keyboard.nextInt();
      double RaizQuadrada = Math.sqrt(number2);
      double Raizcubica = Math.cbrt(number2);
      System.out.println("A soma dos numeros escolhidos sao: " + (number + number2)); 
      System.out.println("O resultado da subtracao do primeiro pelo segundo e: " + (number - number2));
      System.out.println("O resultado da multiplicacao entre eles e: " + (number * number2));
      System.out.println("O primeiro dividido pelo segundo e: " + (number / number2));
      System.out.println("A raiz quadrada do primeiro numero escolhido e: " + Raizquadrada);
      System.out.println("A raiz quadrada do segundo numero escolhido e: " + RaizQuadrada);
      System.out.println("A somaa das raizes e: " + (Raizquadrada + RaizQuadrada));
      System.out.println("A raiz cubica do segundo numero escolhido e: " + Raizcubica);
    }
}