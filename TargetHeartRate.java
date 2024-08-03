import java.util.Scanner;

public class TargetHeartRate {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Get user input
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Resting HR: ");
            int restingHR = scanner.nextInt();

            System.out.println("\nTarget Heart Rate:"); // Shortened header

            // Loop for Intensities
            for (int intensity = 55; intensity <= 95; intensity += 5) 
            {
                double targetHR = (220 - age - restingHR) * (intensity / 100.0) + restingHR;
                System.out.printf("%d%%: %.2f bpm\n", intensity, targetHR);
            }
        }
    }
}
