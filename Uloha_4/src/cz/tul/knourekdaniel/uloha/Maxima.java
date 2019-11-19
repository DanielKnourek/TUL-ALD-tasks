package cz.tul.knourekdaniel.uloha;

import java.util.Scanner;

public class Maxima {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long counter = input.nextLong();

        for (int i = 0; i < counter; i++) {
            long current;

            long max1 = Long.MIN_VALUE;
            long max2 = Long.MIN_VALUE;
            long max3 = Long.MIN_VALUE;
            long max4 = Long.MIN_VALUE;
            int max1count = 0;
            int max2count = 0;
            int max3count = 0;
            int max4count = 0;

            while((current = input.nextLong()) > 0){
                if (current >= max1){
                    if (current == max1) {
                        max1count++;
                    } else {
                        max4 = max3; max3 = max2; max2 = max1; max1 = current;
                        max4count = max3count; max3count = max2count; max2count = max1count; max1count = 1;
                    }
                }else if (current >= max2){
                    if (current == max2) {
                        max2count++;
                    } else {
                        max4 = max3; max3 = max2; max2 = current;
                        max4count = max3count; max3count = max2count; max2count = 1;
                    }
                }else if (current >= max3){
                    if (current == max3) {
                        max3count++;
                    } else {
                        max4 = max3; max3 = current;
                        max4count = max3count; max3count = 1;
                    }
                }else if (current >= max4){
                    if (current == max4) {
                        max4count++;
                    } else {
                        max4 = current;
                        max4count = 1;
                    }
                }
            }
            System.out.printf("%d %d%n",max1,max1count);
            System.out.printf("%d %d%n",max2,max2count);
            System.out.printf("%d %d%n",max3,max3count);
            System.out.printf("%d %d%n",max4,max4count);
        }
    }
}
