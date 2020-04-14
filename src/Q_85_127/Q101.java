package Q_85_127;

public class Q101 {
    public static void main(String[] args) {
        float var1 = (12_345.01 >= 123_45.00) ? 12_456 : 124_56.02f;
        float var2 = var1 + 1024;

        System.out.println(var2);

        /*
        What is the result?
        A. An exception is thrown at runtime.
        B. Compilation fails.
        C. 13480.0
        D. 13480.02

         */
    }
}
