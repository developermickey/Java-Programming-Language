
import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 1;

        while (count <= n) {
            sum = sum + count;
            count++;
        }
        System.out.println("Sum of N: " + sum);
    }
}
