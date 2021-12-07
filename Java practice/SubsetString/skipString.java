public class skipString {
    public static void main(String[] args) {
        String str1 ="abcdapplehna";
        System.out.println(skipAppNotApple(str1));
    }

    static String skipApple(String str) {
        if(str.length()==0){
            return "";
        }

        if(!str.startsWith("apple")){
            return str.charAt(0) + skipApple(str.substring(1));
        }

        return skipApple(str.substring(5));
    }

    static String skipAppNotApple(String str) {
        if(str.length()==0){
            return "";
        }

        if(str.startsWith("apple") && !str.startsWith("app")){

            return skipAppNotApple(str.substring(3));

        }
        return str.charAt(0) + skipAppNotApple(str.substring(1));

    }
}
