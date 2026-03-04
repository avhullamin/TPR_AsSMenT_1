public class AgeCheck {
    static void validate(int age) {
        if (age < 18) throw new ArithmeticException("Age less than 18");
        else System.out.println("Valid age");
    }
    public static void main(String[] args) {
        validate(16);
    }
}
