package matrix;

import java.util.Scanner;

public class inplacehorizontal {
    public static void reverse(int[] b){
         for(int i=0,j=b.length-1;i<j;i++,j--){
           int temp=b[i];
            b[i]=b[j];
            b[j]=temp;
          
               
            }
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row ");
        int row=sc.nextInt();
        System.out.println("enter coloumns");
        int col=sc.nextInt();
        int[][] a=new int[row][col];
        System.out.println("enter matrix elements");
            for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        
        System.out.println(" matrix is ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
            System.out.print(a[i][j]+" ");
            }System.out.println();
        }
    

        System.out.println();
        System.out.println("  after matrix is ");
        for(int i=0;i<a.length;i++){
            reverse(a[i]);
            for(int j=0;j<a[0].length;j++){
                
            System.out.print(a[i][j]+" ");
            }System.out.println();
        }
    }

    
    
}
