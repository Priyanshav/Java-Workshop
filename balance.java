import java.util.*;

public class balance{
    public void checkbalance(double bal){
        if(bal<1000)
        System.out.println("Balance is low");
        else
        System.out.println("Balance is Sufficient");
    }

    public static void main(String[] args){
        balance b1 = new balance();
        double amt;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter balance amount");
        amt = i.nextDouble();
        b1.checkbalance(amt);
    }
}