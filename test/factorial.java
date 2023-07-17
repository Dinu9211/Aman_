package test;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        int t=sc.nextInt();
        
        for(int i=1;i<=t;i++)
        fact=fact*i;    
    System.out.println("factorial given no.is"+fact);
       
    }
    
}
