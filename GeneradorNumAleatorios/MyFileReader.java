package GeneradorNumAleatorios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public static int[] readNumbersFromFile(String fileName) {
        int[] numbers = null;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                count++;
            }
            numbers = new int[count];
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Lee los números del archivo
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                numbers[i++] = Integer.parseInt(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return numbers;
    }
}
