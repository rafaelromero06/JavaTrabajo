
import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args){
        Scanner lea = new Scanner (System.in);
        System.out.println("Digite un numero: ");
        int n = lea.nextInt();
        int f0 = 0;
        int f1 = 1;
        int fsum;
        
        for (int i=1;i < n; i++){
            fsum = f1 + f0;
            f0= f1;
            f1= fsum;


        }
        lea.close();
    }
}