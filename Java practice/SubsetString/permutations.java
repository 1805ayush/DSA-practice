import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        //permutationSet("", "abc");

        System.out.println(permutationList("", "abc"));
        System.out.println(permutationCount("", "abc"));
    }

    static void permutationSet(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String last = p.substring(i);

            String newp = first + up.charAt(0) + last;
            permutationSet(newp,up.substring(1));
        }

    }

    static ArrayList<String> permutationList(String p,String up){      
        ArrayList<String> output = new ArrayList<String>();
        if(up.isEmpty()){
            output.add(p);
            return output;
        }
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String last = p.substring(i);
            String newp = first + up.charAt(0) + last;
            ArrayList<String> newList = permutationList(newp,up.substring(1));
            output.addAll(newList);
            
        }
        return output;
    }

    static int permutationCount(String p,String up){      
        int count = 0;
        if(up.isEmpty()){
           count++;
           return count;
        }
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String last = p.substring(i);
            String newp = first + up.charAt(0) + last;
            count = count+ permutationCount(newp,up.substring(1));
            
        }
        return count;
    }
}
