package test;
import java.util.*;

import javafx.animation.Animation.Status;
public class anagram {
    public static boolean isEmpty(int[] a){
        for(int i=0;i<a.length;i++){
        if(a[i]!=0) return false;
       } 
       return true;
    } 

    public static boolean isanagram(String s1, String s2){
        if(s1.length()!=s2.length())
        return false;
        int[]arr=new int[26];

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            arr[ch-97]++;
        }
        for(int j=0;j<s2.length();j++){
            char ch=s2.charAt(j);
            arr[ch-97]--;
        }
        isEmpty(arr);
        boolean status=isEmpty(arr);
        return status;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter first string");
        String str1=sc.next();
        System.out.println("enter second string");
        String str2=sc.next();
        boolean flag=isanagram(str1,str2);
        if(flag)
       System.out.println("is anagram");
       else
       System.out.println("not anagram");
       
    }
    
    
    
}
