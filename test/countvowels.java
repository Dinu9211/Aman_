//count of vowels frequency 
package test;
import java.util.*;
public class countvowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,e,i,o,u;

        System.out.println("enter string");
        String input=sc.nextLine();
        
        for (int j=0;j<input.length();j++){
            char ch=input.charAt(j);
            if(ch=='a'){
                a++;
                System.out.println(+a+" ");
            }
           else if(ch=='e'){
                e++;
                System.out.println(+e+" ");

            }
          else  if(ch=='i'){
                i++;
                System.out.println(+i+" ");
            }
          else  if(ch=='o'){
                o++;
                System.out.println(+o+" ");
            }
          else  if(ch=='u'){
                u++;
                System.out.println(+u+" ");
            }
             

        

        
        
    }
    
}
