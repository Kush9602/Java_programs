public class KnightTour {
    public static void main(String[] args){
        int size = 5;
        int[][] chessBoard = new int[size][size];

        // boolean[][] visited = new boolean[size][size];
        printTour(chessBoard, 2, 2, 1);
    }

    private static void printTour(int[][] board, int row, int col, int move){
        if(row  < 0 || row >= board.length || col < 0 || col >= board.length || board[row][col] != 0)
            return;
        else if(move == board.length * board.length){
            board[row][col] = move;
            printBoard(board);
            board[row][col] = 0;
            return;
        }    


        board[row][col] = move;
        printTour(board, row - 2, col + 1, move + 1);    // top right
        printTour(board, row - 1, col + 2, move + 1);    // right top right
        printTour(board, row + 1, col + 2, move + 1);    // right down right
        printTour(board, row + 2, col + 1, move + 1);    // down right
        printTour(board, row + 2, col - 1, move + 1);    // down left
        printTour(board, row + 1, col - 2, move + 1);    // left down left
        printTour(board, row - 1, col - 2, move + 1);    // left top left
        printTour(board, row - 2, col - 1, move + 1);    // top left
        board[row][col] = 0;
    }

    private static void printBoard(int[][] arr){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr.length; col++)
                System.out.print(arr[row][col] + "  ");
            System.out.println();
        }
        System.out.println();
    }
    
}
