package matrix;

import java.util.Scanner;

public class sumoftwomatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows for first matrix");
        int row=sc.nextInt();
        System.out.println("enter no of coloums for first matrix");
        int col=sc.nextInt();
        int[][] a=new int[row][col];

    
        int[][] c=new int[row][col];

        System.out.println("enter first matrix elements");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
            a[i][j]=sc.nextInt();
            System.out.print(a[i][j]+" ");
        }   System.out.println();
        }

        System.out.println("enter no. of rows for second matrix");
        int row2=sc.nextInt();
        System.out.println("enter no of coloums for second matrix");
        int col2=sc.nextInt();
        int[][] b=new int[row][col];

        if(row!=row2 || col!=col2){System.out.println("please enter same rows and columns of both matrix");}
        else{

        System.out.println("enter second matrix elements");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
            b[i][j]=sc.nextInt();
            System.out.print(b[i][j]+" ");
        }   System.out.println();

    }
        
      
    System.out.println("sum of third matrix is");

        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
   }
}     



