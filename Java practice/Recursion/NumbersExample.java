public class NumbersExample {
    public static void main(String[] args){
        num1(5);
    }

    static void num1(int num){
        
        if (num==1) {
            System.out.println(1);
        }else{
            System.out.println(num);
            num1(num-1);
        }

    }
    
}
