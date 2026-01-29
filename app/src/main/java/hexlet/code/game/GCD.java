package hexlet.code.game;

import hexlet.code.Engine;

public class GCD {
    //Numbers for a range of random numbers
    private static final int MAX = 100;
    private static final int MIN = 1;

    //a method for finding the greatest common divisor using the Euclidean algorithm.
    private static int maxMultiplicity(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return Math.abs(number1);
    }

    public static void gameGCD() {
        int counter = 0;
         String[][] answersToQuestions = new String[Engine.ROUNDS][2];
         String questions = "Find the greatest common divisor of given numbers.";
        while (counter < Engine.ROUNDS) {
            int randomNumber1 = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            int randomNumber2 = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            int multiNumber = maxMultiplicity(randomNumber1, randomNumber2);
            answersToQuestions[counter][0] = randomNumber1 + " " + randomNumber2;
            answersToQuestions[counter][1] = String.valueOf(multiNumber);
            counter++;
        }
       Engine.greeting(answersToQuestions, questions);
    }
}
