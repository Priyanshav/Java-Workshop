import java.util.*;

public class palindromestring{
    public static void p1(String s1){
        int len = s1.length();
        for(int i=len;i>0;i--){
            
            String s3 = s3.concat(s2);

        }
        if(s3.equalsto(s1)){
            System.out.println("Palindrome Number!");
        }
        else{
            System.out.println("Not a Palindrome Number!");
        }
    }
    public static void main(String[] args){
        String s1;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter any string: ");
        s1 = k.nextLine();
        p1(s1);
    }
}