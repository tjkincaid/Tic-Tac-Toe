import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int scanned1 = scanner.nextInt();
        int scanned2 = scanner.nextInt();
        int[][] twoDimArray = new int[scanned1][scanned2];
        // test data:
        // 3 4 11 12 13 14 21 22 23 24 31 32 33 34 2
        // 3 4 11 12 13 14 21 22 23 24 31 32 33 34 2
        // 3 4 0 1 0 1 1 1 0 1 1 0 0 1 2
        // read into the array
        for (int u = 0; u < scanned1; u++) {
            for (int v = 0; v < scanned2; v++) {
                twoDimArray[u][v] = scanner.nextInt();
            }
        }
        int countInput = scanner.nextInt();
        int winningRow = 0;
        int countFreeSeats = 0;
        for (int i = 0; i < scanned1; i++) {
            if (winningRow == 0) {
                for (int j = 0; j < scanned2; j++) {
                    switch (twoDimArray[i][j]) {
                        case 0:
                            countFreeSeats++;
                            if (countFreeSeats == countInput) {
                                winningRow = i + 1;
                            }
                            break;
                        case 1:
                            countFreeSeats = 0;
                            break;
                        default:
                            break;

                    }
                }

            }
            countFreeSeats = 0;
        }
        System.out.println(winningRow);
    }
}
