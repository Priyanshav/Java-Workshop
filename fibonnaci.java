import java.util.*;

public class fibonnaci{
    public static void fib(int n){
        int f1=0,f2=1,f;
        System.out.println(" 0");
        for(int i=1;i<n-1;i++){
            f = f1+f2;
            System.out.println(" "+f);
            f2 = f1;
            f1 = f;
        }
    }
    public static void main(String[] args){
        int num;
        Scanner i = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = i.nextInt();
        fib(num);
    }
}