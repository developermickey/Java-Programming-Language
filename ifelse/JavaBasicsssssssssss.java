
import java.util.Scanner;

public class JavaBasicsssssssssss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);;

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase Char");
        }else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase Char");
        }else {
            System.out.println("Character is not a valid character");
        }
    }
}
