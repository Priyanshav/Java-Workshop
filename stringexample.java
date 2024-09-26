import java.util.*;

public class stringexample{
    public static void main(String[] args){
        String s1 = "Priyanshu";
        char ch[] = {'K','u','m','a','r'};
        String s2 = new String(ch);
        String s3 = new String("Chaudhary");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // String Methods :-

        System.out.println(s1.startsWith("P"));
        System.out.println(s3.endsWith("y"));
        System.out.println(s2.charAt(3));
        System.out.println(s3.length());
        System.out.println(s3.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.replace("Priyanshu", "Priyanshav"));
    }
}