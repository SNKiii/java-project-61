package hexlet.code;



public class Progression {
    //numbers for the array size range
    private static final int MAX_SIZE = 10;
    private static final int MIN_SIZE = 5;
    //numbers for the range of the common multiplier
    private static final int MAX_MULTIPLIER = 20;
    private static final int MIN_MULTIPLIER = 2;
    //numbers for a range of random numbers
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;
    //Method for generating an array with progression numbers
    private static String[] generateArr(int multiplier, int sizeProgression, int randomTypeProgression, int randomFirstNumber) {
        String[] arrProgression = new String[sizeProgression];
        if (randomTypeProgression == 1) {
            for (int i = 0; i < arrProgression.length; i++) {
                int workingVariable = randomFirstNumber;
                arrProgression[i] = String.valueOf(workingVariable + multiplier);
                randomFirstNumber = Integer.valueOf(arrProgression[i]);
            }
            return arrProgression;
        } else if (randomTypeProgression == 2) {
            for (int i = 0; i < arrProgression.length; i++) {
                int workingVariable = randomFirstNumber;
                arrProgression[i] = String.valueOf(workingVariable * multiplier);
                randomFirstNumber = Integer.valueOf(arrProgression[i]);
            }
            return arrProgression;
        } else if(randomTypeProgression == 3){
            for (int i = 0; i < arrProgression.length; i++) {
                int workingVariable = randomFirstNumber;
                arrProgression[i] = String.valueOf(workingVariable - multiplier);
                randomFirstNumber = Integer.valueOf(arrProgression[i]);
            }
            return arrProgression;
        } else {
            return arrProgression;
        }
    }
    //Method for generating a progression string with one missing element
    private static String getFinishedProgression(String[] arr, int position){
        String progression = "";
        for(int i = 0; i < arr.length; i++){
            if(i != position) progression += arr[i] + " ";
            else {
                progression += ".. ";
            }
        }
        return progression;
    }
    public static void gameProgression(){
        int multiplier = (int) (Math.random() * (MAX_MULTIPLIER - MIN_MULTIPLIER + 1) + MIN_MULTIPLIER);
        int sizeProgression = (int) (Math.random() * (MAX_SIZE - MIN_SIZE + 1) + MIN_SIZE);
        //variable for outputting a random number from 1 to 3, which will be used to select the type of progression
        int randomTypeProgression = (int) (Math.random() * (3 - 1 + 1) + 1);
        int randomFirstNumber = (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER);
        int counter = 0;
        String[][] answersToQuestions = new String[3][2];
        String questions = "What number is missing in the progression?";
        while(counter < Engine.ROUNDS) {
            String[] arrProgression = generateArr(multiplier,sizeProgression,randomTypeProgression, randomFirstNumber);
            int randomPosition = (int) (Math.random() * arrProgression.length);
            String EncryptedProgressionString = getFinishedProgression(arrProgression, randomPosition);
            answersToQuestions[counter][0] = EncryptedProgressionString;
            answersToQuestions[counter][1] = String.valueOf(arrProgression[randomPosition]);
            counter++;
        }
        Engine.greeting(answersToQuestions, questions);
    }
}
