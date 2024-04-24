package collections;
public class DisplayData<T,P> {
    private T data1;
    private P data2;

    public DisplayData(T data1,P data2) {
        this.data1 = data1;
        this.data2 = data2;
    }
    public DisplayData(T data1) {
        this.data1 = data1;
    }
    public void printAnything(){
        System.out.print("the first value is "+ data1 +"the second is "+ data2);
        
    }

    public void display() {
        System.out.println("Data: " + data1);
    }

    public static void main(String[] args) {
        // Example usage with Integer
        DisplayData<Integer,String> play = new DisplayData<>(78,"leslie");
        play.printAnything();
    }
}