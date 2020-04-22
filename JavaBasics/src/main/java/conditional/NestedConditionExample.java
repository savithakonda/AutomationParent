package conditional;

public class NestedConditionExample {
    public static void complexConditions(int a, int b, int c) {
        if ((a < b) && (a < c)) {    // complex condition
            System.out.println("A is less than B and C");
            if (b < c) {    // nested if (means: if block inside another if block)
                System.out.println("B is less than c");
            } else if (b == c) {
                System.out.println("B is equal to C");
            } else {
                System.out.println("B is greater than C");
            }
        } // TODO: Complete the block to compare a, b, c. Take values like 10, 5, 15

    }
    public static void comparetask(int x, int y, int z) {
        if((x>y) && (y<z)){
            System.out.println("X is greater than Y");
            System.out.println("Y is less than Z");
        } //else if ((x==y) && (y<z))
        else if((x<y) || (y!=z)){ //5, 6, 6
            System.out.println("X is less than Y: " + (x<y));
            System.out.println("Y is not equal to z: " + (y!=z));
         //   System.out.println("X not equal to Y");
         //   System.out.println("X is less than Y ");
        } else {
            System.out.println("X is greater than Z");
        }
    }

        public static void main (String[]args){
           comparetask(5, 6, 6);
           complexConditions(5, 10, 10);
        }
    }
