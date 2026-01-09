package hexlet.code;


import java.util.Scanner;

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
    private static Integer[] generateArr() {
        int multiplier = (int) (Math.random() * ((MAX_MULTIPLIER - MIN_MULTIPLIER) + 1) + MIN_MULTIPLIER);
        int sizeArr = (int) (Math.random() * ((MAX_SIZE - MIN_SIZE ) + 1) + MIN_SIZE);
        //variable for outputting a random number from 1 to 3, which will be used to select the type of progression
        int randomProgression = (int) (Math.random() * (3 - 1 + 1) + 1);
        int randomFirstNumber = (int) (Math.random() * ((MAX_NUMBER - MIN_NUMBER) + 1) + MIN_NUMBER);
        Integer[] arrProgression = new Integer[sizeArr];
        if (randomProgression == 1) {
            for (int i = 0; i < arrProgression.length; i++) {
                int workingVariable = randomFirstNumber;
                arrProgression[i] = workingVariable + multiplier;
                randomFirstNumber = arrProgression[i];
            }
            return arrProgression;
        } else if (randomProgression == 2) {
            for (int i = 0; i < arrProgression.length; i++) {
                int workingVariable = randomFirstNumber;
                arrProgression[i] = workingVariable * multiplier;
                randomFirstNumber = arrProgression[i];
            }
            return arrProgression;
        } else if(randomProgression == 3){
            for (int i = 0; i < arrProgression.length; i++) {
                int workingVariable = randomFirstNumber;
                arrProgression[i] = workingVariable - multiplier;
                randomFirstNumber = arrProgression[i];
            }
            return arrProgression;
        } else {
            return null;
        }
    }
    //Method for generating a progression string with one missing element
    private static String getFinishedProgression(Integer[] arr, int position){
        String progression = "";
        for(int i = 0; i < arr.length; i++){
            if(i != position) progression += arr[i] + " ";
            else {
                progression += ".. ";
            }
        }
        return progression;
    }
    public static void gameProgression(){
        int counter = 0;
        String[][] answersToQuestions = new String[3][2];
        String questions = "What number is missing in the progression?";
        while(counter < 3) {
            Integer[] arrProgression = generateArr();
            assert arrProgression != null;
            int randomPosition = (int) (Math.random() * arrProgression.length);
            String FinishedProgression = getFinishedProgression(arrProgression, randomPosition);
            answersToQuestions[counter][0] = FinishedProgression;
            answersToQuestions[counter][1] = String.valueOf(arrProgression[randomPosition]);
            counter++;
        }
        Engine.greeting(answersToQuestions, questions);
    }
}
