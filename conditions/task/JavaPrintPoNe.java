package conditions.task;

import java.util.*;

public class JavaPrintPoNe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        if(n > 0) {
            System.out.println("Entered Number Positive");
        }else {
            System.out.println("Entered Number Negative");
        }


    }
}
