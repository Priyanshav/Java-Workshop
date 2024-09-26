import java.util.*;

public class matrixsum{
    public static void add(int m, int n,int arr1[][],int arr2[][]){
        int[][] arr3 = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Resulting Matrix after Addition: ");

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
    public static void main(String[] args){
        int m,n;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for both matrices: ");
        System.out.println("Rows: ");
        m = k.nextInt();
        System.out.println("Columns: ");
        n = k.nextInt();
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];

        System.out.println("Enter elements for Matrix 1: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = k.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix 2: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j] = k.nextInt();
            }
        }
        System.out.println("Matrix 1: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Matrix 2: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(" ");
        }
        add(m,n,arr1,arr2);

    }
}