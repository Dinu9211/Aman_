public class maxmin {
    public static void main(String[] args) {
        
    int[] arr= new int[]{1,10,25,65,99,42,88,52,63,91,2};
   int min=1000;
   int max=-1000; 
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min)min=arr[i];
        if(arr[i]>max)max=arr[i];
    
    }
    System.out.println("maximum no.is "+max);
    System.out.println("minimum no.is "+min);
}
}