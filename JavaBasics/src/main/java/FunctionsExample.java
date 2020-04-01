import functions.SecondFunctionsExample;

public class FunctionsExample {

    static int c = 30;
    int b = 20;

    public static void main(String[] args) {

        // invoking/calling a function with out input params and without return value
        sayHi();

        // invoking a function with input params and without return value
        addition(5, 10);

        // invoking a function with input params and with return value
        int prod = prodOfTwoNumber(5, 5);
        System.out.println("Product of two number is : " + prod);
        System.out.println("Product of two number is : " + prodOfTwoNumber(4, 5));

        // invoking a function with return value and without input params
        // We are calling the function getname() and assigning the output from that function to a variable extractedName
        String extractedName = getname();
        System.out.println(extractedName);

        // Do all math is a function which invokes addition function internally
        doAllMath();

        // invoking a function from different class -
        // to call a function from different classs, we have to use the ClassName.functionName()
        Welcome.parameter(1, 2, 3);
        Welcome.input();

        // invoking a function from a differnet package
        SecondFunctionsExample.washHands();
    }

    public static void sayHi() {
        System.out.println("Hello Savitha");
    }

    public static void addition(int num1, int num2) {
        int num3 = num1 + num2;
        System.out.println("The value after addition is : " + num3);
    }

    //with Input parameter - with return value
    public static int prodOfTwoNumber(int num1, int num2) {
        int num3 = num1 * num2;
        return num3;
    }

    // with return value - without input parameters
    public static String getname() {
        // this function will return a String to the calling function
        String someAnotherName = "Savitha";
        return someAnotherName;
    }

    public static void doAllMath() {
        // function calling other (one or more) user defined functions
        System.out.println("Here we can call another function from inside of a function");
        addition(15, 15);
    }

    /*


    Function/method:
    A set of lines of code which can be referred with a specific name
    -TIP:  name of the function/method represents the action/logic thats being perofrmed
    Purpose: to reuse the logic/code
    We can refer to the function/mehtod any number of times.. This will execute that particular block of lines.
    This will minimize the duplicate code lines through out the project


    Default Method in java is

    Reason: This defines the start point of the execution
    - This is predefined in jvm

    <access Specifier> <static/non-static> <returnTye> <nameOfMethod> (<optional - input parameters>) { -- }
    public static void main


 1. Access Specifier: public/private/protected
 2. static/non-static: static/<nil>
 3. returnType: void --> no return value
                any data type like int, String, char, boolean....
 4. Name of the method - Should be unique in the scope of a class
                        Should not be matching with any predefined keywords
 5. Input parameter - this is the input we pass to the function/method
                        can be any data type
                        Can be empty also -- > no input parameter


    No Input parameter - no return value
    Input parameter - no return value
    no Input parameter - with return value
    with input paramter  - with return value


- Naming conventions


     */


}
