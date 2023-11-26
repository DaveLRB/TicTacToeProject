import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
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
                    break;
                case "2":
                    System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
                    System.out.println("Player vs Player game");
                    System.out.println("3x3 board");
                    System.out.println("Turn-based");
                    System.out.println("2 Symbols: Xs and Os");
                    System.out.println("You win if you get 3 symbols aligned");
                    System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
                    break;
                case "0":
                    System.out.println("Exiting Game");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, input correct one");
                    break;
            }
        }
    }
    public static void mainMenu(){
        System.out.println("TIC-TAC-TOE\n");
        System.out.println("1.PVP");
        System.out.println("2.RULES");
        System.out.println("0.EXIT");
    }

}