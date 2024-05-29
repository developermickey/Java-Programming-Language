package conditions;

public class JavaPrint3Largest {
    public static void main(String[] args) {
        int A = 51;
        int B = 200;
        int C = 50;


        if ((A >= B) && (A >= C)) {
            System.out.println("A is Largest Of 3");
        } else if (B >= C) {
            System.out.println("B is Largest Of 3");
        }
        else{
            System.out.println("C is Largest Of 3");
        }
    }
}
