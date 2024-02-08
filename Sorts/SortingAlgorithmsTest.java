package Sorts;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import Sorts.Bubble;
import Sorts.Gnome;
import Sorts.Quick;
import Sorts.Radix;

public class SortingAlgorithmsTest {

    @Test
    public void testBubbleSort() {
        int[] arr = {5, 3, 1, 2, 4};
        int[] sortedArr = {1, 2, 3, 4, 5};
        Bubble.bubbleSort(arr, arr.length);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testGnomeSort() {
        int[] arr = {5, 3, 1, 2, 4};
        int[] sortedArr = {1, 2, 3, 4, 5};
        Gnome.gnomeSort(arr, arr.length);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testQuickSort() {
        int[] arr = {5, 3, 1, 2, 4};
        int[] sortedArr = {1, 2, 3, 4, 5};
        Quick.quicksort(arr, 0, arr.length - 1);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testRadixSort() {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] sortedArr = {2, 24, 45, 66, 75, 90, 170, 802};
        Radix.radixsort(arr, arr.length);
        assertArrayEquals(sortedArr, arr);
    }
}

