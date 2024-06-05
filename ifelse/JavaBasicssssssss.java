import java.util.Scanner; // Only import the Scanner class

public class JavaBasicssssssss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("has you have medical cause?");
        char mc = sc.next().charAt(0);;
        if(mc == 'Y'){
            System.out.println("Medicial Coue: " + mc);
                System.out.println("Is student is allowed to sit in exam");
        }else {
            System.out.println("Number of Classes held");
            int held = sc.nextInt();
            System.out.println("Number of Classes attended");
            int attend = sc.nextInt();
            double perClass = ((double) attend / held) * 100;
            if(perClass <= 75) {
                System.out.println("percentage of class attended: " + perClass);
                System.out.println("Is student is Not allowed to sit in exam");
            }else {
                System.out.println("percentage of class attended: " + perClass);
                System.out.println("Is student is allowed to sit in exam");
            }
        }
    }
}
