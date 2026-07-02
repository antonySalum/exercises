import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToe
{
    static void printBoard(String[][] Myboard){
        //print the board out 
        System.out.print("\u000c");
        System.out.printf("");
        for(int x=0; x<3; x++){
            for(int y=0; y<3; y++){
                System.out.print(Myboard[x][y]+" ");
            } 
            System.out.println();
        }
    }
    
    static boolean checkWin(String[][] board){
        //check every direction for a win
         for(int i =0;i<board.length;i++){
            if((board[i][0].equals(board[i][1]))&&(board[i][0].equals(board[i][2]))){
                if (board[i][0].equals("X")){
                    System.out.print("X wins");
                    return false;
                }else if (board[i][0].equals("O")){
                    System.out.print("O wins");
                    return false;
                }
            }
            if((board[0][i].equals(board[1][i]))&&(board[0][i].equals(board[2][i]))){
                if (board[0][i].equals("X")){
                    System.out.print("X wins");
                    return false;
                }else if (board[0][i].equals("O")){
                    System.out.print("O wins");
                    return false;
                }
            }
        }
        if((board[0][0].equals(board[1][1]))&&(board[0][0].equals(board[2][2]))){
                if (board[0][0].equals("X")){
                    System.out.print("X wins");
                    return false;
                }else if (board[0][0].equals("O")){
                    System.out.print("O wins");
                    return false;
                }
        }
        if((board[0][2].equals(board[1][1]))&&(board[0][2].equals(board[2][0]))){
                if (board[0][2].equals("X")){
                    System.out.print("X wins");
                    return false;
                }else if (board[0][2].equals("O")){
                    System.out.print("O wins");
                    return false;
                }
        }
        return (true);
        
    }
    
    public static void main(String[] args){
        // make the board
        String [][] board = new String [3][3];
        // set the board up
        for(int x=0; x<3; x++){
            for(int y=0; y<3; y++){
                board[x][y]=".";
            }
        }
        printBoard(board);
        //printBoard(board);
        String currentPlayer = "X";
        boolean Playing = true;
        while(Playing==true){
            Scanner keyboard = new Scanner(System.in); 
            System.out.print("Player " + currentPlayer + ", which row you want to play ");
            int P1X = keyboard.nextInt();
            System.out.print("Player " + currentPlayer + ", which column you want to play ");
            int P1Y = keyboard.nextInt();
            board[P1X-1][P1Y-1]=currentPlayer;
            printBoard(board);
            Playing=checkWin(board); 
            if(currentPlayer.equals("X")){
                currentPlayer = "O";
            }
            else{
                currentPlayer="X";
            }

        }
    }
}