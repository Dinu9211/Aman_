package test;

public class token {
    public static void main(String[] args) {
        String s = "               ";
        String []a = s.trim().split("[ !,?._'@]+");
        System.out.println(a.length);
        for(String str:a)
            System.out.println(str);
    }
}
