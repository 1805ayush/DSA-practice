public class Fibonacci {

    public static void main(String[] args){
        
        System.out.println(fibo(6));
        
    }

    static int fibo(int num){

        if(num<2){
            return num;
        }else{
            return fibo(num-1) + fibo(num-2);
        }
    }
    
}
