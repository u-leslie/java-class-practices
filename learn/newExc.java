import java.util.Scanner;

class Except {
    public static void main(String [] args){
        int a,c,b;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter first number");
        a=k.nextInt();
        System.out.println("Enter second number");
        b=k.nextInt();
        try{
            if(b==0)
                throw new ArithmeticException("number divide by 0 is infinity");
            c=a/b;
            System.out.println("the result is:"+c);
        }catch(ArithmeticException e){
       System.out.println(e);
       e.printStackTrace();
        }
    }
}