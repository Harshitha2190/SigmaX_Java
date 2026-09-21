// public class Function1{
//     public static void printHelloworld(){
//         System.out.println("Hello World!!");
//     }
//     public static void main(String args[]){
//         printHelloworld();
//     }
// }
//---------------------------------------------------------------------------
//Method 2
// public class Function1{
//     public static int printHelloworld(){
//         System.out.println("Hello World!!");
//         System.out.println("Hello World!!");
//          System.out.println("Hello World!!");
//          return 3;
//     }
//     public static void main(String args[]){
//         printHelloworld();
//     }
// }
//----------------------------------------------------------------------------
// Method 3
// import java.util.*;
// public class Function1{
//     public static int printHelloworld(){
//         System.out.println("Hello World!!");
//         System.out.println("Hello World!!");
//          System.out.println("Hello World!!");
//          return 3;
//     }
//     public static void calculate(){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter two Number: ");
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum=a+b;
//         System.out.println("Sum is: "+sum);
//     }
//     public static void main(String args[]){ 
//         calculate();
//     }
// }
// Method 4
import java.util.*;
public class Function1{
    public static int printHelloworld(){
        System.out.println("Hello World!!");
        System.out.println("Hello World!!");
         System.out.println("Hello World!!");
         return 3;
    }
    public static int calculate(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= calculate(a,b);
        System.out.println("sum is :"+sum);
    }
}