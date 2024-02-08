import GeneradorNumAleatorios.MyFileReader;
import Sorts.Gnome;
import Sorts.Quick;
import Sorts.Radix;
import Sorts.Bubble;

import Sorts.Merge.MergeSortAlgorithm;

public class App {
    public static void main(String[] args) {
        int[] numbers = MyFileReader.readNumbersFromFile("archiv.txt");
        System.out.println("Archivo creado con exito!");
        
        Gnome.gnomeSort(numbers, numbers.length);
        MergeSortAlgorithm.mergeSort(numbers);
        Quick.quicksort(numbers, 0, numbers.length - 1);
        Radix.radixsort(numbers, numbers.length);
        Bubble.bubbleSort(numbers, numbers.length);
    }
}
