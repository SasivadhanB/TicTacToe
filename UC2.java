import java.util.Random;

class TicTacToe {

    public static void main(String[] args) {

        Random rand = new Random();

        // Toss (0 or 1)
        int toss = rand.nextInt(2);

        char humanSymbol, computerSymbol;
        boolean isHumanTurn;

        if (toss == 0) {
            humanSymbol = 'X';
            computerSymbol = 'O';
            isHumanTurn = true;
        } else {
            humanSymbol = 'O';
            computerSymbol = 'X';
            isHumanTurn = false;
        }

        // Display result
        System.out.println("Toss Result:");

        if (isHumanTurn) {
            System.out.println("Human plays first");
        } else {
            System.out.println("Computer plays first");
        }

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}
