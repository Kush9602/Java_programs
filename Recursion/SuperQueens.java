// People on Mars have slightly different pieces on their Chessboard. One of them is a Super-Queen.
// A Super-Queen is a combination of a Queen and a Knight.
// Our tasks is to compute the number of ways to place N Super-Queens on an N x N Chessboard such that none of the Super-Queens are 
// in conflict with each other. 

public class SuperQueens {
    public static void main(String[] args){
        int size = 10;
        int[][] chessBoard = new int[size][size];

        superQueensPos(chessBoard, "", 0);
    }

    private static void superQueensPos(int[][] board, String pos, int row){
        if(row == board.length){
            System.out.println(pos);
            return;
        }

        for(int col = 0; col < board.length; col++){
            if(isSafeForQueen(board, row, col)){
                board[row][col] = 1;
                superQueensPos(board, pos+"("+(row+1)+","+(col+1)+")", row+1);
                board[row][col] = 0;
            }
        }
    }

    private static boolean isSafeForQueen(int[][] board, int row, int col){
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == 1)
                return false;
        }

        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0 ; i--, j--){
            if(board[i][j] == 1)
            return false;
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i-- , j++){
            if(board[i][j] == 1)
            return false;
        }

        if(row - 2 >= 0 && col - 1 >= 0 ){
            if(board[row - 2][col - 1] == 1)
                return false;
        }

        if(row - 2 >= 0 && col + 1 < board.length){
            if(board[row - 2][col + 1] == 1)
                return false;
        }        

        if(row - 1 >= 0 && col - 2 >= 0){
            if(board[row - 1][col - 2] == 1)
                return false;
        }

        if(row - 1 >= 0 && col + 2 < board.length){
            if(board[row - 1][col + 2] == 1)
                return false;
        }
  
        return true;
    }
}
