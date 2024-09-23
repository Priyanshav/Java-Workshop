import java.util.*;

public class inputElement{
    public static void main(String[] args) {
        int n;
        Scanner g = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = g.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = g.nextInt();
        }
        System.out.print("The array is: ");
        for(int i=0;i<n;i++){
            if(i<n-1){
                System.out.print(arr[i] + ", ");
            }
            else{
                System.out.println(arr[i]);
            }
        }
        
        int ind,elem;
        System.out.println("Enter an element: ");
        elem = g.nextInt();
        System.out.println("Enter the index at which you want that element: ");
        ind = g.nextInt();
        for(int i=0;i<n;i++){
            if(i == ind){
                arr[i] = elem;
            }
        }
        System.out.print("The updated array is: ");
        for(int i=0;i<n;i++){
            if(i<n-1){
                System.out.print(arr[i] + ", ");
            }
            else{
                System.out.println(arr[i]);
            }
        }
    }
}   