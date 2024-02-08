import GeneradorNumAleatorios.MyFileReader;
import Sorts.Bubble;

public class App {
    public static void main(String[] args) {
        int[] numbers = MyFileReader.readNumbersFromFile("archiv.txt");
        System.out.println("Números sin ordenar:");
        printArray(numbers);
        
        // Ordena los números usando Bubble Sort
        Bubble.bubbleSort(numbers, numbers.length);
        
        // Imprime los números ordenados
        System.out.println("Números ordenados:");
        printArray(numbers);
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
