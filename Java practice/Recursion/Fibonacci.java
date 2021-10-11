public class Fibonacci {

    public static void main(String[] args){
        
        System.out.println(fibo(5));
        
    }

    static int fibo(int num){

        if(num==1){
            return 1;
        }else{
            return fibo(num-1) * num;
        }
    }
    
}
