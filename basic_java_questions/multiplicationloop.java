import java.util.*;
public class multiplicationloop {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(b*i);
        }
    }
}
