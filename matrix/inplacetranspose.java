package matrix;

import java.util.Scanner;

public class inplacetranspose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter matrix row");
        int row=sc.nextInt();
        System.out.println("enter matrix coloumns");
        int col=sc.nextInt();
        int[][] a=new int[row][col];
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
            }    
            System.out.println();
}    


        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a[0].length;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
             }
    
        }
        System.out.println("transpose matrix is");

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }    
            System.out.println();
        }    
    }
}        