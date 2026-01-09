package hexlet.code;

import java.util.Scanner;

public class Prime {
    ////Numbers for a range of random numbers
    private static final int MAX = 100;
    private static final int MIN = 1;
    //Method for checking the primality of a number through a square root
    private static boolean checkingPrimeNumber(int primeNumber) {
        if (primeNumber == 2) {
            return true;
        } else if (primeNumber > 2) {
            if (primeNumber % 2 != 0) {
                for (int i = 3; i <= Math.sqrt(primeNumber); i++) {
                    if (primeNumber % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
    public static void gameEven(){
        int counter = 0;
        String[][] answersToQuestions = new String[3][2];
        String questions = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        while(counter < 3) {
            int randomNumber = (int) (Math.random() * ((MAX - MIN + 1)) + MIN);
            boolean checkingPrime = checkingPrimeNumber(randomNumber);
            answersToQuestions[counter][0] = String.valueOf(randomNumber);
            if(checkingPrime){
                answersToQuestions[counter][1] = "yes";
            } else {
                answersToQuestions[counter][1] = "no";
            }
            counter++;
            }
        Engine.greeting(answersToQuestions, questions);
        }
    }

