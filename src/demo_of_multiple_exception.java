public class demo_of_multiple_exception {
    void division_cal(int a, int b) throws ArithmeticException {

        int c;
        if (b > 0) {

            c = a / b;
            System.out.println("division is: " + c);

        } else {
            throw new ArithmeticException("b is zero");
        }
    }

    public static void main(String[] args) {
        try {
            demo_of_multiple_exception obj = new demo_of_multiple_exception();
            obj.division_cal(10, 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
