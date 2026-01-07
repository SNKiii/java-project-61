package hexlet.code;


import java.util.Scanner;

public class Progression {
    private static final int MAX_SIZE = 10;
    private static final int MIN_SIZE = 5;
    private static final int MAX_MULTIPLIER = 20;
    private static final int MIN_MULTIPLIER = 2;
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;
    private static Integer[] generateArr() {
        int multiplier = (int) (Math.random() * ((MAX_MULTIPLIER - MIN_MULTIPLIER) + 1) + MIN_MULTIPLIER);
        int sizeArr = (int) (Math.random() * ((MAX_SIZE - MIN_SIZE ) + 1) + MIN_SIZE);
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
        Scanner answer = new Scanner(System.in);
        int counter = 0;
        System.out.println("Welcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        while(counter < 3) {
            Integer[] arrProgression = generateArr();
            assert arrProgression != null;
            int randomPosition = (int) (Math.random() * arrProgression.length);
            String FinishedProgression = getFinishedProgression(arrProgression, randomPosition);
            System.out.println("What number is missing in the progression?\n Question: " + FinishedProgression);
            System.out.print("Your answer: ");
            String answerString = answer.nextLine();
            if(answerString.equals(String.valueOf(arrProgression[randomPosition]))){
                counter++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answerString + "' is wrong answer ;(. Correct answer was " + arrProgression[randomPosition] + "\n" +
                        "Let's try again, " + name + "!");
                break;
            }
        }
        if(counter == 3){
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
