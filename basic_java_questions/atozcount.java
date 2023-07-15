import java.util.Scanner;

public class atozcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String -");
        int arr[] = new int[26];
        String s = sc.nextLine();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
        
            if (ch >='a' && ch <= 'z'){
                arr[ch-97]++;              
        }
    }
        for (int j=0;j<26;j++){
            System.out.println((char)(j+97)+"-"+arr[j]); 

        }
       
    }
}
