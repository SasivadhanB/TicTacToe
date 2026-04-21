public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {
        System.out.println(isValidMove(1, 1)); // example test
    }

    static boolean isValidMove(int row, int col) {
        // Check if row and column are within bounds (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if the cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        // If both conditions pass, move is valid
        return true;
    }
}
