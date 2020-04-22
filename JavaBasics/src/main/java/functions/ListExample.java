package functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        List<String> names = new ArrayList<String>();

        List<Employee> empDetails = new ArrayList<Employee>();

        Employee emp1 = new Employee(); // creating an object for emp...in employee class used getters and setters
        emp1.setEmpName("Savitha");
        emp1.setEmpId(123);

        Employee emp2 = new Employee("Sanjana", 124);// In employee class used constructor

        // add the emp1 to the emplDetails list
        empDetails.add(emp1);   // emp1 using getters and setters
        empDetails.add(emp2);   // emp2 using constructor
        empDetails.add(new Employee("abcd", 111));


        System.out.println("Employee list details: " + empDetails.size());
        System.out.println("Employee details in location 1 : " + empDetails.get(0).toString());
        System.out.println("Employee details in location 1 : " + empDetails.get(0).getEmpName());
        System.out.println("Employee details in location 1 : " + empDetails.get(0).getEmpId());

        for (int i = 0; i < empDetails.size(); i++) {
            System.out.println("Employee : " + empDetails.get(i).toString());
        }


        numbers.add(456789);
        numbers.add(0, 123);


        names.add("yuil");

        String[] nameArray = new String[3];
        nameArray[0] = "name1";
        nameArray[1] = "name2";
        nameArray[2] = "name3";

        names.addAll(Arrays.asList(nameArray));

        System.out.println("Total number of names available: " + names.size());

    }

}
