package collections;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void myIdentification() {
        System.out.println("I am an animal.");
    }

    public String getName() {
        return name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void myIdentification() {
        System.out.println("I am a cat named " + getName());
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void myIdentification() {
        System.out.println("I am a dog named " + getName());
    }
}

 public class AnimalTest {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal");
        Cat myCat = new Cat("Fluffy");
        Dog myDog = new Dog("Buddy");

        // Using the myIdentification method for each class
        genericAnimal.myIdentification();
        myCat.myIdentification();
        myDog.myIdentification();
    }
}
