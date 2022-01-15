public class KnightsTour {
    public static void main(String[] args) {
        
    }

    static void tour(boolean[][] board,int row,int col,int steps,int[][] path){
        if(steps == 0){
            path[row][col] = steps;
            displayPath(path);
            return;
        }

        if(isSafe(board, row, column)){
            board[row][col] =true;
            tour(board, row, col, steps-1, path);
            board[row][col] = false;
        }

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

        if (isValid(board, row + 2, col - 1)) {
            if (board[row + 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row + 1, col - 2)) {
            if (board[row + 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row + 2, col + 1)) {
            if (board[row + 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row + 1, col + 2)) {
            if (board[row + 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    static void displayPath(int[][] board){
        for(int[] row : board){
            for(int element: row){
               System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
