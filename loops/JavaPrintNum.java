
import java.util.Scanner;

public class JavaPrintNum {
 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int counters= 1;
            int n = sc.nextInt();
    
            while (counters <= n) {
                System.out.print(counters + " ");
                counters++;
            }

            // for (int i = 1; i <= n; i++) {
            //     System.out.println(i);
            //     counters++;
            // }
            
        }
}