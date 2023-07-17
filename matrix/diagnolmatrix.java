package matrix;

import java.util.Scanner;

public class diagnolmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows ");
        int row=sc.nextInt();
        System.out.println("enter no. of coloumns ");
        int col=sc.nextInt();
       // if(row!=col){System.out.println("enter same rows and coloumns");}
        int[][] a=new int[row][col];

        System.out.println("enter elements");

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=sc.nextInt();
                System.out.print(a[i][j]+" ");
            } System.out.println();
            }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i]==a[j]){System.out.print(a[i][j]+" ");}
                
            }System.out.println();
        }


       /*  for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i]==a[j]){System.out.print(a[i][j]+" ");}
            }
        }System.out.println();*/

    }
    
}
