import java.util.*;

public class pattern{
    public static void main(String[] args){
        int n,i,j;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = k.nextInt();
        // for(i=0;i<=n;i++){
        //     for(j=0;j<=i;j++){
        //         System.out.print("* ");
        //     }
            // for(i=n;i>=2;i-=2){
            //     for(j=2;j<=i;j+=2){
            //         System.out.print(j+" ");
            //     }
            for(i=n;i>=1;i--){
                for(j=1;j<=i;j++){
                    System.out.print("* ");
                }
            System.out.println("\n");
        }
    }
}