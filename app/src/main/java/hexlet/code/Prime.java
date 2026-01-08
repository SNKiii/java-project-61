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
        Scanner answer = new Scanner(System.in);
        int counter = 0;
        System.out.println("Welcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        while(counter < 3) {
            int randomNumber = (int) (Math.random() * ((MAX - MIN + 1)) + MIN);
            boolean checkingPrime = checkingPrimeNumber(randomNumber);
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.\n Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answerString = answer.nextLine();
            //verifying the correctness of the user's response. If the answer is correct, the counter is triggered.
            if(answerString.equals("yes") && checkingPrime){
                counter++;
                System.out.println("Correct!");
            } else if(answerString.equals("no") && !checkingPrime){
                counter++;
                System.out.println("Correct!");
            } else {
                String correctAnswer = "no";
                if(checkingPrime){
                    correctAnswer = "yes";
                }
                System.out.println("'" + answerString + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'\n" +
                        "Let's try again, " + name + "!");
                break;
            }
        }
        //When the counter is filled in, a line with congratulations is displayed.
        if(counter == 3){
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
