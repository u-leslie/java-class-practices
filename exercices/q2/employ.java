class employee extends staff{
    public employee( String firstName,String lastName,String dob, String gender,String phone){
        super(firstName,lastName,dob,gender,phone);
        }
        @Override
        public void displayIdentification(){
        System.out.println("Hello I'm employee");
        }

        public void displayEmployeeType(){
        super.displayIdentification();
        }
}

class Main{
    public static void main(String[]args){
        employee emp1 = new employee("lesl", "ann", "25252002", "female","1425677");
        emp1.displayIdentification();
        emp1.displayEmployeeType();

        staff st1 = new staff("lesl", "ann", "25252002", "female","1425677");
        st1.displayIdentification();
    }
}
