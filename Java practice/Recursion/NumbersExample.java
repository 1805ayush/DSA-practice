public class NumbersExample {
    public static void main(String[] args){
        num1(5);
    }

    static void num1(int num){
        
        if (num==1) {
            System.out.println("*");
        }else{
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
           // System.out.println(num);
            num1(num-1);
        }

    }
    
}
