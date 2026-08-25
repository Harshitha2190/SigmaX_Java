import java.util.*;
public class PQ1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a,b,c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Avg = a+b+c/3;
        System.out.print("Average of a,b,c: " +Avg);

    }
}