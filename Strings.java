import java.util.Scanner;
/**
 * Write a description of class Strings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Strings
{
    // first class learning strings
    public static void main(String[] args){
    Scanner keyboard= new Scanner(System.in);
    
    String s1,s2,s3,s4;
    s1="Wellington";
    s2="high";
    s3=s1.concat(s2);
    System.out.println(s3);
    s4=s1+s2;
    System.out.println(s4);
    
    String name;
    name="Bob";
    System.out.println(name.charAt(0));
    
    String namee;
    namee="Bob";
    int n=namee.length();
    System.out.println(n);
    
    String example= "testing";
    String other = "test";
    other += "ing";
    if(example==other){
        System.out.println("They really are the same thing");
    } else if(example.equals(other)){
        System.out.println("They have the same values but are diferent Strings.");
    }
    }
}