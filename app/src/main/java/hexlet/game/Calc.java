package hexlet.game;

import java.util.Map;
import java.util.HashMap;
import hexlet.code.Engine;

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
        int counter = 0;
        String question = "What is the result of the expression?:";
        String[][] answersToQuestions = new String[3][2];
        while (counter < Engine.ROUNDS) {
            int randomNumber1 = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            int randomNumber2 = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            String sign = randomSings(signs);
            //We represent our expression in terms of the string.
            String expression = randomNumber1 + sign + randomNumber2;
            int rightAnswer = meaningOfTheExpression(randomNumber1, randomNumber2, sign);
            answersToQuestions[counter][0] = expression;
            answersToQuestions[counter][1] = String.valueOf(rightAnswer);
            counter++;
        }
        Engine.greeting(answersToQuestions, question);
    }
}
