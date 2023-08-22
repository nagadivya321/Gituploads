import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number:");
		int inputs=scan.nextInt();
		System.out.println("enter second number:");
		int swaps=scan.nextInt();
		int temp;
		swapUsingBitwise(inputs,swaps);
		
}
	public static void swapUsingBitwise(int inputs,int swaps)
	{


		inputs=inputs^swaps;
		swaps=inputs^swaps;
		inputs=inputs^swaps;
		System.out.println("first="+inputs+",second="+swaps);
	}

}
