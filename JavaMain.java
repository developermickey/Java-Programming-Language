import java.util.*;

public class JavaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int year = sc.nextInt();
        int day = 0;

        if(month == 1) {
            day = 31;
            System.out.println(`Jan ${year} year has ${day}`);
        }else if(month == 2) {
            if ((year % 4 == 0) && (year % 100 != 0)) {
                
            }
        }

    }
}




