package cz.tul.knourek.daniel.Uloha;

import java.util.Scanner;

public class RozkladCisla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            int InVal = input.nextInt();
            if ( InVal < 0 ){break; }

            int Zbytek = InVal;
            String OutString = "";

            for (int i = 2; i < Math.sqrt(InVal); i++) {
                while (Zbytek % i == 0){
                    Zbytek /=i;
                    OutString += i + " ";
                }
            }
            if (Zbytek > 1){
                OutString += " " + Zbytek;
            }

            System.out.printf("%s%n",OutString);
        }
    }
}
