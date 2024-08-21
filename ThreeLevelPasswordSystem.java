import java.util.Scanner;

public class ThreeLevelPasswordSystem {

    // Simulating the textual password
    private static final String TEXTUAL_PASSWORD = "MySecurePassword123";

    // Simulating the graphical password (sequence of selected options)
    private static final int[] GRAPHICAL_PASSWORD = {1, 3, 2, 4}; // Assume this sequence represents images.

    // Simulating behavioral property (in this case, a timing-based check)
    private static final long MAX_RESPONSE_TIME = 5000; // 5 seconds

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Level 1: Textual Password
        System.out.print("Enter your textual password: ");
        String inputPassword = scanner.nextLine();
        if (!inputPassword.equals(TEXTUAL_PASSWORD)) {
            System.out.println("Incorrect textual password. Access denied.");
            return;
        }

        // Level 2: Graphical Password
        System.out.println("Select the correct sequence of graphical options (1-4):");
        int[] inputGraphicalPassword = new int[4];
        for (int i = 0; i < 4; i++) {
            inputGraphicalPassword[i] = scanner.nextInt();
        }
        if (!isGraphicalPasswordCorrect(inputGraphicalPassword)) {
            System.out.println("Incorrect graphical password. Access denied.");
            return;
        }

        // Level 3: Behavioral Property (Response time)
        System.out.println("Press ENTER as soon as you see the prompt to test your response time:");
        long startTime = System.currentTimeMillis();
        scanner.nextLine(); // Clear buffer
        scanner.nextLine(); // Wait for ENTER
        long responseTime = System.currentTimeMillis() - startTime;

        if (responseTime > MAX_RESPONSE_TIME) {
            System.out.println("Response too slow. Access denied.");
        } else {
            System.out.println("Access granted. Welcome!");
        }

        scanner.close();
    }

    // Helper function to check graphical password
    private static boolean isGraphicalPasswordCorrect(int[] input) {
        if (input.length != GRAPHICAL_PASSWORD.length) return false;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != GRAPHICAL_PASSWORD[i]) return false;
        }
        return true;
    }
}
