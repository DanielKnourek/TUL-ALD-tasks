package cz.tul.knourekdaniel.uloha;

import java.util.Scanner;

public class Vyskyt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long counter = input.nextLong();

        for (int i = 0; i < counter; i++) {
            long SequenceNumber1 = input.nextLong();
            long SequenceNumber2 = input.nextLong();
            long current;
            boolean firstTrue = false;
            boolean Result = false;

            long NumberOfnumbers = input.nextLong();
            for (int j = 0; j < NumberOfnumbers; j++) {
                current = input.nextLong();
                if (firstTrue) {
                    if (current == SequenceNumber2) {
                        Result = true;
                    } else {
                        firstTrue = false;
                    }
                }
                if (current == SequenceNumber1){
                    firstTrue = true;
                }
            }
            System.out.println(Result);
        }
    }
}
