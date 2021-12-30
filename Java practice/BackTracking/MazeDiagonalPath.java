import java.util.ArrayList;

public class MazeDiagonalPath {

    //allowed moves right and down and diagonal
    //target is (1,1)

    public static void main(String[] args) {
        System.out.println(countPaths(3,3));
        System.out.println(printPaths("",3,3));
    }
    static int countPaths(int r,int c){
        if(r==1&&c==1){
            return 1;
        }
        if(r>0 && c>0){
            int left = countPaths(r-1,c);
            int right = countPaths(r,c-1);
            int diagonal = countPaths(r-1,c-1);
            
            return left + right + diagonal;
        }
        return 0;
    }

    static ArrayList<String> printPaths(String p,int r,int c) {
        ArrayList<String> output = new ArrayList<String>();
        if(r==1&&c==1){
            output.add(p);
            return output;
        }
        if(r>0&&c>0){
        ArrayList<String> left = printPaths(p+"D",r-1,c);
        ArrayList<String> right = printPaths(p+"R",r,c-1);
        ArrayList<String> diagonal = printPaths(p+"d",r-1,c-1);
        output.addAll(left);
        output.addAll(right);
        output.addAll(diagonal);
        return output;
        }
        return output;
    }
    
}
