/**
 * Created by Daniel on 18.07.2017.
 */
public class Fibonacci {
    public static void main(String[] args){
        int a = 1;
        int b = 1;
        int c;
        for(byte quantity = 1; quantity <= 10; quantity++){
            c=a+b;
            System.out.println(a + "+" + b + "=" + c);
            a=b;
            b=c;

        }
    }
}
