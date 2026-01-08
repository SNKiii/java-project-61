package hexlet.code;

import java.util.Scanner;

public class Even {
    //numbers for a range of random numbers
private static final int MAX = 10000;
private static final int MIN = 1;
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
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n Question: " + randomNumber);
        System.out.print("Your answer: ");
        String answerString = answer.nextLine();
        //verifying the correctness of the user's response. If the answer is correct, the counter is triggered.
        if(randomNumber%2 == 0 && answerString.equals("yes")){
            counter++;
            System.out.println("Correct!");
        } else if(randomNumber%2 != 0 && answerString.equals("no")){
            counter++;
            System.out.println("Correct!");
        } else {
            String correctAnswer = "no";
            if(randomNumber%2 == 0){
                correctAnswer = "yes";
            }
            System.out.println("'" + answerString + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n" +
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
