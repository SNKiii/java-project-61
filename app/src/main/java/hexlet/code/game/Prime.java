package hexlet.code.game;

import  hexlet.code.Engine;

public class Prime {
    ////Numbers for a range of random numbers
    private static final int MAX = 100;
    private static final int MIN = 1;
    private static final int START_DIVISOR = 3;

    //Method for checking the primality of a number through a square root
    private static boolean isCheckingPrimeNumber(final int primeNumber) {
        if (primeNumber == 2) {
            return true;
        } else if (primeNumber > 2 && primeNumber % 2 != 0) {
                for (int i = START_DIVISOR; i <= Math.sqrt(primeNumber); i++) {
                    if (primeNumber % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        return false;
    }

    public static void gamePrime() {
        int counter = 0;
         String[][] answersToQuestions = new String[Engine.ROUNDS][2];
         String questions = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        while (counter < Engine.ROUNDS) {
            int randomNumber = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            answersToQuestions[counter][0] = String.valueOf(randomNumber);
            if (isCheckingPrimeNumber(randomNumber)) {
                answersToQuestions[counter][1] = "yes";
            } else {
                answersToQuestions[counter][1] = "no";
            }
            counter++;
            }
        Engine.greeting(answersToQuestions, questions);
        }
    }

