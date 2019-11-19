package cz.tul.knourekdaniel.uloha;

import java.util.Scanner;

public class Maxima {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long counter = input.nextLong();

        for (int i = 0; i < counter; i++) {
            long current = input.nextLong();
            int CountOfFirst = NumberOfNonPrimitive(current);
            int TotalCount = 0;

            while((current = input.nextLong()) > 0){
                int count = NumberOfNonPrimitive(current);
                if (CountOfFirst == count) {
                    TotalCount++;
                }

            }
            System.out.printf("%d%n",TotalCount);
        }
    }

    private static int NumberOfNonPrimitive(long number){
        int count = 0;
        for (int i = 2; i <= number/2; i++) {
            count += (number % i == 0) ? 1 : 0;
        }
        return count;
    }
}
