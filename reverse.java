public class reverse{
    public static void main(String args[]){
        int n=10899;
        System.out.println(+n);
        while(n>0){
            int ld=n%10;
            n=n/10;
         System.out.print(+ld +" ");
        }
    }
}