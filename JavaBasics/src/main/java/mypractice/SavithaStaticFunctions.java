package mypractice;

import example.Cars;
import functions.SecondFunctionsExample;

public class SavithaStaticFunctions {
    static int a=80;
    int z = 20;
    public static void main(String[] args){
        int a1=50;
        System.out.println("value " +a1);
        System.out.println("static" +a);
        noinputnoreturn();
        inputPnoreturn(20, 5,30);
        int num1 = noinputwithreturnv();
        System.out.println(num1);
        String placetovisit1 = returnvalue();
        System.out.println(placetovisit1);
        int num5 = paraandrvalue(25,25);
        System.out.println("xyz: " + num5);
        System.out.println("score: " + paraandrvalue(8, 5));

        SecondFunctionsExample.washHands();


        doAllMath();


    }

//    1- No Input parameter - no return value
    public static void noinputnoreturn(){
        System.out.println("Los Angeles");
    }
    //   2- Input parameter - no return value
    public static void inputPnoreturn( int num1,int num2, int num3 ){
        int num4= num1+num2+num3;
        int num5= num1*num2;
        System.out.println("addition" + num4);
        System.out.println("multiply"+num5);
    }
//    3- no Input parameter - with return value
    public static int noinputwithreturnv() {
        int num1 = 1000;
        return num1;
    }
    public static String returnvalue(){
        String placetovisit1 = "Disney";
        return placetovisit1;
    }
//   4-  with input parameter  - with return value
    public static int paraandrvalue(int num1, int num2){
        int num5 = num1 * num2;
        return num5;
    }
    // function calling other (one or more) user defined functions-doAllMath please explain
       public static void doAllMath(){
           System.out.println("Welcome to todays class");
           System.out.println(paraandrvalue(8,8));
           inputPnoreturn(12,12,1);
       }

}

/*
        No Input parameter - no return value
        Input parameter - no return value
        no Input parameter - with return value
        with input paramter  - with return value



 */