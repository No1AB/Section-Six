import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe1 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");

            char[][] board = {
              {'_', '_', '_'},
              {'_', '_', '_'},
              {'_', '_', '_'}
            };

            printBoard(board);
            askUser(board);
            
            for (int i = 0; i < 9; i++) {
              if (i%2 == 0) {
                System.out.println("Turn: X");
                int[] spot = askUser(board);
                printBoard(board);               
              } else {
                System.out.println("Turn: O");                
                int[] spot = askUser(board);
                printBoard(board);
              }
            } 

              /*
              {  Task 3: Loop through turns.

                  if (X) turn {
                     Task 4: call askUser(). 
                     Task 5: populate the board using askUser's return value.
                  } else {
                      Task 4: call askUser(). 
                      Task 5: populate the board using askUser's return value. Then, print it.

                  }

                Task 6 - Call the function.
                   if return value == 3 {
                     print: X wins and break the loop
                  } else if return value == -3 {
                     print: O wins and break the loop
                  }

              } 
              */

            scan.close();
        }

    public static void printBoard(char[][] board) {
      for (int i = 0; i < board.length; i++) {
        System.out.print("\n\t");
        for (int j = 0; j < board[i].length; j++)
        System.out.print(board[i][j] + " ");
      }
      System.out.println("\n");
    }

    public static int[] askUser(char[][] board) {
      System.out.print("Pick the row and column number:");
      int row = scan.nextInt();
      // System.out.println("Now pick the column:");
      int column = scan.nextInt();
      return new int[]{row, column};  
    }

   
    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */


}
