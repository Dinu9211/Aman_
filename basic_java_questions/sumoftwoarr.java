class sumoftwoarr{
    public static void main(String[] args) {
        int[] a=new int[]{23,25,45,17,49,75,47};
        int[] b=new int[]{75,76,78,50,75,85,56};
        int[] c=new int[7];
    
        for(int i=0;i<a.length;i++){

        
        c[i]=a[i]+b[i];
        
        }
        for(int i=0;i<a.length;i++)
        System.out.println(c[i]);
    }
}