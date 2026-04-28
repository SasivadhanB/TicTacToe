/**
 * TicTacToe
 * UC10 checks whether the game has ended in a draw
 * by ensuring no empty cells remain on the board.
 */
public class TicTacToe {

    static char[][] board = new char[3][3];

    // Entry point
    public static void main(String[] args) {

        // Example: filling the board (no empty cells)
        board[0][0] = 'X'; board[0][1] = 'O'; board[0][2] = 'X';
        board[1][0] = 'X'; board[1][1] = 'O'; board[1][2] = 'O';
        board[2][0] = 'O'; board[2][1] = 'X'; board[2][2] = 'X';

        System.out.println(isDraw());
    }

    /**
     * Traverses the board to check for any empty cells.
     * @return true if draw, false otherwise
     */
    static boolean isDraw() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == '\0') { // empty cell check
                    return false;
                }
            }
        }
        return true;
    }
}
