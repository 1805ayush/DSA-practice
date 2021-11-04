public class magicNumber {
    public static void main(String[] args) {
        System.out.println(findMagicNumber());
    }

    static int findMagicNumber(){

        int num=6;
        int base=5;
        int magicNum=0;
        while(num>0){
            magicNum=magicNum+ base *(num & 1);
            num= num>>1;
            base =base*5;
        }
        return magicNum;
    }
}
