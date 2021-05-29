
import java.util.Scanner;
public class Bai3c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();
        System.out.println("e=: "+ Bai3c.factorial(n));
        }
    public static float factorial(int n){
        if(n<=1)
            return 1 ;
        return n*factorial(n-1);
    }
}       
        
