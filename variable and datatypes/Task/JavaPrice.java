import java.util.*;
public class JavaPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            float item1 = sc.nextFloat();
            float item2 = sc.nextFloat();
            float item3 = sc.nextFloat();
            float gst = sc.nextFloat();
            float totalAdd = (item1 + item2 + item3);
            float totalAns = (totalAdd * gst/100) +  totalAdd;
            System.out.print("Total Of 3 Items With GST: " + totalAns);
       }
}




