import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileManipulationScannerWithoutLoop
{
	public static void main(String[] args)
						throws FileNotFoundException
	{
	 File file = new File("jasper.txt");
	 Scanner sc = new Scanner(file);
	 
	 sc.useDelimiter("\\Z");
	 
	 System.out.println(sc.next());
	}
}
