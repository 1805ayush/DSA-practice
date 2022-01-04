import java.util.Arrays;

public class MinSidewayJumps {

// There is a 3 lane road of length n that consists of n + 1 points labeled from 0 to n. A frog starts at point 0 in the 
//second lane and wants to jump to point n. However, there could be obstacles along the way.

// You are given an array obstacles of length n + 1 where each obstacles[i] (ranging from 0 to 3) describes an obstacle
// on the lane obstacles[i] at point i. If obstacles[i] == 0, there are no obstacles at point i. There will be at most 
//one obstacle in the 3 lanes at each point.

// For example, if obstacles[2] == 1, then there is an obstacle on lane 1 at point 2.
// The frog can only travel from point i to point i + 1 on the same lane if there is not an obstacle on the lane at 
//point i + 1. To avoid obstacles, the frog can also perform a side jump to jump to another lane 
//(even if they are not adjacent) at the same point if there is no obstacle on the new lane.

// For example, the frog can jump from lane 3 at point 3 to lane 1 at point 3.
// Return the minimum number of side jumps the frog needs to reach any lane at point n starting from lane 2 at
// point 0.
    public static void main(String[] args) {
        int[] obstacles = {0,1,2,3,0};
        boolean[][] maze = new boolean[3][obstacles.length];
        for(int i=0;i<3;i++) {
            for(int j=0;j<obstacles.length;j++){
            maze[i][j]=true;
            }
        }
        for (int k = 0; k< obstacles.length; k++) {
            if (obstacles[k]!=0) {
                //System.out.println(obstacles[k]);
                maze[obstacles[k]-1][k]=false;                
            }
        }

        // for (boolean[] bs : maze) {
        //     System.out.println(Arrays.toString(bs));
        // }
       allPath("",maze,1,0);
    }

    

    static void allPath(String p, boolean[][] maze, int r, int c){
        // int count = 0;        
        // if(c==obstacles.length-1){
        //     System.out.println(p);
        //     count++;
        //     return count;
        // }
        // if(obstacles[c]==r){
        //     return 0;
        // }
        // else if(obstacles[c]==0 && r>0){
        //     if(r<3){
        //         count+=countPath(p+"U", obstacles,r+1,c);
        //     }
        //     if(r>1){
        //         count+=countPath(p+"D",obstacles,r-1,c);
        //     }
        //     if(c<obstacles.length){
        //         count+=countPath(p+"F",obstacles, r, c+1);
        //     }
        // }
        // return count;

        if (c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1) {
            allPath(p + 'R', maze, r, c+1);
        }

        if (r > 0) {
            allPath(p + 'U', maze, r-1, c);
        }

        // if (c > 0) {
        //     allPath(p + 'L', maze, r, c-1);
        // }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }
}
