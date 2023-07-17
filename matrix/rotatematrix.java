package matrix;

import java.util.Scanner;

public class rotatematrix {
    public static void printt(int[][]b){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                System.out.print(b[i][j]+" ");
            }System.out.println();
        }
        
    }

    public static void rotate(int[][]c){
        for(int k=0;k<c[0].length;k++){
            for(int i=0,j=c.length-1;i<j;i++,j--){
              int temp=c[i][k];
               c[i][k]=c[j][k];
               c[j][k]=temp;
                }
            }

           for(int i=0;i<c.length;i++){
           for(int j=i+1;j<c[0].length;j++){
            int temp=c[i][j];
            c[i][j]=c[j][i];
            c[j][i]=temp;
    
           }
        }
        
       
           printt(c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter matrix rows");
        int row=sc.nextInt();
        System.out.println("enter matrix coloumn");
        int col=sc.nextInt();
        int[][] a=new int[row][col];
        if(row!=col){
            System.out.println("please enter same rows and coloumns");
            return;}
        System.out.println("enter elemlents of matrix");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        printt(a);
        System.out.println("rotate matrix is ");
        rotate(a);
    }
    
}
