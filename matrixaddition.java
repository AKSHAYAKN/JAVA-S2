import java.util.Scanner;
public class matrixaddition {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int i,j;

        System.out.println("Enter number of rows:");
        int rows=sc.nextInt();

        System.out.println("Enter number of columns:");
        int cols=sc.nextInt();

        int[][]a=new int[rows][cols];
        int[][]b=new int[rows][cols];
        int[][] sum=new int[rows][cols];

        System.out.println("Enter elements of first matrix:");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter ekements of second matrix:");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of the matruces:");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                System.out.println(sum[i][j]+"");
            }
            System.out.println();
            }
            sc.close();
        }
    
    }

