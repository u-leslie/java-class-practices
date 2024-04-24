class Person{
    String firstName;
    String lastName;
    String gender;
    String dob;
    int phoneNumber;
}

class Staff{
public void displayIdentification(){
    System.out.println("Hello .. am staff");
}
}

class Employee extends Staff{
 public void displayIdentification(){
 System.out.println("Hello .. am  employee");
 }
 public void displayEmployeeType(){
  super.displayIdentification();
 }
}
class School{
    public static void main(String[]args){
        Staff st1 = new Staff();
        Employee e1 = new Employee();
        e1.displayIdentification();
        e1.displayEmployeeType();
        st1.displayIdentification();
    }
}