package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BuchalkaArrays {

    static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[size];

        for (int i = 0; i <= size - 1; i++) {
            ints[i] = scanner.nextInt();
        }
        return ints;
    }

    static void printArray(int[] ints) {
        for (int i = 0; i <= ints.length - 1; i++) {
            System.out.println("Element " + i + " contents " + ints[i]);
        }
    }

    static int[] sortIntegers(int[] ints) {
        Arrays.sort(ints);
        int[] reverseInts = new int[ints.length];
        for (int i = 0; i <= ints.length - 1; i++) {
            reverseInts[i] = ints[ints.length - (i + 1)];
        }
        return reverseInts;
    }
}
