public class TicTacToe {

    public static void main(String[] args) {
        int slot = 7; // change this value (1–9)

        System.out.println("Row: " + getRowFromSlot(slot));
        System.out.println("Column: " + getColFromSlot(slot));
    }

    // Get row index (0–2)
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // Get column index (0–2)
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}
