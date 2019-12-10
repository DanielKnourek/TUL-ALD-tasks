package cz.tul.knourekdaniel.uloha;

import java.util.Scanner;

public class StejnaData {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfProblems = input.nextInt();
        boolean result;
        for (int i = 0; i < numberOfProblems; i++) {
            result = true;
            int[] Data1 = loadArray(input.nextInt());
            int[] Data2 = loadArray(input.nextInt());
            if (Data1.length != Data2.length) {
                result = false;
            } else {
                for (int number : Data1) {
                    if ((showCountOfVal(Data1, number)) != (showCountOfVal(Data2, number))) {
                        result = false;
                        break;
                    }
                }
            }
            System.out.println((result) ? 1 : 0);

        }
    }

    private static int[] loadArray(int length) {
        int[] data = new int[length];
        for (int i = 0; i < length; i++) {
            data[i] = input.nextInt();
        }
        return data;
    }

    private static int showCountOfVal(int[] array, int Val) {
        int Count = 0;
        for (int item : array) {
            if (item == Val) {
                Count++;
            }
        }
        return Count;
    }
}
