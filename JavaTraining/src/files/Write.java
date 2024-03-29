package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		
		String str = "I am writing to a file using bufferedwriter";
		// 1. Define the path that we want to write
		String filename = "C:\\Sheila\\JavaPractice\\to_be_readFile.txt";
		// 2. create a file in Java
		
		File file = new File(filename);
		
		// 3. open a file
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(file));
			// 4. write to the file
			br.write(str);
			// 5. Close the resources
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Finished writing to a file");
		}
		
		System.out.println();

	}

}
