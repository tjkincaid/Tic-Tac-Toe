
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int scanned1 = scanner.nextInt();
        int scanned2 = scanner.nextInt();
        int[][] twoDimArray = new int[scanned1][scanned2];
        int[][] resultArray = new int[scanned2][scanned1];
        // read into the array
        for (int u = 0; u < scanned1; u++) {
            for (int v = 0; v < scanned2; v++) {
                twoDimArray[u][v] = scanner.nextInt();
            }
        }

        for (int i = 0; i < scanned2; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                resultArray[i][j] = twoDimArray[j][i];
            }
        }
        for (int i = 0; i < scanned2; i++) {
            int start = 0;
            int end = scanned1 - 1;

            while (start < end) {

                int temp = resultArray[i][start];
                resultArray[i][start] = resultArray[i][end];
                resultArray[i][end] = temp;

                start++;
                end--;
            }
        }

        for (int z = 0; z < scanned2; z++) {
            for (int x = 0; x < scanned1; x++) {
                System.out.print(resultArray[z][x]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
