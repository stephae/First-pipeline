import java.util.Random;

public class RandomMinutes {
    public static void main(String[] args) {
        int minMinutes = 0;
        int maxMinutes = 59;

        int randomEvenMinutes = getRandomEvenMinutes(minMinutes, maxMinutes);

        System.out.println("Random Even Minutes: " + randomEvenMinutes);
    }

    public static int getRandomEvenMinutes(int min, int max) {
        Random random = new Random();

        int adjustedMin = (min % 2 == 0) ? min : min + 1;
        int adjustedMax = (max % 2 == 0) ? max : max - 1;

        if (adjustedMin > adjustedMax) {
            throw new IllegalArgumentException("No even numbers in the given range");
        }

        int randomEven = random.nextInt(adjustedMax - adjustedMin);
        return randomEven;
    }
}
