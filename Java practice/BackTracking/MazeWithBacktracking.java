import java.util.ArrayList;

public class MazeWithBacktracking {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true,true},
            {true,true,true},
            {true,true,true},
        };
        System.out.println(countPaths("",board,0,0));
        System.out.println(printPaths("",board,0,0));
    }
    static int countPaths(String p,boolean[][] maze,int r,int c) {
        int result= 0;
        if(r==maze.length-1&&c==maze[0].length-1){
            result++;
            return result;
        }
        if(!maze[r][c]){
            return result;
        }

        maze[r][c] = false;

        if(r<maze.length-1){
            result = result + countPaths(p+"D",maze,r+1,c);
           // output.addAll(printPaths(p+"D",maze,r+1,c));
        }
        if(c<maze[0].length-1){
            result = result + countPaths(p+"R",maze,r,c+1);

            //output.addAll(printPaths(p+"R",maze,r,c+1));
        }
        if(r>0){
            result = result + countPaths(p+"U",maze,r-1,c);

            //output.addAll(printPaths(p+"U",maze,r-1,c));
        }
        if(c>0){
            result = result + countPaths(p+"L",maze,r,c-1);

            //output.addAll(printPaths(p+"L",maze,r,c-1));
        }

        maze[r][c] = true;

        return result;
    }


    static ArrayList<String> printPaths(String p,boolean[][] maze,int r,int c) {
        ArrayList<String> output = new ArrayList<String>();
        if(r==maze.length-1&&c==maze[0].length-1){
            output.add(p);
            return output;
        }
        if(!maze[r][c]){
            return output;
        }

        maze[r][c] = false;

        if(r<maze.length-1){
            output.addAll(printPaths(p+"D",maze,r+1,c));
        }
        if(c<maze[0].length-1){
            output.addAll(printPaths(p+"R",maze,r,c+1));
        }
        if(r>0){
            output.addAll(printPaths(p+"U",maze,r-1,c));
        }
        if(c>0){
            output.addAll(printPaths(p+"L",maze,r,c-1));
        }

        maze[r][c] = true;

        return output;
    }


}
