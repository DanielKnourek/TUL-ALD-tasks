package cz.tul.knourekdaniel.uloha;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SpojovaniPoli {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int arrayLength;
        while ((arrayLength = input.nextInt()) > 0){
            int[] arr1 = loadArray(arrayLength);
            arrayLength = input.nextInt();
            int[] arr2 = loadArray(arrayLength);
            int[] combined = new int[arr1.length + arr2.length];
            System.arraycopy(arr1,0,combined,0,arr1.length);
            System.arraycopy(arr2,0,combined,arr1.length,arr2.length);
            Arrays.sort(combined);
            show(combined);
        }
    }

    private static void show(int[] combined) {
        StringBuilder out = new StringBuilder();
        for (int cislo : combined) {
            out.append(cislo).append(" ");
        }
        System.out.println(out);
    }

    private static int[] loadArray(int arrayLength) {
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }
}
