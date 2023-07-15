public class reversearray {
    public static void main(String[] args) {
        int[] a=new int[]{10,20,30,40,50,60,70,};
        int temp;
        for(int i=0,j=a.length-1;i<j;i++,j--)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;

        }
       

    
    for(int j=0;j<a.length;j++)
    
    System.out.print(a[j]+" ");
}
}