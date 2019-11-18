package cz.tul.knourekdaniel.uloha;

import java.util.Scanner;

public class TestCyklickePosloupnosti {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long Counter;
        Counter = input.nextLong();
        do {
            long smallest = 0, largest = 0;
            for (int i = 0; i < Counter; i++) {
                long NumberToTest = input.nextLong();
                if(i == 0){ smallest = NumberToTest; largest = NumberToTest;}
//                smallest = (NumberToTest < smallest) ? NumberToTest : smallest;
                smallest = Math.min(NumberToTest, smallest);
//                largest = (NumberToTest > largest) ? NumberToTest : largest;
                largest = Math.max(NumberToTest, largest);
            }

            System.out.printf("%d %d%n",smallest , largest);

            Counter = input.nextLong();
        }while(Counter >= 0);
    }
}
