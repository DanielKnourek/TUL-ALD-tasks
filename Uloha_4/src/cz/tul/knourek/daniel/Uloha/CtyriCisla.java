package cz.tul.knourek.daniel.Uloha;

import java.util.Scanner;

public class CtyriCisla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ProblemCount = input.nextInt();
        for (int i = 0; i <ProblemCount ; i++) {
            int InVar1 = input.nextInt();
            int InVar2 = input.nextInt();
            int InVar3 = input.nextInt();
            int InVar4 = input.nextInt();
            int Temp;
            var StateChanged = true;
            while (StateChanged){
                StateChanged = false;
            if (InVar1>InVar2){Temp = InVar1; InVar1 = InVar2; InVar2 = Temp; StateChanged = true; }
            if (InVar2>InVar3){Temp = InVar2; InVar2 = InVar3; InVar3 = Temp; StateChanged = true; }
            if (InVar3>InVar4){Temp = InVar3; InVar3 = InVar4; InVar4 = Temp; StateChanged = true; }
            }
            System.out.printf("%d %d %d %d %n",InVar1,InVar2,InVar3,InVar4);
        }
    }
}
