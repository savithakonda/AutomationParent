public class Welcome {

    static int a = 10;
    int b = 20;

    public static void main(String[] args) {
        /*int c = 30;
        System.out.println(c);
        System.out.println(a);
        Variable obj = new Variable();
        System.out.println(obj.b);
        System.out.println("Welcome to Java class");
        System.out.println("Online");
        */
        input();
        parameter(5, 10, 15);
    }

    public static void input() {
        System.out.println("types of variables");
    }

    public static void parameter(int num1, int num2, int num3) {
        int num4 = num1 + num2 + num3;
        int num5 = num1 - num2;
        System.out.println("Total value:" + num4);
        System.out.println("Sub:" + num5);

    }

}
