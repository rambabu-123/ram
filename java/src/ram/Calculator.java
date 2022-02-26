package ram;
import java.util.Scanner;
import java.lang.Exception;

public class Calculator {

	public static void main(String[] args) {
		int num1;
		int num2;
		String operation;
		boolean numIsAbc=true;
		do {
			try {
		
		Scanner input=new Scanner(System.in);
		System.out.println("eneter num1");
		num1=input.nextInt();
		System.out.println("eneter num2");
		num1=input.nextInt();
		numIsAbc=false;
			
			
			
			Scanner op = new Scanner(System.in);
			System.out.println("please enter opertaion");
			operation=op.next();
		
			if(operation.equals(" + ")) {
				System.out.println("your answer is "+(num1+num2));
			}
			if(operation.equals(" -")) {
				System.out.println("your answer is "+(num1-num2));
			}
			if(operation.equals(" / ")) {
				System.out.println("your answer is "+(num1/num2));
			}
			if(operation.equals(" * ")) {
				System.out.println("your answer is "+(num1*num2));
			}
			}
			catch(Exception e)
			{
				
					System.out.println(num1+" "+" cant be mathematicalcompared to "+num2+" " +e);
								
			}
		}while(numIsAbc==true);
			
	}}