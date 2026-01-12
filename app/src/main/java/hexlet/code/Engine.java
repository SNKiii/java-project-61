package hexlet.code;

import java.util.Scanner;


public class Engine {
    public static final int ROUNDS = 3;
public static void greeting(String[][] answersToQuestions, String questionHeader){
    Scanner answer = new Scanner(System.in);
    System.out.println("Welcome to the Brain Games!");
    Scanner input = new Scanner(System.in);
    System.out.print("May I have your name? ");
    String name = input.nextLine();
    System.out.println("Hello, " + name + "!");
    System.out.println(questionHeader);
    for(String[] i : answersToQuestions){
        System.out.println("Question: " + i[0]);
        System.out.print("Your answer: ");
        String answerString = answer.nextLine();
        if(answerString.equals(i[1])){
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answerString + "' is wrong answer ;(. Correct answer was '" + i[1] + "'.\n" +
                    "Let's try again, " + name + "!");
            System.exit(0);
        }
    }
    System.out.println("Congratulations, " + name + "!");
}
}
