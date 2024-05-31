import java.util.*;
public class JavaTable {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
        int table = 0; 

        for (int i = 1; i <=10; i++) {
            table = i * n;
            System.out.println(table);
        }
        

   } 
}
