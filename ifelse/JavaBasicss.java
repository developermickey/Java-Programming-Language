import  java.util.*;
public class JavaBasicss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b) {
            System.out.println("A is Greatest");
        }else {
            System.out.println("B is Greatest");
        }
    }
}