import java.util.Scanner;

public class Delemma {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two '+ - * ' numbers");
		Scanner input = null;
		String operator = input.next();
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a+b;
		switch(c)	
		{
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		
		}
	}

}
