import java.util.ArrayList;

public class CricularGame {

    public static void main(String[] args) {
        System.out.println(findTheWinner(5,2));
    }

    static int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            list.add(i+1);
        }
        //linear way:
//         int index = 0;
//         for(int i=0;i<n-1;i++){
//             index = (index+k-1)%(list.size());
//             list.remove(index);
//         }
        
//         return list.get(0);       
        

    //recursive way
        return helper(list,k,0);
    }
    
    static int helper(ArrayList<Integer> friends, int k,int start){
        
        if(friends.size()==1){
            return friends.get(0);
        }
        System.out.println(start);
        int index = removeFriends(friends, start,k);
        System.out.println(index);
        
        if(index==friends.size()){
            return helper(friends, k,0);
        }
        return helper(friends,k,index);
    }
    
    static int removeFriends(ArrayList<Integer> friends, int index,int k){
        
         
            index = (index+k-1)%(friends.size());  
            System.out.println(index);
            friends.remove(index);
            return index;
        
        
    }
}
