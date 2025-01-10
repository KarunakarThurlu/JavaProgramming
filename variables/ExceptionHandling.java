package variables;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {

	public static void main(String... exceptions) {
		try {
			FileReader fr = new FileReader("sample.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
