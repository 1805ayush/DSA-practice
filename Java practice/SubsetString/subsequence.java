import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        subseq("","abc");
        System.out.println(subseqList("", "123"));
    }

    static void subseq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);

            return;
        }

        char ch  = unprocessed.charAt(0);

        subseq(processed+ch, unprocessed.substring(1));
        subseq(processed, unprocessed.substring(1));
    }

    static ArrayList<String> subseqList(String processed, String unprocessed){
        ArrayList<String> result = new ArrayList<String>();
        if(unprocessed.isEmpty()){
            result.add(processed);
            return result;
        }

        char ch  = unprocessed.charAt(0);

        ArrayList<String> left = subseqList(processed+ch, unprocessed.substring(1));
        ArrayList<String> right = subseqList(processed, unprocessed.substring(1));

        left.addAll(right);
        return left;
    }
}

