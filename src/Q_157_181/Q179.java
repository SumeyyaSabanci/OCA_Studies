package Q_157_181;

public class Q179 {
    public static void main(String[] args) {
        int ans;
        try {
            int num = 10;
            int div = 0;
            ans = num / div;
        } catch (ArithmeticException ae){
            ans = 0;
        } catch (Exception e){
            System.out.println("Invalid calculation");
        }
        //variable ans might not have been initialized
        //System.out.println("Answer = " + ans); //line2
    }
}

/*
179. You are asked to create a method that accepts an array of integers and returns the highest value from that array
Given the code fragment:

class Test {
    public static void main(String[] args) {
        int numbers[] = {12,13,42,32,15,156,23,51,12};
        int[] keys = findMax(numbers);
    }

    -- line n1 -- {
    int[] keys = new int[3];
    -- code goes here --
    return keys;
    }
}

Which method signature do you use at line n1?

A. public int findMax (int[] numbers)
B. static int[] findMax (int[] max)
C. static int findMax (int[] numbers)
D. final int findMax (int[] )
Answer: C
 */