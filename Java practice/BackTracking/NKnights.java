public class NKnights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        System.out.println(knights(board, 0,0,4));

       // knight(board, 0, 0, 4);
    }

    static int knights(boolean[][] board, int row,int column,int target){
        if(target == 0){
            displayBoard(board);
            System.out.println("__________________");
            return 1;
        }

        int count = 0;
        if (row ==board.length-1 && column ==board.length){
            return 0;
        }
        if(column == board.length){
            count+= knights(board,row+1,0,target);
            return count;
        }

        if (isSafe(board, row, column)) {
            board[row][column] = true;
            count += knights(board,row,column+1,target-1);
            board[row][column] = false;
        }

        count += knights(board,row,column+1,target);
        return count;
    }

    static void knight(boolean[][] board, int row,int column,int target){
        if(target == 0){
            displayBoard(board);
            System.out.println("__________________");
            return;
        }

        if (row ==board.length-1 && column ==board.length){
            return;
        }
        if(column == board.length){
            knight(board,row+1,0,target);
            return;
        }

        if (isSafe(board, row, column)) {
            board[row][column] = true;
            knight(board,row,column+1,target-1);
            board[row][column] = false;
        }

        knight(board,row,column+1,target);
        
    }
    

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    // do not repeat yourself, hence created this function
    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    static void displayBoard(boolean[][] board){
        for(boolean[] row : board){
            for(boolean element: row){
                if(element){
                    System.out.print("K ");
                }else{
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
}
