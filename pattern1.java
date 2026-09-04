// public class pattern1{
//     public static void main(String args[]){
//         for(int i=1;i<=3;i++){
//             System.out.println("* * * *");
//         }
//     }
// }

// Method 2

public class pattern1{
    public static void main(String args[]){
        int n=3;
        int m=4;
        for(int i=1;i<=n;i++){
            for(int j=0;j<m;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}