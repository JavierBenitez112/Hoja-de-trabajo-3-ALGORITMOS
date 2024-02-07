package GeneradorNumAleatorios;

import java.util.Random;

public class RandomNumberGenerator {
   public RandomNumberGenerator() {
   }

   public static void main(String[] args) {
      int[] randomNumbers = generateRandomNumbers(3000);
      int[] var5 = randomNumbers;
      int var4 = randomNumbers.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         int number = var5[var3];
         System.out.println(number);
      }

   }

   public static int[] generateRandomNumbers(int count) {
      int[] numbers = new int[count];
      Random random = new Random();

      for(int i = 0; i < count; ++i) {
         numbers[i] = random.nextInt(Integer.MAX_VALUE);
      }

      return numbers;
   }
}
