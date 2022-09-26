package day29exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// How to read a text file line by line

public class Exception03 {

	public static void main(String[] args) {
		
		readTextFileLineByLine();
		
	}
// if you do it character by character you need many loop has a lot of issue. preferable line by line
	// for interview
	
	public static void readTextFileLineByLine() {
		BufferedReader br=null;
		
		try {
			 br = new BufferedReader(new FileReader("src/day28exceptionsX/TextFile"));   //red underline....CTException
		
			String line= br.readLine();
			
			while (line!=null) {
				System.out.println(line);
				
				line= br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("The path is wrong or the file does not exist");
		}		
 catch (IOException e) {
			System.out.println("For some reason the file can not be read");
		} finally {
			try {
				br.close();					// red underline. because I created inside the try
			} catch (IOException e) {
				System.out.println("For some reason, the file could not be closed");
				
			}	catch(NullPointerException e)	{
				System.out.println("you can not close non existing file");
			}
		}
		
	}
}
