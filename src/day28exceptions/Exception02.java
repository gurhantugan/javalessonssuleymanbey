package day28exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
    /*
     * 1) if you get red underline while you type a code, it can be COMPILE TIME EXCEPTION
     * 2) Compile Time Exceptions are called CHECKED.
     * 	  Run Time Exceptions are called UNCHECKED exceptions.
     * 3) the most common CHECKED exceptions are;
     * 		i) FileNotFoundException: The path is wrong or file does not exist.
     * 		ii) IOException:It is related with all Input-Output issues.
     * 4) If there is IOException, no need to use FileNotFoundException.
     * 5) If you need to use them in TRY-CATCH blocks, then type FileNotFoundException at the top
     * 6)  e.printStackTrace(); it gives detailed technical information about error.
     */
public class Exception02 {
    
    //how to read a text file
    public static void main(String[] args) {
        
        readTextFiles2();
        
    }
    
    public static void readTextFiles1() throws IOException {
        FileInputStream fis = new FileInputStream("src/day28exceptions/TextFile01");
        int i=0;
        while( (i=fis.read()) != -1  ) {
            System.out.print((char)i);
        }
        fis.close();
    }
    
    public static void readTextFiles2() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/day28exceptions/TextFile01");
            int i=0;
            while( (i=fis.read()) != -1  ) {
                System.out.print((char)i);
            }           
            
        } catch (FileNotFoundException e) {
            
            System.err.println("The path is wrong or file does not exist: " + e.getMessage());
        } catch (IOException e) {
            
            System.err.println("File couldn't be read..." + e.getMessage());
        } finally {
            try {
                fis.close();
            } catch (Exception e) {
                System.err.println("The file coulnd't be closed or The file coulnd't be accessed...");
            }
        }
        
        
    }
    }