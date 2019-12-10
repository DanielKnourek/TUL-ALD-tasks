package cz.tul.knourekdaniel.uloha;

import java.util.Scanner;

import static java.lang.String.*;

public class Vycetka {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfBills;
        while ((numberOfBills = input.nextInt()) > 0){
            long[] Bills = loadBills(numberOfBills);
            long Money;
            while ((Money = input.nextLong()) > 0){
                ShowBillsAndCounts(Money, Bills);
            }
        }
    }

    private static long[] loadBills(int numberOfBills) {
        long[] Bills = new long[numberOfBills];
        for (int i = 0; i < numberOfBills; i++) {
            Bills[i] = input.nextLong();
        }
        return Bills;
    }


    private static void ShowBillsAndCounts(long money, long[] Bills){
        StringBuilder Count = new StringBuilder();
        for (long bill : Bills) {
            Count.append(format("%d ", money / bill));
            money %= bill;
        }
        System.out.printf("%s%n", Count.toString());
    }
}
