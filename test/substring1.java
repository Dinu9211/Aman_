package test;

public class substring1 {
    public static void main(String[] args) {
        String s1="amanrajput";
        String s2="RAJPUT";
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.contains("raj"));
        System.out.println(s1.substring(0,4));
        System.out.println(s1.substring(4, s1.length()));
    }
}
