package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner gameNumber = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n 1 - Great\n 2 - Even\n 0 - Exit\n");
        String game = gameNumber.nextLine();
        switch(game){
            case "0":
            break;
            case "1":
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                break;
            case "2":
                Even.gameEven();
                break;
            default:
                System.out.println("incorrect syntax. Please try again");
        }

    }
}