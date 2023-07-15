import java.util.*;

public class assendingbubblesort {
    public static void prints(int[] a){
        for(int i=0;i<a.length;i++){
            int temp=a[i];
            System.out.print(temp+" ");
        }
    }

    public static void assending(int[] n){
        for(int i=0;i<n.length-1;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[j]<n[i]){
                    int temp=n[j];
                    n[j]=n[i];
                    n[i]=temp;
                }
            }
        }

    }


    public static void decending(int[] n){
        for(int i=0;i<n.length-1;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[j]>n[i]){
                    int temp=n[j];
                    n[j]=n[i];
                    n[i]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter array size");
        size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        assending(a);
        
        System.out.println("assending is");
        prints(a);
        System.out.println();
        decending(a);
        System.out.println("decending is");
        prints(a);

       /* for(int str:res)
        System.out.println("assending is"+res+" ");

        for(int s:result)
        System.out.println("decending is"+result+" ");*/
    }
    
}
