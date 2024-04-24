import java.util.Scanner;
 class Minor extends Exception{
    public Minor(String message){
        super(message);
    }
}

class Main{
    public static void main(String[] args){
        int age=0;

    Scanner k =new Scanner(System.in);
    System.out.println("Enter your age");

    age=k.nextInt();
    try{
        if(age<18)
            throw new Minor("Your are under 18 years !");
       else
       System.out.println("You can buy beer!");
    }catch(Minor e){
        System.out.println(e);
        e.printStackTrace();
    }
}
}