package matrix;

import java.util.Scanner;

public class multiplicationmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first matrix row");
        int row=sc.nextInt();
        System.out.println("enter first matrix coloumns");
        int col=sc.nextInt();

        int[][] a=new int[row][col];
        System.out.println("enter first matrix elements");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println();     

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            } System.out.println();
        }

        System.out.println("enter second matrix row");
        int row2=sc.nextInt();
        System.out.println("enter second matrix coloumn");
        int col2=sc.nextInt();
        int[][] b=new int[row2][col2];
        if(col==row2){
            System.out.println("enter second matrix elements");
            for(int i=0;i<b.length;i++){
                for(int j=0;j<b[0].length;j++){
                    b[i][j]=sc.nextInt();
                }
            }
            System.out.println();     

            for(int i=0;i<b.length;i++){
                for(int j=0;j<b[0].length;j++){
                System.out.print(b[i][j]+" ");
                }System.out.println();
            }
            

            int[][] c=new int[row][col2];
            for(int i=0;i<row;i++){
                for(int j=0;j<col2;j++){
                    int sum=0;
                    for(int k=0;k<row2;k++){
                        sum=sum+a[i][k]*b[k][j];
                        c[i][j]=sum;
                    }System.out.print(c[i][j]+" ");
                }System.out.println();
            }

        }
        else System.out.println("please enter correct matrix elements");
        }
}
