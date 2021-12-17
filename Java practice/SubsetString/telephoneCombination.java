import java.util.ArrayList;

public class telephoneCombination {
    
    public static void main(String[] args) {
        String processed = "";
        String unprocessed = "12";
        //printCombo(processed, unprocessed);
        System.out.println(addCombo(processed, unprocessed)); 
        int i = countCombo(processed, unprocessed);
        System.out.println(i);
 
    }

    static void printCombo(String p, String up){
        //ArrayList<String> list = new ArrayList<String>();
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int upFirstIndex = up.charAt(0) - '0';
        for(int i =(upFirstIndex-1)*3;i<upFirstIndex*3;i++){
            char c =(char) ('a'+i);
            printCombo(p+c, up.substring(1));
        }
    }

    static ArrayList<String> addCombo(String p, String up){
         ArrayList<String> result = new ArrayList<String>();
         if(up.isEmpty()){
            result.add(p);
            return result;
        }
        int upFirstIndex = up.charAt(0) - '0';
        for(int i =(upFirstIndex-1)*3;i<upFirstIndex*3;i++){
            char c =(char) ('a'+i);
            ArrayList<String> temp =  addCombo(p+c, up.substring(1));
            result.addAll(temp);
        }

        return result;
    }

    static int countCombo(String p, String up){
        int result = 0;
        if(up.isEmpty()){
           result = 1;
           return result;
       }
       int upFirstIndex = up.charAt(0) - '0';
       for(int i =(upFirstIndex-1)*3;i<upFirstIndex*3;i++){
           char c =(char) ('a'+i);
           int temp = countCombo(p+c, up.substring(1));
           result = result + temp;
       }

       return result;
   }
}
