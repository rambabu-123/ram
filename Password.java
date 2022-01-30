package ram;
import java.util.Scanner;
public class Password {
	public static void main(String[] args)
	{
	 int NUM_UPPER_LETTERS=3;
	int NUM_LOWER_LETTERS=3;
	int NUM_DIGITS=3;
	int upperCount=0;
	int lowerCount=0;
	int digitCount=0;
	int letterCount=0;
	Scanner in=new Scanner(System.in);
	System.out.println("enter password");
	String input=in.nextLine();
	int inputLen=input.length();
	for(int i=0;i<inputLen;i++)
	{
		char ch=input.charAt(i);
		
		if(Character.isUpperCase(ch))
			upperCount++;
		else if(Character.isLowerCase(ch))
			lowerCount++;
		else if(Character.isDigit(ch))
			digitCount++;
	}
	if(upperCount>=NUM_UPPER_LETTERS &&lowerCount>=NUM_LOWER_LETTERS &&digitCount>=NUM_DIGITS)
		System.out.println("valid password");
	else
	{
		System.out.println("the password did not enough of the following");
		if(upperCount<NUM_UPPER_LETTERS)
			System.out.println("uppercase letters");
		if(lowerCount<NUM_LOWER_LETTERS)
			System.out.println("lowercsae letters");
		if(digitCount<NUM_DIGITS)
			System.out.println("digits");
	}
	

}
}
