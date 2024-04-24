import java.util.ArrayList;
import java.util.List;

// Person class (superclass for Student and Staff)
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Student class
class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student: " + getName() + ", Age: " + getAge() + ", ID: " + studentId;
    }
}

// Staff class
class Staff extends Person {
    private String staffId;

    public Staff(String name, int age, String staffId) {
        super(name, age);
        this.staffId = staffId;
    }

    public String getStaffId() {
        return staffId;
    }

    @Override
    public String toString() {
        return "Staff: " + getName() + ", Age: " + getAge() + ", ID: " + staffId;
    }
}

// School class to manage students and staff
class School {
    private List<Student> students;
    private List<Staff> staff;

    public School() {
        this.students = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

    public void admitStudent(String name, int age, int studentId) {
        Student student = new Student(name, age, studentId);
        students.add(student);
        System.out.println("Student admitted: " + student);
    }

    public void hireStaff(String name, int age, String staffId) {
        Staff staffMember = new Staff(name, age, staffId);
        staff.add(staffMember);
        System.out.println("Staff hired: " + staffMember);
    }

    public void printStudents() {
        System.out.println("\nList of Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printStaff() {
        System.out.println("\nList of Staff:");
        for (Staff staffMember : staff) {
            System.out.println(staffMember);
        }
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        School school = new School();

        school.admitStudent("John Doe", 16, 1001);
        school.admitStudent("Jane Smith", 17, 1002);

        school.hireStaff("Mr. Johnson", 35, "ST101");
        school.hireStaff("Ms. Brown", 40, "ST102");

        school.printStudents();
        school.printStaff();
    }
}
