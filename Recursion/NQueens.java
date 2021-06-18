// we have to put N number of queens in N x N chess board such that no queen will kill other queen.

public class NQueens {
    public static void main(String[] args){
        int size = 5;

        int[][] chessBoard = new int[size][size];
        printQueen(chessBoard, "", 0);
    }

    private static void printQueen(int[][] board, String pos, int row){
        if(row == board.length){
            System.out.println(pos);
            return;
        }


        for(int col = 0; col < board.length; col++){
            if(safePosForQueen(board, row, col)){
                board[row][col] = 1;
                printQueen(board,pos + "(" + row + "," + col + ") ", row + 1);
                board[row][col] = 0;
            }
            
        }
    }

    private static boolean safePosForQueen(int[][] chess, int row, int col){
        for(int i = row - 1; i >= 0; i--){
            if(chess[i][col] == 1)
                return false;
        }

        for(int i = row - 1, j = col + 1;  i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1)
                return false;
        }

        for(int i = row - 1, j = col - 1;  i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1)
                return false;
        }

        return true;
    }   
}
