import java.util.*;
public class greatest{
	public static void main(String[] args){
		int a,b,c,g;
		Scanner i=new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		a=i.nextInt();
		b=i.nextInt();
		c=i.nextInt();

		if(a>b && a>c)
			g=a;
		else if(b>a && b>c)
			g=b;
		else
			g=c;
		System.out.print("Greatest of 3 numbers:"+g);
	}
}