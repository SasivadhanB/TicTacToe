import java.util.Scanner;

public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            printBoard();

            if (isHumanTurn) {
                System.out.println("Player X turn:");
                System.out.print("Enter row (0-2): ");
                int row = sc.nextInt();
                System.out.print("Enter col (0-2): ");
                int col = sc.nextInt();

                if (board[row][col] == ' ') {
                    board[row][col] = 'X';
                    checkGameStatus();
                    isHumanTurn = false; // switch turn
                } else {
                    System.out.println("Cell already occupied. Try again.");
                }

            } else {
                System.out.println("Player O turn:");
                System.out.print("Enter row (0-2): ");
                int row = sc.nextInt();
                System.out.print("Enter col (0-2): ");
                int col = sc.nextInt();

                if (board[row][col] == ' ') {
                    board[row][col] = 'O';
                    checkGameStatus();
                    isHumanTurn = true; // switch turn
                } else {
                    System.out.println("Cell already occupied. Try again.");
                }
            }
        }

        printBoard();
        System.out.println("Game Over!");
        sc.close();
    }

    // Print board
    static void printBoard() {
        System.out.println("\nBoard:");
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
        }
        System.out.println();
    }

    // Check win or draw
    static void checkGameStatus() {
        // Check rows & columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' &&
                board[i][0] == board[i][1] &&
                board[i][1] == board[i][2]) {
                System.out.println("Winner: " + board[i][0]);
                gameOver = true;
                return;
            }

            if (board[0][i] != ' ' &&
                board[0][i] == board[1][i] &&
                board[1][i] == board[2][i]) {
                System.out.println("Winner: " + board[0][i]);
                gameOver = true;
                return;
            }
        }

        // Check diagonals
        if (board[0][0] != ' ' &&
            board[0][0] == board[1][1] &&
            board[1][1] == board[2][2]) {
            System.out.println("Winner: " + board[0][0]);
            gameOver = true;
            return;
        }

        if (board[0][2] != ' ' &&
            board[0][2] == board[1][1] &&
            board[1][1] == board[2][0]) {
            System.out.println("Winner: " + board[0][2]);
            gameOver = true;
            return;
        }

        // Check draw
        boolean draw = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    draw = false;
                }
            }
        }

        if (draw) {
            System.out.println("It's a draw!");
            gameOver = true;
        }
    }
}
