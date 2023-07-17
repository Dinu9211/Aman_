package matrix;

import java.util.Scanner;

public class transposematrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter matrix row");
        int row=sc.nextInt();
        System.out.println("enter matrix coloumns");
        int col=sc.nextInt();
        int[][] a=new int[row][col];
        int[][] b=new int [col][row];

    
        System.out.println("enter matrix elements");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println();

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
            System.out.print(a[i][j]+" ");
            }System.out.println();
        }


        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                b[i][j]=a[j][i];
        
            }
        }
System.out.println("transpose matrix is ");

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
            System.out.print(b[i][j]+" ");
            }System.out.println();
        }
    }

    
}
