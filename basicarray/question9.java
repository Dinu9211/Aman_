package basicarray;

import java.util.Scanner;

public class question9 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter intrest");
    int p = sc.nextInt();
    int r = sc.nextInt();
    int t = sc.nextInt();
    int a = p*r*t/100;
    System.out.println("intrest is -"+a);

    
  }
    
}
