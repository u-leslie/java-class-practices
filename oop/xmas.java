import java.util.Scanner;

public class xmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of the Christmas tree: ");
        int height = scanner.nextInt();

        printChristmasTree(height);
    }

    static void printChristmasTree(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println(); 
        }
        for (int i = 0; i < height / 3; i++) {
            for (int j = 0; j < height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
