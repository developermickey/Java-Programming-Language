
import java.util.Scanner;

public class JavaFactorial {
  public static void main(String[] args) {
    // Creating a input Varibale
      Scanner sc = new Scanner(System.in);
      // taking User Input
      int n = sc.nextInt();

    // loop run karna hai n times taki hum n times tak iterate kar sake n-1 n-2 n-3 ki value mil sake
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        System.out.println(i);
        fact = fact * i;
    }

    System.out.println("Factorial: " + fact);

  }
    
}
