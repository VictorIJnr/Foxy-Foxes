import java.util.Arrays;

public class Game {

    // The following five constants were defined in the starter code (kt54)
    private static final String FOXPLAYS_MSG      = "Fox plays. Enter move:";
    private static final String GEESEPLAY_MSG     = "Geese play. Enter move:";
    private static final String ILLEGALMOVE_MSG   = "Illegal move!";
    private static final String FOXWINS_MSG       = "Fox wins!";
    private static final String GEESEWIN_MSG      = "Geese win!";

    private static final String FREE = "gdfs";

    private Board gameBoard;
    private boolean geeseTurn = true;

    // Minimal constructor. Expand as needed (kt54)
    public Game() {
        gameBoard = new Board();
    }

    // Build on this method to implement game logic.
    public void play() {

        EasyIn2 reader = new EasyIn2();

        gameBoard = new Board();

        boolean done = false;

        while(!done) {
            gameBoard.printBoard();

            if (geeseTurn) System.out.println(GEESEPLAY_MSG);
            if (!geeseTurn) System.out.println(FOXPLAYS_MSG);

            int x1 = reader.getInt();
            int y1 = reader.getInt();
            int x2 = reader.getInt();
            int y2 = reader.getInt();

            if (!movePlayer(x1, y1, x2, y2)) {
                System.out.println(ILLEGALMOVE_MSG);
                continue;
            }

            done = foxWin() || gooseWin();

            if (foxWin()) System.out.println(FOXWINS_MSG);
            if (gooseWin()) System.out.println(GEESEWIN_MSG);

            geeseTurn = !geeseTurn;
        }
    }

    private boolean movePlayer(int x1, int y1, int x2, int y2) {
        int deltaX = (int) Math.pow(Math.abs(x1 - x2), 2);
        int deltaY = (int) Math.pow(Math.abs(y1 - y2), 2);

        int distance = (deltaX < 2 && deltaY < 2 && (deltaX == 1 || deltaY == 1)) ? 1 : 0;
        char[][] board = gameBoard.getBoard();

        if(!geeseTurn)
            if(capture(x1, y1, x2, y2)) return true;


        if(board[x2][y2] == Board.FREE && distance == 1) {
            board[x2][y2] = board[x1][y1];
            board[x1][y1] = Board.FREE;
            gameBoard.setBoard(board);
            return true;
        }
        else return false;
    }

    private boolean capture(int x1, int y1, int x2, int y2) {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;

        char[][] board = gameBoard.getBoard();

        if (board[x1 + deltaX / 2][y1 + deltaY / 2] == Board.GOOSE) {
            board[x2][y2] = board[x1][y1];
            board[x1][y1] = Board.FREE;
            board[x1 + deltaX / 2][y1 + deltaY / 2] = Board.FREE;
            gameBoard.setBoard(board);
            return true;
        }
        else return false;
    }

    private boolean foxWin() {
        for(char[] row : gameBoard.getBoard()) {
            for (char value : row) {
                if (value == Board.GOOSE) return false;
            }
        }

        return true;
    }

    private boolean gooseWin() {
        return surrounded();
    }

    private boolean surrounded() {
        int x, y;
        int[] position = getFoxPosition();
        x = position[0];
        y = position[1];

        char[][] board = gameBoard.getBoard();

        for (int i = x - 1; i < x + 1; i++) {
            for (int j = y - 1; j < y + 1; j++) {
                if (i != x && j != y
                        && i > 0 && j > 0
                        && i < board.length && j < board[0].length)
                    if (board[i][j] != Board.GOOSE && board[i][j] != Board.INVALID) return false;
            }
        }

        return true;
    }

    private boolean cantMove() {
        int x, y;
        int[] position = getFoxPosition();
        x = position[0];
        y = position[1];

        char[][] board = gameBoard.getBoard();

        for (int i = x - 2; i < x + 2; i++) {
            //fori
        }

        return true;
    }

    private int[] getFoxPosition() {
        int[] position = new int[2];
        char[][] board = gameBoard.getBoard();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == Board.FOX) {
                    position[0] = i;
                    position[1] = j;
                }
            }
        }

        return position;
    }
}
