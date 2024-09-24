public class Exception{
    public static void main(String[] args){
        try{
            int data = 100/5;
            System.out.println(data);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Rest of the code.....");
    }
}