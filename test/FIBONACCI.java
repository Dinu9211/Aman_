package test;
import java.util.*;
public class FIBONACCI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,temp,n;
        System.out.println("enter fibonacci n terms");
        n=sc.nextInt();
        for(int i=1;i<n;i++){
        System.out.print(a+" ");
            temp=a+b;
            a=b;
            b=temp;
        }

    }
}
