package data.reader;

public class MathExceptionExample {


    public static void main(String[] args) {
        doMath(5, 5);
        doMath(5, 0);
        doMath(15, 5);
    }

    public static void doMath(int a, int b) {
    // Try catch is used for exception handling
        // whenever the code undergoes any kind of unexpected behavior and terminate abruptly, we can get a proper closure
        // with user defined error messages and alternative steps/actions

        try {
            System.out.println("Program started");
            System.out.println("Vlaue of a is : " + a);
            System.out.println("Vlaue of b is : " + b);

            int c = a / b;
            System.out.println("Value of C is : " + c);

            System.out.println("Success");

            System.out.println("Program Completed");
        } catch (Exception ex) {
            System.err.println("Failed - " + ex.getMessage());
        }
    }


}
