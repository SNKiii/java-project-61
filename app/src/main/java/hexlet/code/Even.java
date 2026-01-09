package hexlet.code;

public class Even {
    //numbers for a range of random numbers
    private static final int MAX = 10000;
    private static final int MIN = 1;

    public static void gameEven() {
        String[][] answersToQuestions = new String[3][2];
        int counter = 0;
        String questions = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        while (counter < 3) {
            int randomNumber = (int) (Math.random() * ((MAX - MIN + 1)) + MIN);
            if (randomNumber % 2 == 0) {
                answersToQuestions[counter][0] = String.valueOf(randomNumber);
                answersToQuestions[counter][1] = "yes";
                counter++;
            } else {
                answersToQuestions[counter][0] = String.valueOf(randomNumber);
                answersToQuestions[counter][1] = "no";
                counter++;
            }
        }
        Engine.greeting(answersToQuestions, questions);
    }
}
