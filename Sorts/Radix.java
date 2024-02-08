package Sorts;

import java.util.Arrays;

public class Radix {
    // Una función de utilidad para obtener el valor máximo en arr[]
    private static int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    // Una función para hacer el conteo de los elementos de arr[] según
    // el dígito representado por exp.
    private static void countSort(int arr[], int n, int exp) {
        int output[] = new int[n]; // arreglo de salida
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Almacena el conteo de ocurrencias en count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // Cambia count[i] para que count[i] contenga
        // la posición real de este dígito en output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Construye el arreglo de salida
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copia el arreglo de salida a arr[], de modo que arr[] ahora
        // contiene números ordenados según el dígito actual
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // La función principal para ordenar arr[] de
    // tamaño n usando Radix Sort
    public static void radixsort(int arr[], int n) {
        // Encuentra el número máximo para conocer el número de dígitos
        int m = getMax(arr, n);

        // Hace el conteo para cada dígito. Nota que
        // en lugar de pasar el número del dígito, se pasa exp.
        // exp es 10^i donde i es el número de dígito actual
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

    // Una función de utilidad para imprimir un arreglo
    public static void print(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
