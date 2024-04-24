package Serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Serialize {
    public static void main(String[] args)throws IOException, ClassNotFoundException {
        Student[] Students = {
                new Student("Leslie", "leslie@gmail.com"),
                new Student("Anne", "anne@gmail.com")
        };
        writeObjectToFile(Students, "/home/leslie/Documents/student.txt");
        Student[] Students2 = readStudents("/home/leslie/Documents/student.txt");
        // display student
        for(Student p:Students2){
            System.out.println(p);
        }
    }
    private static void writeObjectToFile(Student[] Students, String filename) throws IOException {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename))) {
            os.writeObject(Students);
            System.out.println(String.format("Student added", filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Student[] readStudents(String filename) throws IOException, ClassNotFoundException {
        Student[] Students = null;
        try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream(filename))) {
            Students = (Student[]) oi.readObject();
            System.out.println("Data got...");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Students;
    }
}
class Student implements Serializable {
    private String name;
    private String email;
    public Student(String name, String email) {
        this.email = email;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [ name: " + name + ", email: " + email + "]";
    }
}