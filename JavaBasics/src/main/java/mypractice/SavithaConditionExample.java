package mypractice;

public class SavithaConditionExample {

    public static void main(String[] args) {
        System.out.println("Start");
        printname("Yes");
        conditionnegation(4);

        System.out.println("End");

    }



    public static void printname(String name) {
        int length = name.length();
        System.out.println("The length of the name : " + length);
        if (length >= 4) {
            System.out.println("Printing the given string: " + name);
        } else {
            System.out.println("condition failed.");
        }
    }
        public static void conditionnegation(int count) {
            if (!(count >= 5)) {
                System.out.println("This is inside the true block");
            } else {
                System.out.println("This is inside the false block");
            }
        }


        }



