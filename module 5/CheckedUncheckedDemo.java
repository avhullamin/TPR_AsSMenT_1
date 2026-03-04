import java.io.*;

public class CheckedUncheckedDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt"); // Checked
        } catch (IOException e) {
            System.out.println("Checked Exception: " + e);
        }
        int x = 10 / 0; // Unchecked
        System.out.println(x);
    }
}
