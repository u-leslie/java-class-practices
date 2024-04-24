 class Main{
    public static void main(String [] args){
        try{
           int[] myNumbers ={1,2,3};
        System.out.println(myNumbers[10]);  
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finished execution");
        }
       
    }
}
