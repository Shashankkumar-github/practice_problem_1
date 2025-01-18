import java.util.Random;

public class MinMaxRandom {
    public static void main(String[] args) {
        int[] numbers = new int[5];
    Random random = new Random();

            for (int i = 0; i < 5; i++) {
            numbers[i] = random.nextInt(900) + 100;
       }

         System.out.println("Generated numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
