import java.util.*;
public class exceptionhandling{
    public static void div(int a,int b){
        try{
            int res = a/b;
            System.out.println("Result: "+res);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by 0.");
        }
    }

    public static void arrsearch(int n,int arr[], int ind){
        try{
            System.out.println("Element at "+ ind + " is "+ arr[ind]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Index out of bound");
        }
    }
    public static void main(String[] args){
        int p,q;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter int1: ");
        p = k.nextInt();
        System.out.println("Enter int2: ");
        q = k.nextInt();
        div(p,q);

        System.out.println("Enter the number of elements of an array: ");
        int n = k.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<n;i++){
            arr[i] = k.nextInt();
        }
        System.out.println("Enter the index you want to search: ");
        int elem = k.nextInt();
        arrsearch(n, arr, elem);
    }
}