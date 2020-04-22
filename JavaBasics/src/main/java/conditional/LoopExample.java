package conditional;

public class LoopExample<e> {


    // To repeat a set of lines of code we need 3 parameters
    /*
    1. Loop variable        int i = 1
    2. Loop Condition           i < 10
    3. Loop variable control operation  i = i + 1
     */
    /*
    1. While loop
    2. Do While Loop
    3. For Loop
     */


    public static void main(String[] args) {

        // loop variable
        int a = 10;
        // condition is a < 1+
        while (a < 10) {
            System.out.println(a + " - Inside the while block ");
            // increment the value of a after every iteration
            a = a + 1;
        }

        // do while is called as exit controlled loop
        // Loop variable b
        int b = 10;
        do {
            System.out.println(b + " - Inside do-while block");
            // b = b + 1;
            b++;
        } while (b < 10);


        for (int c = 10; c < 10; c++) {
            System.out.println(c + " - Inside the for block");
        }


        // print all even numbers less than 20

        // print all odd numbers less than 20
        // use for loop
        // math table 5 function with input parameter and no return value
        // input takes two integers tablesequence and limit
        // tableSequence * limit = value
        // 5 * 1 = 5
        //mathTable(5, 10);

        /*int reminder = 5 % 2;
        for (int X = 1; X < 20; X++)
        System.out.println(reminder);
        if (reminder == 0) {
            System.out.println( "Given number is a Even number");
        } else {
            System.out.println("Given number is an odd number");
        }*/

        int reminder = 5 % 2;

        for (int X = 1; X < 20; X++) {
            System.out.println(5 + " * " + X + " = " + (5 * X));
        }


        //


        for (int c = 1; c < 20; c++) ;
        int c = 1;
        System.out.println(2 + " * " + c + " = " + (2 * c));
        if (reminder == 1) {
            System.out.println("Given number is a Even number");
        } else {
            System.out.println("Given number is an odd number");
        }






    /*public static void mathTable(int table, int limit) {
        // limit is the condition
        for (int n = 1; n <= limit; n++) {
            System.out.println(table + " * " + n + " = " + (table * n));
        }
    }*/


        for (int e = 1; e <= 20; e++) {
            System.out.println(2 + " * " + e + " = " + (2 * e));

            if (e % 2 == 0) {
                System.out.println(e + " Even number");
            } else {
                System.out.println(e + " ODD number");
            }
        }
    }

}
