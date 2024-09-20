import java.util.*;

class student1{
    static int rollno;
    static String name;
    static Float marks1,marks2,marks3;
    public void enterDetails(int rollno,String name, float marks1,float marks2,float marks3){
        student1.rollno = rollno;
        student1.name = name;
        student1.marks1 = marks1;
        student1.marks2 = marks2;
        student1.marks3 = marks3;
    }
}

class newstudent extends student1{
    static float total, avg;
    // public void enterDetails(int rollno,String name, float marks1,float marks2,float marks3){
    //     student1.rollno = rollno;
    //     student1.name = name;
    //     student1.marks1 = marks1;
    //     student1.marks2 = marks2;
    //     student1.marks3 = marks3;
    // }
    public void calculate(){
        total = marks1+marks2+marks3;
        avg = total/3;
    }
    public void details(){
        System.out.println("Total marks = "+total);
        System.out.println("Average = "+avg);
    }
}

public class student{
    public static void main(String[] args){
        int r;
        String n;
        float m1,m2,m3;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter your roll number: ");
        r = i.nextInt();
        System.out.println("Enter your name: ");
        n = i.next();
        System.out.println("Enter your marks1: ");
        m1 = i.nextFloat();
        System.out.println("Enter your marks2: ");
        m2 = i.nextFloat();
        System.out.println("Enter your marks3: ");
        m3 = i.nextFloat();
        newstudent obj = new newstudent();
        obj.enterDetails(r,n,m1,m2,m3);
        obj.calculate();
        obj.details();
    }
}