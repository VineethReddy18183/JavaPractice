import java.util.*;
public class TicTacToe {
    public static void main(String args[])
    {
        char board[][] = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
        printBoard(board);
        
    }
    public static void printBoard(char [][] board)
    {
        for(int i = 0;i<board.length;i++)
        {
            System.out.println(board[i]);
        }
    }
    
}
