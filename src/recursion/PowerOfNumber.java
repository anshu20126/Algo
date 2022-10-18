package recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        int result =power(3,4);
        System.out.println(result);

    }
    public static int power(int base,int exp){
        if(exp<0){
            return -1;
        }
        if(exp==0||exp==1){
            return base;
        }
        return base * power(base,exp-1);
    }
}
