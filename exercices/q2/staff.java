class staff extends person{
    public staff( String firstName,String lastName,String dob, String gender,String phone){
    super(firstName,lastName,dob,gender, phone);
    }
    public void displayIdentification(){
        System.out.println("Hello I'm staff");
    }
}