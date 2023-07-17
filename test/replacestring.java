package test;

public class replacestring {
    public static void main(String[] args) {
        String s1="aman is a good boy";
        System.out.println(s1.replace("aman","kamal"));
        StringBuilder s2=new StringBuilder("rohit is a good boy");
        System.out.println(s2.replace(0, 5, "kunal"));
        System.out.println(s1.startsWith("aman"));
        System.out.println(s1.endsWith("boy"));
    }
}
