import java.util.*;

class AssertionExample{
    public static void main(String[] args){
        Scanner age = new Scanner(System.in);
        System.out.println("Enter ur age: ");

        int value = age.nextInt();
        assert value >= 18: "Not Valid";
        System.out.println("Value is "+value);
    }
}