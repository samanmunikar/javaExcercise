import java.io.File;
import java.io.IOException;
public class Question45{
	public static void main(String[] args) throws Exception{
		String filename = "abc.txt";
		File infile = new File(filename);
		double size = infile.length();
		System.out.println("The size of the file is " + size + " bytes.");
	}
}