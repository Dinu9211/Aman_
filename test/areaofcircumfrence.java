package test;
import java.util.*;
public class areaofcircumfrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius");
        int r=sc.nextInt();
        double circumference=2*22/7*r;
        System.out.println("your circumfrence is "+circumference);
        double area=22/7*r*r;
        System.out.println("area is "+area);
    }
    
}
