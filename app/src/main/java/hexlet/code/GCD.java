package hexlet.code;

import java.util.Scanner;

public class GCD {
    //Numbers for a range of random numbers
    private static final int MAX = 100;
    private static final int MIN = 1;
    //a method for finding the greatest common divisor using the Euclidean algorithm.
    private static int MaxMultiplicity(int number1, int number2){
        while(number2 != 0){
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return Math.abs(number1);
    }
    public static void gameGCD(){
        Scanner answer = new Scanner(System.in);
        int counter = 0;
        System.out.println("Welcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        while(counter < 3) {
            int randomNumber1 = (int) (Math.random() * ((MAX - MIN + 1)) + MIN);
            int randomNumber2 = (int) (Math.random() * ((MAX - MIN + 1)) + MIN);
            int multiNumber = MaxMultiplicity(randomNumber1, randomNumber2);
            System.out.println("Find the greatest common divisor of given numbers.\n Question: " + randomNumber1 + "|" + randomNumber2);
            System.out.print("Your answer: ");
            String answerString = answer.nextLine();
            //We represent our expression in terms of the string.
            if(answerString.equals(String.valueOf(multiNumber))){
                counter++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answerString + "' is wrong answer ;(. Correct answer was " + multiNumber + "\n" +
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
