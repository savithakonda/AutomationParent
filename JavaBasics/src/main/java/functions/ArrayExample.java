package functions;

public class ArrayExample {

    public static void main(String[] args) {
        // String array to store 5 names in the same variable

        String[] names = new String[5];
        names[0] = "Savitha";
        names[1] = "Sanjana";

        // Extract th total count of the names available
        // count of array ==> size/length
        System.out.println("Total entires available in the array variable: " + names.length);
        System.out.println("Name stored in location 2 :" + names[1]);
        System.out.println("Name stored in location 3 :" + names[2]);

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name stored in location " + (i+1) + " : " + names[i]);
        }

multiDimensionArray();
    }


    public static void multiDimensionArray() {
        // This creates a multi dimension array
        String[][] fullNames = new String[5][2];

        fullNames[0][0] = "Savitha";
        fullNames[0][1] = "K";

        fullNames[3][0] = "Sanjana";
        fullNames[3][1] = "K";

        System.out.println("Full name from location 1 - "  + fullNames[0][0]);
        System.out.println("Full name from location 1 - "  + fullNames[0][1]);

        System.out.println("Total count of fullnames : " + fullNames.length);
        System.out.println("Total count of fullnames[0] : " + fullNames[0].length);

        for (int rows = 0; rows < fullNames.length; rows++) {
            for (int j = 0; j < fullNames[rows].length; j++) {
                System.out.print(fullNames[rows][j] + "\t");
            }
            System.out.println();
        }
    }


}
