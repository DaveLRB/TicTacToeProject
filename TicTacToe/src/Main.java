import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        QuizGame quiz = new QuizGame();
        AmalgamationGame amalgamation = new AmalgamationGame();
        boolean gameEnded = false;

        while (true) {
            if (gameEnded) {
                gameEnded = false;
            } else {
                mainMenu();
            }
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();
            switch (userInput) {
                case "1":
                    game.startGameTicTacToe();
                    gameEnded = true;
                    mainMenu();
                    game.setBoard(new Board());
                    break;
                case "2":
                    quiz.startQuizGame();
                    gameEnded = true;
                    mainMenu();
                    break;
                case "3":
                    amalgamation.startAmalgamationGame();
                    gameEnded = true;
                    mainMenu();
                    break;
                case "4":
                    System.out.println(Colors.YELLOW_BOLD_BRIGHT + "\n\n\n\n△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽" + Colors.RESET);
                    System.out.println(Colors.MAGENTA_BOLD + "△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽\n" + Colors.RESET);
                    System.out.println(Colors.WHITE_BOLD_BRIGHT + "Player vs Player " + Colors.RESET + Colors.YELLOW_BOLD_BRIGHT + "-> " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + "3 Game Modes" + Colors.RESET + Colors.MAGENTA_BOLD + "-> " + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + "Turn-based" + Colors.RESET);
                    System.out.println(Colors.YELLOW_BOLD_BRIGHT + "TicTacToe" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + "\nSymbols: " + Colors.RESET + Colors.YELLOW_BOLD_BRIGHT + "X" + Colors.RESET + Colors.MAGENTA_BOLD + " and" + Colors.RESET + Colors.RED_BOLD_BRIGHT + " O" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + "\n You win if you get 3 symbols aligned" + Colors.RESET);
                    System.out.println(Colors.MAGENTA_BOLD + "Quiz Game" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + "\n Answer the QUESTIONS and the player who has the most correct answers wins!" + Colors.RESET);
                    System.out.println(Colors.YELLOW_BOLD_BRIGHT + "Amalgamation" + Colors.RESET + Colors.WHITE_BOLD_BRIGHT + "\n Play the TicTacToe, the winner plays first on the QuizGame" + Colors.RESET);
                    System.out.println(Colors.WHITE_BOLD_BRIGHT + "If its a draw play it all again!" + Colors.RESET + Colors.RED_BRIGHT + " MUAHAHAHAHAHA\n" + Colors.RESET);
                    System.out.println(Colors.YELLOW_BOLD_BRIGHT + "△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽" + Colors.RESET);
                    System.out.println(Colors.MAGENTA_BOLD + "△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽△▽\n\n\n\n" + Colors.RESET);
                    break;
                case "0":
                    System.out.println(Colors.WHITE_BOLD_BRIGHT + "\n" +
                            "   ('-.  ) (`-.              .-') _               .-') _                                 ('-.     _   .-')       ('-.   \n" +
                            " _(  OO)  ( OO ).           (  OO) )             ( OO ) )                               ( OO ).-.( '.( OO )_   _(  OO)  \n" +
                            "(,------.(_/.  \\_)-. ,-.-') /     '._ ,-.-') ,--./ ,--,'  ,----.            ,----.      / . --. / ,--.   ,--.)(,------. \n" +
                            " |  .---' \\  `.'  /  |  |OO)|'--...__)|  |OO)|   \\ |  |\\ '  .-./-')        '  .-./-')   | \\-.  \\  |   `.'   |  |  .---' \n" +
                            " |  |      \\     /\\  |  |  \\'--.  .--'|  |  \\|    \\|  | )|  |_( O- )       |  |_( O- ).-'-'  |  | |         |  |  |     \n" +
                            "(|  '--.    \\   \\ |  |  |(_/   |  |   |  |(_/|  .     |/ |  | .--, \\       |  | .--, \\ \\| |_.'  | |  |'.'|  | (|  '--.  \n" +
                            " |  .--'   .'    \\_),|  |_.'   |  |  ,|  |_.'|  |\\    | (|  | '. (_/      (|  | '. (_/  |  .-.  | |  |   |  |  |  .--'  \n" +
                            " |  `---. /  .'.  \\(_|  |      |  | (_|  |   |  | \\   |  |  '--'  |        |  '--'  |   |  | |  | |  |   |  |  |  `---. \n" +
                            " `------''--'   '--' `--'      `--'   `--'   `--'  `--'   `------'          `------'    `--' `--' `--'   `--'  `------' \n" + Colors.RESET);
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println(Colors.RED_BRIGHT + "Invalid option, input correct one\n" + Colors.RESET);
                    break;
            }
        }
    }

    private static void mainMenu() {

        System.out.println(Colors.MAGENTA_BOLD + "\n" +
                "▄█─ ─ 　 ▀▀█▀▀ ▀█▀ ░█▀▀█ 　 ▀▀█▀▀ ─█▀▀█ ░█▀▀█ 　 ▀▀█▀▀ ░█▀▀▀█ ░█▀▀▀ \n" + Colors.RESET + Colors.YELLOW_BOLD_BRIGHT +
                "─█─ ▄ 　 ─░█── ░█─ ░█─── 　 ─░█── ░█▄▄█ ░█─── 　 ─░█── ░█──░█ ░█▀▀▀ \n" +
                "▄█▄ █ 　 ─░█── ▄█▄ ░█▄▄█ 　 ─░█── ░█─░█ ░█▄▄█ 　 ─░█── ░█▄▄▄█ ░█▄▄▄" + Colors.RESET);

        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "\n" +
                "█▀█ ─ 　 ░█▀▀█ █──█ ─▀─ ▀▀█ \n" + Colors.RESET + Colors.MAGENTA_BOLD +
                "─▄▀ ▄ 　 ░█─░█ █──█ ▀█▀ ▄▀─ \n" + Colors.RESET + Colors.YELLOW_BOLD_BRIGHT +
                "█▄▄ █ 　 ─▀▀█▄ ─▀▀▀ ▀▀▀ ▀▀▀" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "\n" +
                "█▀▀█ ─ 　 ─█▀▀█ ░█▀▄▀█ ─█▀▀█ ░█─── ░█▀▀█ ─█▀▀█ ░█▀▄▀█ ─█▀▀█ ▀▀█▀▀ ▀█▀ ░█▀▀▀█ ░█▄─░█ \n" +
                "──▀▄ ▄ 　 ░█▄▄█ ░█░█░█ ░█▄▄█ ░█─── ░█─▄▄ ░█▄▄█ ░█░█░█ ░█▄▄█ ─░█── ░█─ ░█──░█ ░█░█░█ \n" + Colors.RESET + Colors.MAGENTA_BOLD +
                "█▄▄█ █ 　 ░█─░█ ░█──░█ ░█─░█ ░█▄▄█ ░█▄▄█ ░█─░█ ░█──░█ ░█─░█ ─░█── ▄█▄ ░█▄▄▄█ ░█──▀█" + Colors.RESET);
        System.out.println(Colors.MAGENTA_BOLD + "\n" +
                "─█▀█─ ─ 　 ░█▀▀█ ░█─░█ ░█─── ░█▀▀▀ ░█▀▀▀█ \n" + Colors.RESET + Colors.YELLOW_BOLD_BRIGHT +
                "█▄▄█▄ ▄ 　 ░█▄▄▀ ░█─░█ ░█─── ░█▀▀▀ ─▀▀▀▄▄ \n" +
                "───█─ █ 　 ░█─░█ ─▀▄▄▀ ░█▄▄█ ░█▄▄▄ ░█▄▄▄█" + Colors.RESET);
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "\n" +
                "█▀▀█ ─ 　 ░█▀▀▀ ▀▄░▄▀ ▀█▀ ▀▀█▀▀ \n" + Colors.MAGENTA_BOLD +
                "█▄▀█ ▄ 　 ░█▀▀▀ ─░█── ░█─ ─░█── \n" + Colors.YELLOW_BOLD_BRIGHT +
                "█▄▄█ █ 　 ░█▄▄▄ ▄▀░▀▄ ▄█▄ ─░█──" +
                "" + Colors.RESET);
    }
}