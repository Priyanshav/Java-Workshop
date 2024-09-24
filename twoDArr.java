import java.util.*;

public class twoDArr{
    public static void main(String[] args){
        int m,n;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the no. of rows and cols: ");
        m = k.nextInt();
        n = k.nextInt();
        int arr1[][] = new int[m][n];
        int arr2[][] = new int[m][n];
        int arr3[][] = new int[m][n];
        int arr4[][] = new int[m][n];
        int arr5[][] = new int[m][n];
        System.out.println("Enter the elements of 1st matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = k.nextInt();
            }
        }
        System.out.println("The 1st matrix is: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Enter the elements of 2nd matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j] = k.nextInt();
            }
        }
        System.out.println("The 2nd matrix is: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(" ");
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("The sum matrix is: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr3[i][j]+ " ");
            }
            System.out.println(" ");
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i!=j)
                arr4[i][j] = arr1[i][j] + arr2[i][j];
                // else if(i+j != m-1)                   // only central element is left with 0 value
                // arr4[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of other than diagonal is: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr4[i][j]+ " ");
            }
            System.out.println(" ");
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                arr5[i][j] = arr1[i][j] + arr2[i][j];
                if(i+j == m-1)
                arr5[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of only diagonal is: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr5[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}