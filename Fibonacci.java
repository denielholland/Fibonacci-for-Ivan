/**
 * Created by Daniel on 18.07.2017.
 */
public class Fibonacci {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + "," + b + ",");
        for(int quantity = 1; quantity <= 8; quantity++){
            c=a+b;
            if(quantity <8)
            System.out.print(c + ",");
            else
                System.out.println(c);
            a=b;
            b=c;

        }
    }
}