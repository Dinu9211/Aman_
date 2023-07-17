package test;
import java.util.*;
public class largestthreedigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three no.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c)
        System.out.println("the largest no.is "+a);
       else if(b>a&&b>c&&a==c)
        System.out.println("the largest no.is "+b);
        else if(c>b&&c>a&&a==b)
        System.out.println("the largest no.is "+c);
        else 
        System.out.println("");
    }
}
