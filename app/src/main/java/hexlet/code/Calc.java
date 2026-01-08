package hexlet.code;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Calc {
    //Numbers for a range of random numbers
    private static final int MAX = 10000;
    private static final int MIN = 1;
    //A method for returning a random sign from a hash
    private static String randomSings(Map<Integer, String> signs){
        int randomIndex = (int) (Math.random() * signs.size());
        return signs.get(randomIndex);
    }
    //A method for returning the value of two numbers based on the passed sign
    private static int meaningOfTheExpression(int number1, int number2, String expression){
        return switch (expression) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            default -> 0;
        };
    }
    public static void gameCalc() {
        //We create a hash with the characters of the expression we need.
        final Map<Integer, String> signs = new HashMap<>();
        signs.put(0, "+");
        signs.put(1, "-");
        signs.put(2, "*");
        Scanner answer = new Scanner(System.in);
        int counter = 0;
        System.out.println("Welcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        while (counter < 3) {
            int randomNumber1 = (int) (Math.random() * ((MAX - MIN + 1)) + MIN);
            int randomNumber2 = (int) (Math.random() * ((MAX - MIN + 1)) + MIN);
            String sign = randomSings(signs);
            //We represent our expression in terms of the string.
            String expression = randomNumber1 + sign + randomNumber2;
            int rightAnswer = meaningOfTheExpression(randomNumber1, randomNumber2, sign);
            System.out.println("What is the result of the expression? \nQuestion: " + expression);
            System.out.print("Your answer: ");
            String answerString = answer.nextLine();
            //Verifying the correctness of the user's response. If the answer is correct, the counter is triggered.
            if (answerString.equals(String.valueOf(rightAnswer))) {
                counter++;
                System.out.println("Correct!");
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was" + rightAnswer + "\n" +
                        "Let's try again, " + name + "!");
                break;
            }
        }
        //When the counter is filled in, a line with congratulations is displayed.
        if (counter == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
