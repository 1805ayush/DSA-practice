import java.util.ArrayList;

public class MazeWithObstacles {

    //obstacles (1,1)
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true,true},
            {true,false,true},
            {true,true,true},
        };
        System.out.println(countPaths(0,0));
        System.out.println(printPaths("",board,0,0));
    }

    static int countPaths(int r,int c){
        int count = 0;
        if(r==2&&c==2){
            return 1;
        }
        if(r==1&&c==1){
            return count;
        }        
        else if(r<3&&c<3){

        int left = countPaths(r+1,c);
        int right = countPaths(r,c+1);
        count = left + right;
        }
        return count;
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
        if(r<maze.length-1){
            output.addAll(printPaths(p+"D",maze,r+1,c));
        }
        if(c<maze[0].length-1){
            output.addAll(printPaths(p+"R",maze,r,c+1));
        }
        return output;
    }

}
