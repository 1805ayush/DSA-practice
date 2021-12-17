import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        System.out.println(diceAdd("",4));
    }

    static ArrayList<String> diceAdd(String p , int target){
        ArrayList<String> result = new ArrayList<String>();
        if(target ==0){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        for (int i = 1; i <=6 && i<=target; i++) {
            result.addAll(diceAdd(p+i,target-i));
        }
        return result;
    }
}
