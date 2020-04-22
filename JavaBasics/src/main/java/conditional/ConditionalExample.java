package conditional;

import static conditional.NestedConditionExample.complexConditions;

public class ConditionalExample {

        // if (condition)
        // this decides if a block of code should be executed or not


    public static void main(String[] args) {
        System.out.println("Program execution started");
        //1. Simple IF
        simpleIf();
        //2. If Else
        ifElseMethod(false);

        // print the input string value only if its length is more than 5 chars
        printMyString("Konda");

        // tryNegationOperator function which will flip the true/false values
        tryNegationOperator(5);

        //ifconditionexample
        // 3. if - else if
        ifElseIFConditionExample(10, 10);

        // 4. Nested IF
        nestedIfElseExample(15, 5);

        // 5. Complex conditions
        complexConditions(5, 10, 10);

        System.out.println("Program completed");
    }

    private static void printMyString(String inputString) {
        int length = inputString.length();
        System.out.println("The length of the given string is : " + length);

        if (length >= 5) {
            System.out.println("Printing the given string: " + inputString);
        } else {
            System.out.println("Your condition failed.");
        }
    }

    public static void tryNegationOperator(int length) {
        if (!(length >= 5)) {
            System.out.println("This is inside the true block");
        } else {
            System.out.println("This is inside the false block");
        }
    }

    public static void ifElseIFConditionExample(int a, int b) {
        // print if a is less than b - done
        // print if a is greater than b
        // print if a is equals to b

        if (a < b) { // a = 5, b = 10
            System.out.println("A is less than B");
        } else if (a > b) { // a = 5, b = 4
            System.out.println("A is greater than B");
        } else if (a == b) {
            System.out.println("A is equal to B");
        }
    }

    public static void nestedIfElseExample(int a, int b) {
        if (!(a < b)) {
            System.out.println("A is NOT less than B");
            if (a == b) { // if block inside another if
                System.out.println("A is equal to B");
            }
        }
    }


    public static void ifElseMethod(boolean ifStatus) {
        if (ifStatus) {
            System.out.println("This is from the true block");
        } else {
            System.out.println("This is from the false block");
        }
    }


    public static void simpleIf() {
        // define a boolean variable
        boolean status = true;
        if (status) {
            System.out.println("Now inside the If block");
            System.out.println("The given status is True.");
        }
    }




}
