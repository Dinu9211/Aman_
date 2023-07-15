import java.util.Scanner;

public class bubblesort {
   
    public static String[] sortPeople(String[] Names, int[] Heights){
        
            for(int i=0;i<Heights.length-1;i++){
                for(int j=i+1;j<Heights.length;j++){
                    if(Heights[i]>Heights[j]){
                    int tempHeights=Heights[i];
                     Heights[i]=Heights[j];
                     Heights[j]=tempHeights;

                     String tempNames=Names[i];
                     Names[i]=Names[j];
                     Names[j]=tempNames;
                    
                    
                    }


                }
            }
                    return Names;
                        }







    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int strsize;
        int hsize;
        
        System.out.println("enter string array size");
        strsize=sc.nextInt();
        String[] names=new String[strsize];
       
        int[] height=new int[strsize];

        System.out.println("enter array names");
        for(int i=0;i<strsize;i++){
             names[i]=sc.next();
        }

        System.out.println("enter array height");
        for(int j=0;j<strsize;j++){
            height[j]=sc.nextInt();
        }

        String [] res = sortPeople(names, height);
        for(String str : res)
            System.out.print(str+ " ");


    }
    
}
