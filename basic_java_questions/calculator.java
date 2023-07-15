import java.util.*;
class calulator{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.println("enter first number");
        double num1=r.nextDouble();
        System.out.println("enter second number");
        double num2=r.nextDouble();
        System.out.println("select oprators +,-,*,/,% ");
        char oprators=r.next().charAt(0);
        double result=0.0;
        if(oprators=='+'){
            result=num1+num2;
        }
       else if(oprators=='-'){
            result=num1-num2;
        }
       else if(oprators=='*'){
             result=num1*num2;
        }
        else if(oprators=='/'){
              if(num2==0){
                     System.out.println("error num2 is not 0 enter a vailid number");
                 }
             result=num1/num2;}
        else  if(oprators=='%'){
             result=num1%num2;
    }
    else{
        System.out.println("invalid oprators");
    }
    System.out.println(num1+" "+oprators+" "+num2+" "+" "+result);
}
}
    