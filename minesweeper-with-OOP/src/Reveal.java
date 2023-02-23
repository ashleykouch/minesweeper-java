public class Reveal {
    
     // reveal hidden item
    public static void reveal(int row, int col) {
        int count = 0;
        for (int i = row - 1; i<= row + 1; i++) {
            for (int j = col -1; j <= col + 1; j++) {
                if (i >= 0 && i < MinesweeperGame.rows && j >= 0 && j < MinesweeperGame.cols && MinesweeperGame.mine[i][j]) {
                    count++;
                }
            }
        }
        MinesweeperGame.gameboard[row][col] = (char) (count + '0');
    }
}
