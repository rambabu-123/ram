package ram;
import java.io.IOException;
	import java.io.*;

	public class Merge
	{
		public static void main(String[] args) throws IOException
		{
			
			PrintWriter pw = new PrintWriter("ram.txt");
			
			BufferedReader br = new BufferedReader(new FileReader("ram.txt"));
			
			String line = br.readLine();
			

			while (line != null)
			{
				pw.println(line);
				line = br.readLine();
			}
			
			br = new BufferedReader(new FileReader("ram.txt"));
			
			line = br.readLine();

			while(line != null)
			{
				pw.println(line);
				line = br.readLine();
			}
			
			pw.flush();
			
			// closing resources
			br.close();
			pw.close();
			
			System.out.println("Merged ram.txt and ram1.txt into ramesh.txt");
		}
	}
