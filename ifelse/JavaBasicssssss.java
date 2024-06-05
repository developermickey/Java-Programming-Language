import  java.util.*;
public class JavaBasicssssss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if( (a > b) && (a > c) ) {
            System.out.println("A Oldest Among Them B or C");
        }else if (b > c) {
            System.out.println("B Oldest Among Them A or C");
        }else {
            System.out.println("C Oldest Among Them A or B");
        }

    }
}
