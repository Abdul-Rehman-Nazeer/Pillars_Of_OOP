import java.util.Arrays;
import java.util.Random;


public class Sorting_Using_Built_in_Functions {
    public static void main(String[] args) {
        Sorting s = new Sorting();
        Random r = new Random();

        int[] intArray = new int[10];
        String[] stringArray = new String[10];

        for (int i = 0; i < 10; i++) {
            intArray[i] = r.nextInt(100);
            stringArray[i] = "String" + (10 - i);
        }

        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        s.sort(intArray);
        System.out.println("Sorted Integer Array (ascending): " + Arrays.toString(intArray));

        System.out.println("Original String Array: " + Arrays.toString(stringArray));
        s.sort(stringArray);
        System.out.println("Sorted String Array (ascending): " + Arrays.toString(stringArray));

        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        s.sort(intArray, true);
        System.out.println("Sorted Integer Array (descending): " + Arrays.toString(intArray));

        System.out.println("Original String Array: " + Arrays.toString(stringArray));
        s.sort(stringArray, true);
        System.out.println("Sorted String Array (descending): " + Arrays.toString(stringArray));
    }
}


class Sorting {
    public void sort(int[] array) {
        Arrays.sort(array);
    }

    public void sort(String[] array) {
        Arrays.sort(array);
    }

    public void sort(int[] array, boolean descending) {
        if (descending) {
            Arrays.sort(array);
            reverseArray(array);
        } else {
            Arrays.sort(array);
        }
    }

    public void sort(String[] array, boolean descending) {
        if (descending) {
            Arrays.sort(array);
            reverseArray(array);
        } else {
            Arrays.sort(array);
        }
    }

    private void reverseArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }

    private void reverseArray(String[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }
}