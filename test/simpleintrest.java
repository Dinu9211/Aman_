package test;
import java.util.*;
public class simpleintrest {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int p,r,t;
        System.out.println("enter principle ");
         p=sc.nextInt();
         System.out.println("enter rate% ");
         r=sc.nextInt();
         System.out.println("enter time");
         t=sc.nextInt();

         double result;
         result=p*r*t/100;
         System.out.println("your result is"+result);


        
    }
    
}
