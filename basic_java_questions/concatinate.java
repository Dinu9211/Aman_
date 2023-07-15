
public class concatinate {
    public static void main(String[] args) {
        int[] a=new int[]{10,20,30,40,};
        int[] b=new int[]{50,60,70,80,90,100};
       int c_length=a.length+b.length;
       int[] c=new int[c_length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
    }
    for(int i=0;i<c.length;i++){
       System.out.print(c[i]+" ");
    
}
        
    }
}