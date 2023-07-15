import java.util.*;
public class findposneg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("enter array eliments");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();

        int countpos=0,countneg=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0)
                countneg++;
            else countpos++;
         }

        int[] b=new int[countneg];
        int[] c=new int[countpos];

        int b_i =0;
        int c_i = 0;
        for(int j=0;j<a.length;j++){
            if(a[j]<0){ b[b_i]=a[j]; b_i++;}
            else {c[c_i]=a[j]; c_i++;}
        }

        System.out.println("here are positive array");
        for(int i=0;i<c.length;i++)
            System.out.print(c[i]+" ");

        System.out.println();  
          
        System.out.println("here are negetive array");
        for(int i=0;i<b.length;i++)
           System.out.print(b[i]+" ");
    }
    }

