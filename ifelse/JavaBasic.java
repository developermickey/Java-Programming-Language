import  java.util.*;
public class JavaBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int b = sc.nextInt();

        if(l == b) {
            System.out.println("Its Square");
        }else {
            System.out.println("Its Not Square");
        }
    }
}