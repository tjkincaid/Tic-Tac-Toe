package tictactoe;
import java.util.Scanner;

public class Main {
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
    }
}
