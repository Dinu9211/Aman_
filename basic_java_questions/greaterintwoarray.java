import java.util.Scanner;

public class greaterintwoarray {
    public static void main(String[] args) {
        System.out.println("enter size of array");
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        System.out.println("enter size of second array");
        int size2 = sc.nextInt();
        int[] a = new int[size1];
        int[] b = new int[size2];

        int size_c = (size1 > size2) ? size1 : size2;
        int[] c = new int[size_c];
        System.out.println("enter eliments of array");
        for (int i = 0; i < size1; i++)
            a[i] = sc.nextInt();
        System.out.println("enter eliments of array 2");
        for (int i = 0; i < size2; i++)
            b[i] = sc.nextInt();
        int i = 0;

        int s = (size1 < size2) ? size1 : size2;
        for (; i < s; i++)
            c[i] = (a[i] > b[i]) ? a[i] : b[i];

        if (a.length > b.length) {
            for (; i < size_c; i++)
                c[i] = a[i];
        } else {
            for (; i < size_c; i++)
                c[i] = b[i];
        }

        for (int j = 0; j < size2; j++)
            System.out.print(c[j] + " ");
    }
}
