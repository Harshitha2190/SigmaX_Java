import java.util.*;
public class If_else{
    public static void main(String args[]){
        int age = 16;
        if(age>=18){
            System.out.println("Adult:drive,Vote");
        }
        if(age>13 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult...Go Watch Cartoon Kid..");
        }
    }
}