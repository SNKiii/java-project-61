package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Cli;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner gameNumber = new Scanner(System.in);
        System.out.print("""
                Please enter the game number and press Enter.
                 1 - Great
                 2 - Even
                 3 - Calc
                 4 - GCD
                 5 - Progression
                 6 - Prime
                 0 - Exit
                """);
        String input = gameNumber.nextLine();
        switch (input) {
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

