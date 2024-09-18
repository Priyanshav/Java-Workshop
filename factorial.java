import java.util.*;

public class factorial{
    public static void fact(int n){
        int facto = 1;
        for(int i=n;i>1;i--){
            facto = facto*i;
        }
        System.out.print("Factorial of number "+facto);
    }
    public static void main(String[] args){
        int num;
        Scanner i = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = i.nextInt();
        fact(num);
    }
}