import  java.util.*;
public class JavaBasicssss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();
        int year = sc.nextInt();
        int bonus = salary * 5/100;
        if (year == 5) {
            System.out.println(bonus);
        }else {
            System.out.println("You are not aliable to bonus");
        }
    }
}
