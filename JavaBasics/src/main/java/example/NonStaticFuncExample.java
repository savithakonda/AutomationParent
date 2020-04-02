package example;

public class NonStaticFuncExample {

    // example to discuss non static functions
    // memory allocation is done only after creating an object


    // function with input params and with return type
    public String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // function without input params and with return type
    public int getProduct() {
        int a = 5;
        int b = 14;
        int c = a * b;
        return c;
    }

    // function with input params and without return type
    public void sayHello(String name) {
        System.out.println("Hello ... " + name + "..!");
    }

    // function without input params and without return type
    public void noreturn(){
        System.out.println("universal");
    }
    //function without input parameter and with return value
    public int main (){
         int num1 = 555;
         return num1;

        //
    }



}
