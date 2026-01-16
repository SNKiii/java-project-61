package hexlet.code;

import hexlet.code.game.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner gameNumber = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n 1 - Great\n 2 - Even\n 3 - Calc\n 4 - GCD\n 5 - Progression\n 6 - Prime\n 0 - Exit\n");
        String input = gameNumber.nextLine();
        switch(input){
            case "0":
            break;
            case "1":
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                break;
            case "2":
                Even.gameEven();
                break;
            case "3":
                Calc.gameCalc();
                break;
            case "4":
                GCD.gameGCD();
                break;
            case "5":
                Progression.gameProgression();
                break;
            case "6":
                Prime.gamePrime();
                break;
            default:
                throw new RuntimeException("Unknown user input '" + input + "' in game selection.");
        }

    }
}