package services;

import objects.characters.EnemyCharacter;
import objects.characters.PlayerCharacter;

import java.util.Scanner;

public class PrinterService {
    public void printHeading(String heading) {
        lineSeparator(2);
        System.out.println(heading);
        lineSeparator(1);
    }

    public void printOpenerHeading(EnemyCharacter enemyCharacter) {
        lineSeparator(2);
        System.out.println("You've encountered " + enemyCharacter.getName() + "!");
        lineSeparator(1);
    }

    public String getUserTextInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public int printTurnStart(PlayerCharacter playerCharacter, EnemyCharacter enemyCharacter) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("         " + playerCharacter.getName() + "                       " +
                enemyCharacter.getName());
        System.out.println("What will you do?");
        System.out.println("1. Attack");
        System.out.println("2. Use Magic");
        System.out.println("3. Defend");
        System.out.println("4. Use Item");
        System.out.println("5. Run");

        return scanner.nextInt();
    }

    public int getUserNumberInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void printMenuChoices(String[] classArray) {
        for (int i = 0; i < classArray.length; i++) {
            System.out.println(i + 1 + " ) " + classArray[i]);
        }
        lineSeparator(1);
    }

    public void createWhiteSpace(int numberOfLines){
        for (int i = 0; i < numberOfLines; i++){
            System.out.println(" ");
        }
    }

    public void anythingToContinue() {
        boolean userEnteredAnything = false;
        PrinterService printerService = new PrinterService();

        while (!userEnteredAnything) {
            printerService.createWhiteSpace(1);
            printerService.getUserTextInput("** Enter any text to continue. **");

            userEnteredAnything = true;
        }
    }

    private void lineSeparator(int lines) {
        for (int i = 0; i < lines; i++) {
            System.out.println("------***************************************************************------");
        }
    }
}
