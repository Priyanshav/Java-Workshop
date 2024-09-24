import java.util.*;

public class BinarySearch{
    public static void main(String[] args){
        int n;
        Scanner g = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = g.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter a sorted array: ");
        for(int i=0;i<n;i++){
            arr[i] = g.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int num = g.nextInt();
        int i = 0;
        int j = n-1;
        int pos = 0;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == num){
                pos = mid+1;
                break;
            }
            else if(arr[mid] < num){
                i = mid+1;
            }
            else if(arr[mid] > num){
                j = mid-1;
            }
        }
        System.out.println("The element " + num + " is at "+ pos +" position.");
    }
}