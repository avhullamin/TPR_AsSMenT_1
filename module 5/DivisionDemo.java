public class DivisionDemo {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
