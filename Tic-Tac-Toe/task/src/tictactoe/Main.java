package tictactoe;
import java.util.Scanner;

public class Main {

    static String[][] gameboard = new String[3][3];
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String inputString = new String(scanner.next());
        System.out.println("---------");
        System.out.println("| " + inputString.substring(0, 1) + " "
                + inputString.substring(1, 2) + " " + inputString.substring(2, 3) +" |");
        System.out.println("| " + inputString.substring(3, 4) + " "
                + inputString.substring(4, 5) + " " + inputString.substring(5, 6) +" |");
        System.out.println("| " + inputString.substring(6, 7) + " "
                + inputString.substring(7, 8) + " " + inputString.substring(8, 9) +" |");
        System.out.println("---------");

/*
        String testString1 = "XXXOO__O_";
        String testString1 = "XXXOOO_O_";
        String testString2 = "XOXOXOXXO";
        String testString2 = "XOXXXOXXO";
        String testString2 = "XOXOXOXX_";
        String testString3 = "XOOOXOXXO";
        String testString4 = "XOXOOXXXO";
        _OOOO_X_X
        XO_OOOX_X*/
        boolean oWins = false;
        boolean xWins = false;
        boolean empties = false;
        boolean xVo = false;

        gameboard = setGameboard(inputString);

        oWins = isHorizontalWin(gameboard, "O");
        xWins = isHorizontalWin(gameboard, "X");
        xVo = compareCounts(inputString);

        if (!oWins && !xWins) {
            oWins = isVerticalWin(gameboard, "O");
            xWins = isVerticalWin(gameboard, "X");
        }

        if (!oWins && !xWins) {
            oWins = isDiagWin(gameboard, "O");
            xWins = isDiagWin(gameboard, "X");
        }
        empties = isEmpties(gameboard);
        //printGameBoard(gameboard);
        validateResults(xVo, oWins, xWins, empties);

    }

    private static boolean compareCounts(String inputString) {
        long countX = inputString.chars().filter(ch -> ch == 'X').count();
        long countO = inputString.chars().filter(ch -> ch == 'O').count();

        if (Math.abs(countO - countX)  > 1){
            return true;
        }
        return false;
    }

    private static boolean isDiagWin(String[][] gameboard, String player) {
        char result = 'N';
        int count=0;
        for (int i = 0; i < 3; i++){
            if (gameboard[i][i].equals(player)) {
                ++count;
            } else {
                count = 0;
            }
            if (count == 3) return true;
        }
        //2,0 1,1 0,2
        count = 0;
        if (gameboard[0][2].equals(player) && gameboard[1][1].equals(player)
                && gameboard[2][0].equals(player)) {
            return true;
        }
        return false;
    }

    private static boolean isEmpties(String[][] gameboard) {
        for (int i = 0; i < 3; i++){
            for (int x = 0; x < 3; x++){
                if (gameboard[i][x].equals("_")) return true;
            }
        }
        return false;
    }

    private static void validateResults(boolean xVo, boolean oWins, boolean xWins, boolean empties) {
        if (oWins && xWins || xVo){
            System.out.println("Impossible");
        } else if (oWins) {
            System.out.println("O wins");
        } else if (xWins) {
            System.out.println("X wins");
        } else if (!oWins && !xWins && empties) {
            System.out.println("Game not finished");
        } else if (!oWins && !xWins && !empties) {
            System.out.println("Draw");
        }
    }

    private static String[][] setGameboard(String testString) {
        int z = 0;
        for (int i = 0; i<3; i++){
            for (int x = 0; x<3; x++){
                gameboard[i][x] = testString.substring(z, z+1);
                z++;
            }
        }
        return gameboard;
    }

    private static boolean isHorizontalWin(String[][] horGameboard, String player){
        char result = 'N';
        int count=0;
        for (int i = 0; i < 3; i++){
            for (int x = 0; x < 3; x++){
                if (horGameboard[i][x].equals(player)) {
                    ++count;
                } else {
                    count = 0;
                }
                if (count == 3) return true;
            }
            count = 0;
        }
        return false;

    }

    private static boolean isVerticalWin(String[][] horGameboard, String player){
        char result = 'N';
        int count=0;
        for (int i = 0; i < 3; i++){
            for (int x = 0; x < 3; x++){
                if (horGameboard[x][i].equals(player)) {
                    ++count;
                } else {
                    count = 0;
                }
                if (count == 3) return true;
            }
            count = 0;
        }
        return false;

    }

}