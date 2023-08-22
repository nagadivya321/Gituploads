import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number:");
		float a=scan.nextFloat();
		float b=scan.nextFloat();
		int c= scan.nextInt();
		double d=scan.nextDouble();
		byte e=scan.nextByte();
		short f=scan.nextShort();
		long g=scan.nextLong();
		double add=a+b+c+d+e+f+g;
		
		System.out.println( "addition of three numbers "+  add);
		boolean h=scan.nextBoolean();
		System.out.println(h);
		System.out.println("are u married? say true or flase");
		boolean i=scan.nextBoolean();
		System.out.println(i);
		System.out.println("enter ur insta id:");
		String j=scan.next();
		System.out.println(j);
		System.out.println("enter ur full name");
		scan.nextLine();
		String k=scan.nextLine();
		System.out.println(k);
	}
		

	}

