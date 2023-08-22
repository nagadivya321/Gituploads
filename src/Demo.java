import java.util.Scanner;

public class Demo {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter any one '+ - * / % ' operator");
			char op=scan.next().charAt(0);
		    System.out.println("frst num");
			int num1=scan.nextInt();
			System.out.println("send num");
			int num2=scan.nextInt();
			
			switch(op){
			case '+':
				System.out.println(num1+num2);
		        break;
			case '-':
				System.out.println(num1-num2);
				break;
			case '*':
				System.out.println(num1*num2);
				break;
			case '/':
				System.out.println(num1/num2);
				break;
			case '%':
				System.out.println(num1%num2);
				break;
				default:
					System.out.println("choose correct operator");
				
			
			
			}
		}


	}

