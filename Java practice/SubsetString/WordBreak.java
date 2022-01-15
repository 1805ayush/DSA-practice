import java.util.ArrayList;
import java.util.*;


public class WordBreak {
    public static void main(String[] args) {
        String s = "catsanddog";
        ArrayList<String> wordDict = new ArrayList<String>(Arrays.asList("cat","cats","and","sand","dog"));

        System.out.println(wordBreak("", "", s, wordDict));
    }


    static ArrayList<String> wordBreak(String sp,String p,String up, ArrayList<String> wordDict){
        String result = p;
        ArrayList<String> words = new ArrayList<String>();
        if(up.length()==0){
            words.add(result);
            return words;
        }
        
       

        for(String word : wordDict){
            if(p.equals(word)){
                words.addAll(wordBreak(result+ " ",p,up.substring(1),wordDict));
            }else{
                words.addAll(wordBreak(result,p,up.substring(1),wordDict));
            }
        }
        return words;
    }
}
