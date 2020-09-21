import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int scanned = 4;//scanner.nextInt();
        int[][] gameBoard = new int[scanned][scanned];
        int count = 0;
        for (int i = 0; i < scanned; i++){
            for (int j = 0; j < scanned; j++) {
                gameBoard[Math.abs(i)][j] = Math.abs(i+j);

            }
            ++count;
            System.out.println(count);
        }

        for (int z = 0;z < scanned; z++)
        System.out.println(Arrays.deepToString(gameBoard));
    }
}