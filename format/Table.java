package format;

public class Table {
    public static void main(String[] args) {

        System.out.println("+------------+------------+---------+");
        // Table header
        System.out.printf("| %-10s | %-10s | %-7s |\n", "Name", "Class", "Points");
        // Table separator
        System.out.println("+------------+------------+---------+");

        // Data rows
        System.out.printf("| %-10s | %-10s | %-7d |\n", "Irisa", "Y2A", 95);
        System.out.printf("| %-10s | %-10s | %-7d |\n", "Kalisa", "Y2B", 90);

        // Table bottom
        System.out.println("+------------+------------+---------+");
    }
}
