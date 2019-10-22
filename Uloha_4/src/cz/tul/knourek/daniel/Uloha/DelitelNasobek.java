package cz.tul.knourek.daniel.Uloha;

import java.util.Scanner;

public class DelitelNasobek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run){
            Long InValA = input.nextLong();
            if ( InValA < 0 ){break; }

            Long InValB = input.nextLong();
            Long Nasobek;
            Long ValA = InValA;
            Long ValB = InValB;

            while (ValB != 0) {
                long tmp = ValA;
                ValA = ValB;
                ValB = tmp % ValB;
            }
            Nasobek = (InValA * InValB)/ValA;

            System.out.printf("%d %d%n",ValA, Nasobek);
        }
    }
}
