import java.util.Scanner;
class Hello {
public static void main(String[]args){
System.out.println("Hello world");
//for loop
int x;
for(x=1;x<=10;x++){
System.out.println(x);
}
//factorial
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
}
}
