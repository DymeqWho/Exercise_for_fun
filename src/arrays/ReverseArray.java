package arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int[] reverseArray = new int[array.length];
        for (int i = 0; i <= array.length - 1; i++) {
            reverseArray[i] = array[array.length - (i+1)];
        }
        array = reverseArray;
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}

class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ReverseArray.reverse(arr);
    }
}
