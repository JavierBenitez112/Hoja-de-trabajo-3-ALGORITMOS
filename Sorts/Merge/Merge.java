package Sorts.Merge;
import GeneradorNumAleatorios.MyFileReader;


public class Merge {
    public static void main(String[] args) {
        int[] array = MyFileReader.readNumbersFromFile("archiv.txt");
        MergeSortAlgorithm.mergeSort(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}