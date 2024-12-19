import java.util.Random;

public class RandomMinutes {
    public static void main(String[] args) {
        // Define the range for random even minutes (e.g., 0 to 58)
        int minMinutes = 0;
        int maxMinutes = 59;

        // Generate a random even number of minutes
        int randomEvenMinutes = getRandomEvenMinutes(minMinutes, maxMinutes);

        // Print the result
        System.out.println("Random Even Minutes: " + randomEvenMinutes);
    }

    // Method to generate a random even number within a range
    public static int getRandomEvenMinutes(int min, int max) {
        Random random = new Random();

        // Ensure the range is valid for even numbers
        int adjustedMin = (min % 2 == 0) ? min : min + 1;
        int adjustedMax = (max % 2 == 0) ? max : max - 1;

        if (adjustedMin > adjustedMax) {
            throw new IllegalArgumentException("No even numbers in the given range");
        }

        // Generate a random even number
        int randomEven = random.nextInt((adjustedMax - adjustedMin) / 2 + 1) * 2 + adjustedMin;
        return randomEven;
    }
}
