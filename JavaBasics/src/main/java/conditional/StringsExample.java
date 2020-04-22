package conditional;

public class StringsExample {


    public static void main(String[] args) {
        String greeting = "-Good Morningooo  ";
        String welcome = "welcome";
        String anotherString = "Welcome";
        // Length of the string
        System.out.println(greeting.length() + " is the length of the given string.");

        // remove white spaces
        // greeting.trim() -- to trim the string
        // print the string count after trimming
        System.out.println(greeting.trim().length() + " is the length of the string after removing white spaces");

        // find the position of a character or string
        System.out.println(greeting.charAt(6)  + " position of character");

        // character at a specific location/position
        System.out.println(greeting.indexOf('G') + " Specfic location");
        System.out.println(greeting.indexOf('d') + "  d location");
        System.out.println(greeting.indexOf('o') + "  o - first location");
        System.out.println(greeting.lastIndexOf('o') + "  o - last location");

        System.out.println(greeting.indexOf("oo") + " is the position of 'oo'");
        System.out.println(greeting.lastIndexOf("oo") + " is the last position of 'oo'");

        // substring of the given string
        System.out.println(greeting.substring(3) + " starting from 3 until the end");
        System.out.println(greeting.substring(3, 6) + " starting from 3 to 6 chars");

        // replace the character 'o'
        System.out.println(greeting.replaceAll("o", "##"));
        System.out.println(greeting.replace('o', '*'));
        System.out.println(greeting.replaceFirst("o", "*"));

        // String comparision
        // here we are going to compare two strings
        // output will be the difference of two string lengths
        System.out.println(welcome.compareTo(anotherString) + " is the output for comparing two strings");

        // usage of equals function
        System.out.println(welcome.equals(anotherString) + " is the output for string.equals function - case sensitive");
        System.out.println(welcome.equalsIgnoreCase(anotherString) + " is the output for string.equals function - ignores the case");

        String firstString = "Welcome";
        String secondString = "Welcome Savitha";
        // check if the second string contains the given string
        System.out.println("Contains example: " + secondString.contains(firstString));

        // matches
        // endswith
        // startswith
        // split
        // to uppercase
        // to lowercase
        // tocharsequence

    }



}
