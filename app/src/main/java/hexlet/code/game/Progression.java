package hexlet.code.game;

import hexlet.code.Engine;
import java.util.Arrays;

public class Progression {
    //numbers for the array size range
    private static final int MAX_SIZE = 10;
    private static final int MIN_SIZE = 5;
    //numbers for the range of the common multiplier
    private static final int MAX_MULTIPLIER = 20;
    private static final int MIN_MULTIPLIER = 2;
    //numbers for a range of random numbers
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;
    //Method for generating an array with progression numbers
    private static String[] generateArr(int multiplier, int sizeProgression, int randomFirstNumber) {
        String[] arrProgression = new String[sizeProgression];
        int copyRandomFirstNumber = randomFirstNumber;
        for(int i = 0; i < sizeProgression; i++){
            arrProgression[i] = String.valueOf(copyRandomFirstNumber + multiplier);
            copyRandomFirstNumber = Integer.parseInt(arrProgression[i]);
        }
        return arrProgression;
    }
    public static void gameProgression(){
        int counter = 0;
        String[][] answersToQuestions = new String[3][2];
        String questions = "What number is missing in the progression?";
        while(counter < Engine.ROUNDS) {
            int multiplier = (int) (Math.random() * (MAX_MULTIPLIER - MIN_MULTIPLIER + 1) + MIN_MULTIPLIER);
            int sizeProgression = (int) (Math.random() * (MAX_SIZE - MIN_SIZE + 1) + MIN_SIZE);
            int randomFirstNumber = (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER);
            String[] arrProgression = generateArr(multiplier,sizeProgression, randomFirstNumber);
            int randomPosition = (int) (Math.random() * arrProgression.length);
            String[] copyArrProgression = Arrays.copyOf(arrProgression, arrProgression.length);
            copyArrProgression[randomPosition] = "..";
            String EncryptedProgressionString = String.join(" ", copyArrProgression);
            answersToQuestions[counter][0] = EncryptedProgressionString;
            answersToQuestions[counter][1] = String.valueOf(arrProgression[randomPosition]);
            counter++;
        }
        Engine.greeting(answersToQuestions, questions);
    }
}
