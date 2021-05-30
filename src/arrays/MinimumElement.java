package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int sizeOfArray) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfInts = new int[sizeOfArray];

        for (int i = 0; i <= sizeOfArray - 1; i++){
            arrayOfInts[i] = scanner.nextInt();
        }
        return arrayOfInts;
    }

    private static int findMin(int[] arrayOfInts){
        Arrays.sort(arrayOfInts);
        return arrayOfInts[0];
    }
}
