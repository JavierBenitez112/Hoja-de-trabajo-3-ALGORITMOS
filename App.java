import GeneradorNumAleatorios.MyFileReader;
import Sorts.Gnome;
import Sorts.Quick;
import Sorts.Radix;
import Sorts.Bubble;

import Sorts.Merge.MergeSortAlgorithm;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = MyFileReader.readNumbersFromFile("archiv.txt");
        System.out.println("Archivo leído con éxito!");

        System.out.println("Seleccione el método de ordenamiento:");
        System.out.println("1. Gnome Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Radix Sort");
        System.out.println("5. Bubble Sort");

        int option = scanner.nextInt();

        for (int blockSize = 10; blockSize <= 3000; blockSize += 10) {
            int[] numbersCopy = new int[blockSize];
            for (int i = 0; i < blockSize; i++) {
                numbersCopy[i] = numbers[i];
            }

            switch (option) {
                case 1:
                    Gnome.gnomeSort(numbersCopy, numbersCopy.length);
                    break;
                case 2:
                    MergeSortAlgorithm.mergeSort(numbersCopy);
                    break;
                case 3:
                    Quick.quicksort(numbersCopy, 0, numbersCopy.length - 1);
                    break;
                case 4:
                    Radix.radixsort(numbersCopy, numbersCopy.length);
                    break;
                case 5:
                    Bubble.bubbleSort(numbersCopy, numbersCopy.length);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    return;
            }
        }

        System.out.println("Proceso de ordenamiento completado.");

        scanner.close();
    }
}
