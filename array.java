import java.util.*;

public class array{
    public static void main(String[] args){
        // int numbers[];
        // numbers = new int[10];
        // int numbers[] = new int[10];
        // for(int i=0;i<10;i++){
        //     numbers[i] = i;
        // }
        // for(int i=0;i<10;i++){
        //     if(i<9){
        //     System.out.print(numbers[i] + ", ");
        //     }
        //     else{
        //         System.out.print(numbers[i]);
        //     }
        // }
        // for(int i:numbers){
        //     System.out.println(i);
        // }

        int n;
        Scanner g = new Scanner(System.in);
        n = g.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = g.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i<n-1){
                System.out.print(arr[i] + ", ");
            }
            else{
                System.out.println(arr[i]);
            }
        }


        // multi-dimensional array

        // int arr[][] = {{1,2,3},{2,4,5},{4,4,5}};
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}