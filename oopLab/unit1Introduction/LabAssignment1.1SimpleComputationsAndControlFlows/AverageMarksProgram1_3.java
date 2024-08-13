import java.util.Scanner;

public class AverageMarksProgram1_3 {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int userNumber = obj1.nextInt();
            sum = sum + userNumber;
        }
        // Calculate Average
        double average = sum / 5.0;
        System.out.printf("%.2f", average);
    }
}