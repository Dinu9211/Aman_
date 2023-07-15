import java.util.*;
public class grade {
public static void main(String[]arges)
{

System.out.println("enter marks of your subject");
Scanner sc=new Scanner(System.in);
int marks=sc.nextInt();
if(marks>90 && marks <=100 ) System.out.println("Your grade is A+");
else if (marks>80 && marks<=90) System.out.println("Your grade is A");
else if (marks>70 && marks<=80) System.out.println("Your grade is B+");
else if (marks>60 && marks<=70) System.out.println("Your grade is B");
else if (marks>50 && marks<=60) System.out.println("Your grade is C+");
else if (marks>40 && marks<=50) System.out.println("Your grade is C");
else if (marks>30 && marks<=40) System.out.println("Your grade is D+");
else if (marks<30) System.out.println("You Are Fail");
   else System.out.println("Invalid Input");
}}


