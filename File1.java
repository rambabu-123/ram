package ram;
import java.io.IOException;
public class File1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		java.io.File file = new java.io.File("C:\\Users\\rsunkara\\Desktop\\file\\ram.txt");
		if( file.exists())
		{
		System.out.println("File Exists!!!! ");
		System.exit(1);
		}
		java.io.PrintWriter output = new java.io.PrintWriter(file);

		output.print("Ram ");
		output.print("143 ");
		output.print("kaki");
		output.print(" 90 ");

		output.close();
		}


}
