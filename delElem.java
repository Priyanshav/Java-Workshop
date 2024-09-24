import java.util.*;

public class delElem{
    public static void main(String[] args){
        int n;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = i.nextInt();
        int arr[] = new int[n];
        for(int j=0;j<n;j++){
            arr[j] = i.nextInt();
        }
        System.out.print("The array is: ");
        for(int j=0;j<n;j++){
            if(j<n-1){
                System.out.print(arr[j] + ", ");
            }else{
                System.out.println(arr[j]);
            }
        }
        int del,temp;
        System.out.println("Enter an element to delete: ");
        del = i.nextInt();
        for(int j=0;j<n;j++){
            if(arr[j] == del){
                temp = arr[j];
                for(int k=j;k<n-1;k++){
                    arr[k] = arr[k+1];
                }
                arr[n-1] = temp;
            }
        }

        System.out.print("New array is: ");
        for(int j=0;j<n-1;j++){
            if(j<n-2){
                System.out.print(arr[j] + ", ");
            }else{
                System.out.println(arr[j]);
            }
        }
    }
}