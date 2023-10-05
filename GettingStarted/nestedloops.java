import java.util.Scanner;

public class nestedloops {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";
        System.out.println("Enter No of rows");
        rows = scanner.nextInt();
        System.out.println("Enter No of columns");
        columns = scanner.nextInt();
        // Consume the newline character left in the input stream
        scanner.nextLine();
        System.out.println("Enter symbol");
        symbol = scanner.nextLine();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
        scanner.close();
    }
}
