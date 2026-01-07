package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner gameNumber = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n 1 - Great\n 2 - Even\n 3 - Calc\n 4 - GCD\n 0 - Exit\n");
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
            case "3":
                Calc.gameCalc();
                break;
            case "4":
                GCD.gameGCD();
                break;
            default:
                System.out.println("incorrect syntax. Please try again");
        }

    }
}