package test;
import java.util.*;
public class reversestr {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter string ");
        String st=sc.nextLine();
        int len=st.length();
        String sp="";
        for(int j=len-1;j>=0;j--)
        {
            sp=sp+st.charAt(j);

        }
        System.out.println("reverse string is "+sp);
    }
    
}
