public class BinoCoe{
       public static int factorial(int num) 
       {
        int fact = 1;
        for (int i = 1; i <= num; i++) 
        {
            fact *= i; 
        }
        return fact;
    }
    public static int Bino(int n,int r){
        int n_f= factorial(n);
        int r_f= factorial(r);
        int nmr_f= factorial(n-r);
        int Binomial=n_f/(r_f*nmr_f);
        return Binomial;
    }
    public static void main(String args[]) {
        System.out.println(Bino(5,2));
    }
}
