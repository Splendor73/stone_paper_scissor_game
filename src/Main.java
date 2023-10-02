import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        String userName = userInfo();
        System.out.printf("\nWelcome to our platform, \"%s\"!\n", userName);
        playgames(userName);
    }

    public static String userInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n╔═══════════════════════════════════════════════════╗");
        System.out.println("║  Welcome to the world of STONE - PAPER - SCISSOR  ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
        System.out.println("\nWhat's the name of our guest: ");
        return input.nextLine();
    }

    public static int getRanNumber() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    public static void showStates(int userScore, int compScore, String name) {

        System.out.printf("\n═══════ Score = %s: %d and Computer: %d \n", name, userScore, compScore);
    }

    public static int convertNumber(String s) {
        switch (s.toLowerCase()) {
            case "stone": return 1;
            case "paper": return 2;
            default: return 3;
        }
    }

    public static String getInput() {
        Scanner input = new Scanner(System.in);
        Set<String> validInputs = new HashSet<>(Arrays.asList("stone", "paper", "scissor"));
        System.out.println("\n+------------------------------------------------+");
        System.out.println("Now!! Type your power -- Stone, Paper, or Scissor: ");
        System.out.println("+------------------------------------------------+ ");
        String selection;
        while (true) {
            selection = input.nextLine();
            if (validInputs.contains(selection.toLowerCase())) {
                break;
            } else {
                System.out.println("Wrong input, check your spelling and try again: ");
            }
        }
        return selection;
    }

    public static void printComSelection(int selection) {
        switch (selection) {
            case 1: System.out.print("\n═══════ Computer selects: * STONE *"); break;
            case 2: System.out.print("\n═══════ Computer selects: * PAPER *"); break;
            case 3: System.out.print("\n═══════ Computer selects: * SCISSOR *"); break;
            default: System.out.println("Invalid selection");
        }
    }

    public static void giveResult(int userSelection, int compSelection, String name) {
        System.out.printf("\n═══════");
        if (userSelection == compSelection) {
            System.out.print(" It's a Draw! ");
        } else if ((userSelection == 1 && compSelection == 3) || (userSelection == 2 && compSelection == 1) || (userSelection == 3 && compSelection == 2)) {
            System.out.printf(" %s won this round! ", name);
        } else {
            System.out.print(" Computer won this round! ");
        }

    }

    public static void playgames(String name) {
        Scanner scan = new Scanner(System.in);
        int userPoint = 0;
        int comPoint = 0;
        String Resume = "y";
        while (!Resume.equalsIgnoreCase("q")) {
            int compSelection = getRanNumber();
            String userChoice = getInput();
            int userSelection = convertNumber(userChoice);
            printComSelection(compSelection);
            giveResult(userSelection, compSelection, name);

            if (userSelection == compSelection) {
                System.out.print("No points awarded this round!");
            } else if ((userSelection == 1 && compSelection == 3) || (userSelection == 2 && compSelection == 1) || (userSelection == 3 && compSelection == 2)) {
                userPoint++;
            } else {
                comPoint++;
            }

            showStates(userPoint, comPoint, name);
            System.out.println("\nDo you want to play the next round?\nType q to quit and any other key to continue : ");
            Resume = scan.nextLine();
            if ((Resume == "q") || (Resume == "Q")) {

            }

        }
        System.out.println("\nThanks for playing with us !!");
    }
}