import java.util.Scanner;
/**
 * Write a description of class MoreStringMtd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MoreStringMtd
{
    public static void main(String[] arg){
    Scanner keyboard = new Scanner(System.in);
    
    // Replace
    String S1= "Antony";
    String S2= S1;
    S1=S2.replace("o","0");
    System.out.println(S1);
    
    // Converting Strings to numbers
    System.out.println("Enter a number");
    Scanner myScanner=new Scanner(System.in);
    String str=myScanner.nextLine();
    System.out.print("The number after "+str);;
    int num=Integer.parseInt(str);
    num++;
    System.out.print(" is "+num);
    
    //String.toLowerCase
    System.out.println("Enter a string: ");
    String s1 = keyboard.nextLine();
    System.out.println(s1.toLowerCase());
    
    //String.toUpperCase()
    System.out.println("Enter a string: ");
    String s2 = keyboard.nextLine();
    System.out.println(s2.toUpperCase());
    
    //Comparing Strings
    String x="twenty" ;
    String y="20";
    if (x. equals(x)) System.out.println("(1) "+x+" is the same as "+x) ;
    if (x.equals(y) ) System.out.println("(2)" +x+" is the same as "+y);
    if (x.equals("20") ) System.out.println("(3)" +x+" is the same as 20");
    if (x. equals ("twenty") ) System.out.println("(4)" +x+" is the same as twenty");
    
    if ("twenty".equals(x)) System.out.println("(5) twenty is the same as "+x); 
    if ("twenty".equals(y)) System.out.println("(6) twenty is the same as "+y) ; 
    if ("twenty".equals("twenty")) System.out.println("(7) twenty is the same as twenty"); 
    if ("twenty".equals("20")) System.out.println("(8) twenty is the same as 20");
    
    if (x==x) System.out.println("(9)" +x+" == "+x);
    if (x==y) System.out.println("(10)" +x+" == "+x);
    if (x=="twenty") System. out.println("(11)" +x+" == twenty"); 
    if (x=="20") System.out.println("(12)" +x+" == "+x) ;
    
    y= "twenty";
    if (x==y) System.out.println("(13)" +x+" == "+y) ;
    String a="tw";
    String b="enty";
    y=a+b;
    if (x==y) System.out.println("(14)"+ x+" == "+y) ;
    else System.out.println("but x is "+x+" and y is "+y) ;
    }
}
