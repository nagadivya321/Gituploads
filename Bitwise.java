import java.util.Scanner;

public class Bitwise {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first integer:");
		int inputs=scan.nextInt();
		System.out.println("enter the second integer:");
		int swaps=scan.nextInt();
		int a;
		a=inputs^swaps;
	    inputs=swaps^a;
		swaps=a^inputs;
		swapUsingBitwise(inputs,swaps);	
	}
	public static void swapUsingBitwise(int inputs,int swaps) {
		System.out.println("after swapping:first= "+ inputs+", second="+swaps);
	}
}
