import java.util.Scanner;
class loops {
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter number 1: ");
 int num1 = scanner.nextInt();
// Scanner scanner = new Scanner(System.in);
System.out.println("Enter number 2: ");
int num2 = scanner.nextInt();
int sum=(num1+num2);
System.out.println("Sum: "+sum);
int ask;
do{
    System.out.println("Do you want to repeat operation");
     ask = scanner.nextInt();
    System.out.println("Sum: "+sum);
}
while(ask==1);
    System.out.println("exited the loop");

}
}


