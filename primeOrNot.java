import java.util.*;
public class primeOrNot{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if(a==2){
            System.out.println("Prime number");
        }else{
             boolean isPrime =true;
            for(int i=2;i<Math.sqrt(a);i++){
             if(a%i==0){
              isPrime = false;
             }
        }
    
        if(isPrime==true){
            System.out.print("Prime number");
        }else{
            System.out.print("Not Prime number");
        }
        }
       
    }
}