
public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

// methods
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int smallest(int[] array, int startIndex) {
        int smallest = array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        return indexOfSmallestFrom(array, 0);
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = -1;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] == smallest(table, startIndex)) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = 0;

        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentSmallestIndex = indexOfSmallestFrom(array, i);
            if (currentSmallestIndex != i) {
                swap(array, currentSmallestIndex, i);
            }
            print(array);
        }
    }
}
