package GeneradorNumAleatorios;

import java.io.FileWriter;
import java.io.IOException;

public class SaveData {
   public SaveData() {
   }

   public static void main(String[] args) {
      int[] randomNumbers = RandomNumberGenerator.generateRandomNumbers(3000);
      saveNumbersToFile(randomNumbers);
   }

   public static void saveNumbersToFile(int[] numbers) {
      try {
         FileWriter writer = new FileWriter("archiv.txt");
         int[] var5 = numbers;
         int var4 = numbers.length;

         for(int var3 = 0; var3 < var4; ++var3) {
            int number = var5[var3];
            writer.write(Integer.toString(number) + "\n");
         }

         writer.close();
         System.out.println("N\u00fameros guardados en el archivo 'archiv.txt' correctamente.");
      } catch (IOException var6) {
         System.err.println("Error al guardar los n\u00fameros en el archivo: " + var6.getMessage());
         var6.printStackTrace();
      }

   }
}
