public class SudokuSolver {
    public static void main(String[] args){
        int[][] suduko = {  {0, 5, 0, 0, 0, 0, 0, 0, 9},
                            {0, 0, 1, 0, 0, 0, 2, 0, 0},
                            {0, 4, 0, 0, 6, 2, 0, 0, 0},
                            {0, 0, 0, 0, 3, 0, 0, 1, 0},
                            {0, 0, 0, 0, 0, 0, 9, 7, 8},
                            {0, 0, 0, 4, 1, 0, 0, 5, 0},
                            {7, 0, 8, 0, 0, 1, 0, 0, 0},
                            {9, 0, 0, 7, 0, 0, 5, 0, 0},
                            {0, 0, 0, 8, 0, 0, 0, 0, 0},
                         };

        sudokuSolver(suduko, 0, 0);
    }

    private static void sudokuSolver(int[][] suduko, int row, int col){
        if(row == suduko.length-1 && col == suduko.length-1){
            printSuduko(suduko);
            return;
        }

        if(col == suduko.length){
            col = 0;
            sudokuSolver(suduko, row+1, col);
            return;
        }

        if(suduko[row][col] != 0){
            sudokuSolver(suduko, row, col+1);
            return;
        }

        for(int num = 1; num <= 9; num++){
            if(isPossible(suduko, num, row, col)){
                suduko[row][col] = num;
                sudokuSolver(suduko,row, col+1);
                suduko[row][col] = 0;
            }
        }
    }

    private static boolean isPossible(int[][] suduko, int num, int row, int col){
        for(int i = 0; i < suduko.length; i++){
            // check horizontally for same number
            if(suduko[row][i] == num)
                return false;
            
            // check vertically for same number
            if(suduko[i][col] == num)
                return false;
        }

        int row_start = blockRange(row);
        int col_start = blockRange(col);

        // check for the number in 3 x 3 block
        for(int i = row_start; i < row_start + 3; i++){
            for(int j = col_start; j < col_start + 3; j++){
                if(suduko[i][j] == num)
                    return false;
            }
        }

        return true;
    }

    private static int blockRange(int point){
        if(point >= 0 && point <= 2)
            return 0;
        if(point >= 3 && point <= 5)
            return 3;
        else
            return 6;
    }

    private static void printSuduko(int[][] suduko){
        for(int i = 0; i < suduko.length; i++){
            for(int j = 0; j < suduko.length; j++){
                System.out.print(suduko[i][j] + " ");
            }
            System.out.println();
        }
    }
}
