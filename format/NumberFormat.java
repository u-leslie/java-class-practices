package format;

public class NumberFormat{
    public static void main(String[] args) {
        double number = 15.671059;
        // Format the number with different decimal places
        String formattedNumber1 = String.format("%.0f", number);
        String formattedNumber2 = String.format("%.1f", number);
        String formattedNumber3 = String.format("%.2f", number);
        String formattedNumber4 = String.format("%.3f", number);
        String formattedNumber5 = String.format("%.4f", number);
        // Print the formatted numbers
        System.out.println(formattedNumber1);
        System.out.println(formattedNumber2);
        System.out.println(formattedNumber3);
        System.out.println(formattedNumber4);
        System.out.println(formattedNumber5);
    }
}