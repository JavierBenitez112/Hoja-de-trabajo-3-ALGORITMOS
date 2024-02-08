package Sorts;

public class Quick {
    public static void quicksort(int arreglo[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, indiceParticion);
            quicksort(arreglo, indiceParticion + 1, derecha);
        }
    }

    private static int particion(int arreglo[], int izquierda, int derecha) {
        int pivote = arreglo[izquierda];
        while (true) {
            while (arreglo[izquierda] < pivote) {
                izquierda++;
            }
            while (arreglo[derecha] > pivote) {
                derecha--;
            }
            if (izquierda >= derecha) {
                return derecha;
            } else {
                int temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
        }
    }

    public static void quicksort(String arreglo[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, indiceParticion);
            quicksort(arreglo, indiceParticion + 1, derecha);
        }
    }

    private static int particion(String arreglo[], int izquierda, int derecha) {
        String pivote = arreglo[izquierda];
        while (true) {
            while (arreglo[izquierda].compareTo(pivote) < 0) {
                izquierda++;
            }
            while (arreglo[derecha].compareTo(pivote) > 0) {
                derecha--;
            }
            if (izquierda >= derecha) {
                return derecha;
            } else {
                String temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
        }
    }
}
