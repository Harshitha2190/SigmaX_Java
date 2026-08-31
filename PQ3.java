import java.util.*;
public class PQ3{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the cost of pencil,pen,eraser: ");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float cost = ((pencil+pen+eraser)+(pencil+pen+eraser)*0.18f);
        System.out.println("-----Bill-------");
        System.out.println("pencil: "+pencil);
        System.out.println("pen: "+pen);
        System.out.println("eraser: "+eraser);
        System.out.println("18% gst on each item");
        System.out.println("Total: "+cost);
        System.out.println("--------------------");
    }
}