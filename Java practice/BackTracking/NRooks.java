public class NRooks {
    public static void main(String[] args) {
        int n=3;
        boolean[][] board = new boolean[n][n];
        System.out.println(rook(board, 0));
    }

    static int rook(boolean[][] board, int row){
        if(row == board.length){
            displayBoard(board);
            System.out.println("__________________");
            return 1;
        }

        int count = 0;

        for(int col = 0; col < board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += rook(board,row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col){
        //check only the columns
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        return true;

    }

    static void displayBoard(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element:row){
                if(element){
                    System.out.print("R ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
