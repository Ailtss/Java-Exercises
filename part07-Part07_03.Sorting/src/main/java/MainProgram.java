
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        //int[] array = {3, 1, 5, 99, 3, 12};

        int[] array = {6, 3, 0, -1, 4};

        System.out.println("Smallest: " + smallest(array));
        System.out.println("Index of the smallest: " + indexOfSmallest(array));
        System.out.println(indexOfSmallestFrom(array, 0));
        System.out.println(indexOfSmallestFrom(array, 2));
        System.out.println("");
        System.out.println("");

        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));

    }

    public static int smallest(int[] array) {

        int tam = array.length;
        int smallest = array[0];

        for (int i = 1; i < tam; i++) {

            if (array[i] < smallest) {

                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {

        int tam = array.length;
        int index = 0;
        int smallest = array[0];

        for (int i = 1; i < tam; i++) {

            if (array[i] < smallest) {

                index = i;
                smallest = array[i];
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int tam = table.length;
        int index = startIndex;
        int smallest = table[index];

        for (int i = startIndex; i < tam; i++) {

            if (table[i] < smallest) {

                index = i;
                smallest = table[i];
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {

        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

    public static void sort(int[] array) {

        int tam = array.length;

        for (int i = 0; i < tam; i++) {

            for (int j = i + 1; j < tam; j++) {

                if (array[j] < array[i]) {

                    swap(array, j, i);
                }
            }
        }
    }

//    public static void sort(int[] array) {
//        int index = 0;
//        while (index < array.length - 1) {
//            int smallestAt = indexOfSmallestFrom(array, index);
//            swap(array, index, smallestAt);
//
//            index = index + 1;
//        }
//    }

}
