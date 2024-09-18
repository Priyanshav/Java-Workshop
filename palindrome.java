import java.util.*;
class palindrome{
    public void isPalindrome(int num){
        int a=num,r=0,d;
        while(num!=0){
            d=num%10;
            r=r*10+d;
            num = num/10;
        }
        if(r == a){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a plaindrome!");
        }
    }
    public static void main(String[] args){
        int n;
        palindrome p1 = new palindrome();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any number: ");
        n = s1.nextInt();
        p1.isPalindrome(n);
    }
}