import java.util.*;
public class product{
    public static int multiply(int a,int b){
        int mul = a*b;
      return mul;
    }
    public static void main(String args[]){
        int a=5;
        int b=3;
        int prod=multiply(a,b);
        System.out.println("result=" +prod);
    }
}