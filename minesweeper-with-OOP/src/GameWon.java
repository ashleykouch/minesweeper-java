public class GameWon {
    
        // determine if game is won
    public static boolean isWon() {
        
        for (int i = 0; i < MinesweeperGame.rows; i++) {
            for (int j = 0; j < MinesweeperGame.cols; j++){
                if (MinesweeperGame.gameboard[i][j] == '-' && !MinesweeperGame.mine[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
