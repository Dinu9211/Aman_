package basicarray;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int row = sc.nextInt();
        System.out.println("enter col");
        int col = sc.nextInt();
        System.out.println("enter the element");
        int [][] a=new int[row][col];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j] = sc.nextInt();
                System.out.print(a[i][j]+" ");
        }
            System.out.println();
          }
           System.out.println(" transpose is ");
           int [][] b = new int [col][row];

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                b[i][j] = a[j][i];
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }    
    }
    
}
