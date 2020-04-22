package example;

public class NonStaticFuncExample {

    int globalInt = 21;
    static int globalInt2 = 22;
    // example to discuss non static functions
    // memory allocation is done only after creating an object
    // 1-function with input params and with return type
    public String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 2-function without input params and with return type
    public int getProduct() {
        int a = 5;
        int b = 14;
        int c = a * b;
        return c;
    }
    // 3-function with input params and without return type
    public void sayHello(String name) {
        System.out.println("Hello ... " + name + "..!");
    }

    // 4-function without input params and without return type
    public void noreturn(){
        System.out.println("universal");
    }
    //function without input parameter and with return value

    public int withreturn (){
         int num1 = 555;
         return num1;
        //
    }

    public static void main(String[] args) {
        // to call the non static method from a static block

        // we have to create an object
        NonStaticFuncExample nsfe = new NonStaticFuncExample();

        // invoking the fucntion without return type and witout input parameter
        nsfe.noreturn();

        // invoking the function with input parameter and without return value
        nsfe.sayHello("Savitha");

        // invoking the function with parameter and with return value
        String fullName = nsfe.getFullName("Savitha", "Konda");
        System.out.println("The full name is : " + fullName);

        // invoking the fucntion without input parameter and with return value
        int a = nsfe.withreturn();
        System.out.println("The value is " + a);


        // print the non static global int varaible
        System.out.println("This is a non static global value : " + nsfe.globalInt);
        System.out.println("This is a static global value: " + globalInt2);

    }

}