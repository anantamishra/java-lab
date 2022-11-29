import java.util.Scanner;

public class input10numbers {
    public static void main(String[] args) {
        int i, num[], large = 0;
        num = new int[10];
        try (Scanner input = new Scanner(System.in)) {
            for (i = 0; i < 10; i++) {

                System.out.println("Enter a number: ");
                num[i] = input.nextInt();
                if (num[i] > large) {
                    large = num[i];
                }
            }
        }
        System.out.println("\n The new largest number is " + large);
    }
}
