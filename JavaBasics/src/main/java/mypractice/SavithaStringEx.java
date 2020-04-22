package mypractice;

import java.util.Locale;

public class SavithaStringEx {
    static String suffix = "p";
    public static void main(String[] args) {
                String tool = ("Power Application");
                String newtool = ("Power Point");
                String name = ("Sanjanaj1naj2naj3naj4naj5na");
                String name1 = ("SANJANA");
        // matches
        System.out.println(tool.matches(newtool) + " match the string");
        System.out.println(name.matches(name1) + " Match name");
        // endswith

        System.out.println(tool.endsWith(suffix) + " End with");
        System.out.println(name.endsWith("a") + " Sanjana ends with");
         // startswith
        System.out.println(newtool.startsWith("P") + " positive starts with");
        System.out.println(name1.startsWith("A", 1) + " start with and int");
        System.out.println(name1.startsWith("a") + " negative start with");
        // split
        System.out.println(name.split("j").length + " Name has been split into n number of strings ");
        System.out.println(name.split("j")[0] + " split the name and get value of 1 st location ");
        System.out.println(name.split("j")[4] + " split the name and get value of 2nd location");
        System.out.println(name.split("j")[6] + " split the name and get value of 7th location");

       // to Uppercase
        System.out.println(tool.toUpperCase() + " print in Uppercase");
        // to lowercase
        System.out.println(name1.toLowerCase() + " Print in Lowercase");
        // tocharsequence
        System.out.println(name1.toCharArray().length + " is the legth of the character array");
        System.out.println(name1.matches("S(.*)") );

    }



}
