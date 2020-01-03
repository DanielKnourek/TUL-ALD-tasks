package cz.tul.knourekdaniel.uloha;

import java.util.Scanner;

public class RozmeryPlochy {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int noProblems = input.nextInt();
        for (int problem = 0; problem < noProblems; problem++) {
            char currentChar;
            int index = 0;
            int[] directionMax = new int[]{0, 0, 0, 0}; //West East,South North
            int[] currentPos = new int[]{0,0}; //X, Y

            String currentText = input.next();
            while((currentChar = currentText.charAt(index)) != 'E'){
                switch (currentChar){
                    case 'Z': //East
                        currentPos[0]--;
                        directionMax[0] = Math.min(currentPos[0], directionMax[0]);
                        break;
                    case 'V': //East
                        currentPos[0]++;
                        directionMax[1] = Math.max(currentPos[0], directionMax[1]);
                        break;
                    case 'J': //East
                        currentPos[1]--;
                        directionMax[2] = Math.min(currentPos[1], directionMax[2]);
                        break;
                    case 'S': //East
                        currentPos[1]++;
                        directionMax[3] = Math.max(currentPos[1], directionMax[3]);
                        break;
                }
                
                index++;
                if (index >= currentText.length()){
                    index = 0;
                    currentText = input.next();
                }              
            }
            int width = Math.abs(directionMax[0]) + Math.abs(directionMax[1]) +1;
            int height = Math.abs(directionMax[2]) + Math.abs(directionMax[3]) +1;
            
            System.out.println(width +" "+ height);
        }
    }
}