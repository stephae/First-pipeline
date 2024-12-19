import java.util.Random;

public class RandomMinutes {
    public static void main(String[] args) {
        // Define the range for random minutes (e.g., 0 to 59)
        int minMinutes = 0;
        int maxMinutes = 59;

        // Generate a random number of minutes
        int randomMinutes = getRandomMinutes(minMinutes, maxMinutes);

        // Print the result
        System.out.println("Random Minutes: " + randomMinutes);
    }

    // Method to generate a random number within a range
    public static int getRandomMinutes(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
