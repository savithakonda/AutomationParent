package example;

public class Cars {
    String color;
    int doors;
    int wheels;
    boolean automatic;

    public void myOwnMethod() {
        color = "blue";
    }

    public static void main(String[] args) {
        // creating an object of Cars
        Cars pCar = new Cars();

        // Any number of objects can be created
        Cars myCar2 = new Cars();

        // myCar is called the instance variable of Cars();
        pCar.color = "red";
        pCar.wheels = 3;
        pCar.myOwnMethod();

        myCar2.color = "Green";
        myCar2.wheels = 4;
        myCar2.doors = 2;
        myCar2.automatic = true;

        System.out.println("Savitha's car color " + myCar2.color);
        System.out.println("Praveens's car color " + pCar.color);


    }


}
