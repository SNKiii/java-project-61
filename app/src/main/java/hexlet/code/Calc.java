package hexlet.code;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Calc {
    private static final int MAX = 10000;
    private static final int MIN = 1;
    private static String randomSings(Map<Integer, String> sings){
        int randomIndex = (int) (Math.random() * sings.size());
        return sings.get(randomIndex);
    }
    private static int meaningOfTheExpression(int number1, int number2, String expression){
        return switch (expression) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            default -> 0;
        };
    }
    public static void gameCalc() {
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
            String sing = randomSings(signs);
            String expression = randomNumber1 + sing + randomNumber2;
            int rightAnswer = meaningOfTheExpression(randomNumber1, randomNumber2, sing);
            System.out.println("What is the result of the expression? \nQuestion: " + expression);
            System.out.print("Your answer: ");
            String answerString = answer.nextLine();
            if (answerString.equals(String.valueOf(rightAnswer))) {
                counter++;
                System.out.println("Correct!");
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was" + rightAnswer + "\n" +
                        "Let's try again, " + name + "!");
                break;
            }
        }
        if (counter == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
