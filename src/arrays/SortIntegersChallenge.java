package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortIntegersChallenge {
    public static void main(String[] args) {

        int[] ints = getIntegers();
        printArray(ints);
        sortIntegers(ints);

    }

    static int[] getIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many integers would you like to sort? ");
        int howMany = scanner.nextInt();
        int[] ints = new int[howMany];

        for (int i = 0; i <= howMany - 1; i++) {
            System.out.print("Type " + (i + 1) + " integer: ");
            ints[i] = scanner.nextInt();
        }
        return ints;
    }

    static void printArray(int[] ints) {
        System.out.println("Array of originally entered integers:");
        System.out.println(Arrays.toString(ints));
    }

    static void sortIntegers(int[] ints) {
        Arrays.sort(ints);
        int[] reverseInts = new int[ints.length];
        for (int i = 0; i <= ints.length - 1; i++) {
            reverseInts[i] = ints[ints.length - (i + 1)];
        }
        System.out.println(Arrays.toString(reverseInts));
    }
}
