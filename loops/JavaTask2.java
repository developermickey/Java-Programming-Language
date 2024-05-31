import java.util.*;
public class JavaTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= n; i++) {
                if(i % 2 == 0) {
                    sumEven = i + sumEven;
                }else{
                    sumOdd = i + sumOdd;
                }
        }

        System.out.println("This is Sum of Even: " + sumEven);
        System.out.println("This is Sum of Odd: " + sumOdd);



    }
}
