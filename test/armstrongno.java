package test;
import java.util.*;
public class armstrongno {public static void main(String[] args) {
 Scanner sc=new Scanner(System.in); 
 int n,temp,arm=0,r;
 System.out.println("enter a number");
 n=sc.nextInt();
   temp=n;
   while(n!=0){
    r=n%10;
    arm=(r*r*r)+arm;
    n=n/10;
   }
   if(temp==arm)
   System.out.println("yes armstrong no-");
   else
   System.out.println("not a arm strong");
}
}