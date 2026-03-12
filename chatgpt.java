import java.util.Scanner;

public class chatgpt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 10 and 99: ");
        int number = scanner.nextInt();

        if (number < 10 || number > 99) {
            System.out.println("Number out of range.");
        } else {

            // Tens
            if (number >= 90) {
                if (number == 90) System.out.print("iwa tekau");
                else System.out.print("iwa tekau mā ");
            } 
            else if (number >= 80) {
                if (number == 80) System.out.print("waru tekau");
                else System.out.print("waru tekau mā ");
            } 
            else if (number >= 70) {
                if (number == 70) System.out.print("whitu tekau");
                else System.out.print("whitu tekau mā ");
            } 
            else if (number >= 60) {
                if (number == 60) System.out.print("ono tekau");
                else System.out.print("ono tekau mā ");
            } 
            else if (number >= 50) {
                if (number == 50) System.out.print("rima tekau");
                else System.out.print("rima tekau mā ");
            } 
            else if (number >= 40) {
                if (number == 40) System.out.print("whā tekau");
                else System.out.print("whā tekau mā ");
            } 
            else if (number >= 30) {
                if (number == 30) System.out.print("toru tekau");
                else System.out.print("toru tekau mā ");
            } 
            else if (number >= 20) {
                if (number == 20) System.out.print("rua tekau");
                else System.out.print("rua tekau mā ");
            } 
            else { // 10–19
                if (number == 10) {
                    System.out.print("tekau");
                } else {
                    System.out.print("tekau mā ");
                }
            }

            // Ones (only if not a multiple of 10)
            if (number % 10 != 0) {
                int ones = number % 10;

                if (ones == 1) System.out.print("tahi");
                else if (ones == 2) System.out.print("rua");
                else if (ones == 3) System.out.print("toru");
                else if (ones == 4) System.out.print("whā");
                else if (ones == 5) System.out.print("rima");
                else if (ones == 6) System.out.print("ono");
                else if (ones == 7) System.out.print("whitu");
                else if (ones == 8) System.out.print("waru");
                else if (ones == 9) System.out.print("iwa");
            }

            System.out.println();
        }

        scanner.close();
    }
}