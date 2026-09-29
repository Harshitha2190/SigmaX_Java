public class Factorial{
    public static int Factorial(int n){
        int Fact=1;
        for(int i=1;i<=n;i++){
            Fact=Fact*i;
        }
        return Fact;
    }
    public static void main(String args[]){
        System.out.println(Factorial(4));
    }
}