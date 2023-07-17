package matrix;

import java.util.Scanner;

public class horizontalflip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter matrix row");
        int row=sc.nextInt();
        System.out.println("enter matrix coloumn");
        int col=sc.nextInt();
        int [][] a=new int[row][col];
        int [][] b=new int[row][col];
        System.out.println("enter elements");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
              System.out.print(a[i][j]+ " ");
            }System.out.println();
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                b[i][j]=a[i][col-1-j];
               
                
            }
        }System.out.println();
        System.out.println(" horizontally flip matrix is");

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
              System.out.print(b[i][j]+ " ");
            }System.out.println();
        }
    }
    
}
