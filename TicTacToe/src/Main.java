import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Game game = new Game();
        Player player1 = new Player("1");
        Player player2 = new Player("2");
        Player computerPlayer = new Player("CPU");


            System.out.println("TIC-TAC-TOE\n");
            System.out.println("1.PVP");
            System.out.println("2.RULES");
            System.out.println("0.EXIT");

        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        switch (userInput) {
            case "1":
                game.startGame();
                break;
            case "2":
                System.out.println("PVP");
                System.out.println("Turnbased");
                System.out.println(" 2 Symbols: Xs and Os");
                System.out.println("You win if you get 3 symbols aligned");
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
