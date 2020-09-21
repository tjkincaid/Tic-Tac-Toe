import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scanned1 = scanner.nextInt();
        int scanned2 = scanner.nextInt();
        int[][] twoDimArray = new int[scanned1][scanned2];
        // test data: 3 4 11 12 13 14 21 22 23 24 31 32 33 34 0 2
        // read into the array
        for (int u = 0; u < scanned1; u++) {
            for (int v = 0; v < scanned2; v++) {
                twoDimArray[u][v] = scanner.nextInt();
            }
        }
        int col1 = scanner.nextInt();
        int col2 = scanner.nextInt();

        for (int i = 0; i < twoDimArray.length; i++) {
            int temp = twoDimArray[i][col1];
            twoDimArray[i][col1] = twoDimArray[i][col2];
            twoDimArray[i][col2] = temp;
        }

        for (int z = 0; z < scanned1; z++) {
            for (int x = 0; x < scanned2; x++) {
                System.out.print(twoDimArray[z][x]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
