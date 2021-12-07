public class skipA {
    public static void main(String[] args) {
        String str = "baetteara";

        StringBuilder sb = new StringBuilder();
        skip(str, sb);
        System.out.println(sb.toString());

        System.out.println(skipVari(str));

    }

    static void skip(String str,StringBuilder answer) {
        if(str.length()==0){
            return;
        }
        if(str.charAt(0)!='a'){
            answer.append(str.charAt(0));
        }
        skip(str.substring(1,str.length()),answer);        
    }

    static String skipVari(String str) {
        if(str.length()==0){
            return "";
        }

        if(str.charAt(0)!='a'){
            return str.charAt(0) + skipVari(str.substring(1, str.length()));
        }

        return skipVari(str.substring(1, str.length()));
    }
}
