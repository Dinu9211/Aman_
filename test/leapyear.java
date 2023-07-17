package test;
import java.util.*;
public class leapyear {
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     System.out.println("enter a year");
     int t=sc.nextInt(); 
     if(t%4==0)
     System.out.println("this is leap year"); 
      if(t%100==0)
        if(t%400==0)
      
     System.out.println("this is  a leap year"); 
     else
     System.out.println("this is not a leap year");
    }
    
}
