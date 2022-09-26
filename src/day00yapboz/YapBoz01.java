package day00yapboz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class YapBoz01 {


	
	    public static void main(String[] args) throws IOException {
	        
	    	readTextFiles2();
	        
	    }
	    
	    public static void readTextFiles1() throws IOException  {
	        
	    	FileInputStream fis= new FileInputStream("src/day00yapboz/TextFile01"); 
	    	
	    	int i=0;
	    	
	    	while((i=fis.read()) !=-1) {
	    		
	    		System.out.print((char) i);
	    	}
	    	fis.close();
	    }
	    	public static void readTextFiles2()   {
		        
		    	FileInputStream fis=null;
				int i=0;
		    	try {
					fis = new FileInputStream("src/day00yapboz/TextFile01");
					
					while((i=fis.read()) !=-1) {
						
						System.out.print((char) i);
					}
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
					
					e.printStackTrace();
				} 
		    	
		    	
		    	
		    	finally {
	    	try {
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}	    
	    
	    	}
	    	}
	 }