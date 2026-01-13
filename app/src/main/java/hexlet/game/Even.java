package hexlet.game;
import hexlet.code.Engine;

public class Even {
    //numbers for a range of random numbers
    private static final int MAX = 10000;
    private static final int MIN = 1;

    public static void gameEven() {
        String[][] answersToQuestions = new String[3][2];
        int counter= 0;
        String answer = "";
        String questions = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        while (counter < Engine.ROUNDS) {
            int randomNumber = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            answer = randomNumber %2 == 0 ? "yes" : "no";
            answersToQuestions[counter][0] = String.valueOf(randomNumber);
            answersToQuestions[counter][1] = answer;
            counter++;
        }
        Engine.greeting(answersToQuestions, questions);
    }
}
