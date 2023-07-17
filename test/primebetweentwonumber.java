package test;

import java.util.Scanner;

public class primebetweentwonumber {
    public static boolean isprime(int n){
        for (int i = 2; i < n; i++){
        if (n % i == 0)
            return false; 
    }
    return true;
}

public static void main(String[] args) {
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Check prime or not");
    num = sc.nextInt();
    boolean f = isprime(num);
    if(f)
    System.out.println("prime number");
    else
    System.out.println("not a prime");
}












}
