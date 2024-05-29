package conditions.task;

import java.util.*;

public class JavaLeapYear {
    public static void main(String[] args) {
        

    Scanner sc = new Scanner(System.in);

    int year = 2020;
    //Divisible by 4 
    boolean isLeapYear;
    isLeapYear = (year % 4 == 0);

    isLeapYear = isLeapYear && (year % 100 !=0 || year % 400 == 0);


    if(isLeapYear){
        System.out.println("leap year");
    }else {
        System.out.println("Not a leap year");
    }
}

}