// package collections;

// public class Generic {
//     public static void main(String[] args) {
//         MyClass<String> cl = new MyClass<>("Hello");
//         MyClass<Integer> ck = new MyClass<>(3);
//     }
// }

// class MyClass<T> {
//     private T value;
//     public MyClass(T value){
//     this.value = value;
//     }
// }   







package collections;

public class Generic {
    public static void main(String[]a) {
        Printer<Integer>p = new Printer<>(6);
        p.display();
    }
}

public class Printer<T> {
    T value;

    public Printer(T value) {
        super();
        this.value = value;
    }
    public void display() {
        System.out.println("the value is " + value);
    }
}