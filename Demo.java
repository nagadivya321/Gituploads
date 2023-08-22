import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		 int count =countSetBits(num);
		System.out.println("number of set bits:"+count);
		
	}
	public static int countSetBits(int num) {
		int count=0;
		while(num>0)
		{
			count+=num & 1;
			num >>= 1;
			
		}
		return count;
	}

}
