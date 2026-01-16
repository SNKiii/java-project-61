package hexlet.code.game;

import java.util.Scanner;

public class Cli {
    public static void greeting(){
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
