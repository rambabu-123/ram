package ram;

public class function {
	
	public static void main(String[] args) {
		int k=1;
		for(int r=1;r<=5;r++)
		{
			for(int j=1;j<=r-5;j++)
			{
				System.out.print(r+"*");
			}
			for(int i=r;i>0;i--)
			{
				System.out.print(i+"");
			}
			System.out.println("");
		
		}
		
	}
}
 