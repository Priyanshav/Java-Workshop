import java.util.*;

class Animal{
        public void sound(){
            System.out.println("Woooooo!");
        }
    }
class Dog extends Animal{
        @override
        public void sound(){
            System.out.println("Dog barks!");
        }

        public void fetch(int a,int b){
            try{
                int res = a/b;
                System.out.println("Result: "+ res);
            }
            catch(ArithmeticException e){
                System.out.println("Error: Cannot divide by 0.");
            }
        }
    }
public class poly{
    public static void main(String[] args){
        System.out.println("Demonstrating Polymorphism......");
        Animal obj1 = new Animal();
        obj1.sound();
        Dog obj2 = new Dog();
        obj2.sound();
        Scanner k = new Scanner(System.in);
        System.out.println("Enter two integers to use for division and demonstrating try-catch: ");
        int m = k.nextInt();
        int n = k.nextInt();
        obj2.fetch(m,n);
    }
}