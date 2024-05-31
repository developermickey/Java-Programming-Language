import java.util.*;
public class JavaLoopPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is Prime Number");
        }else {
            boolean isPrime = true;

            // for (int i = 2; i <= n-1 ; i++) { brute force 
                for (int i = 2; i <= Math.sqrt(n) ; i++) { // optimized solution 
                if(n % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true) {
                System.out.println("n is Prime Number");
            }else {
                System.out.println("n is Not A Prime Number");
            }
        }



    }
}
