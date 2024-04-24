import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the oper :");
        String oper = scanner.nextLine();

        switch (oper) {
            case "+":
                oper = "The num is positive";
                break;
            case "-":
                oper = "The num is negative";
                break;
            default:
                oper = "This is zero";
        }

        System.out.println(" " + oper);
    }
}
