//Mohammed FA          file handling
import java.io.*;
import java.util.*;

class file{
	public static void main(String args[]) throws Exception{    
		try{    
			String s = "hai iluhg lihg eipt iedoth olihyg oiuht oith";
			byte b[] = s.getBytes();
			FileOutputStream file=new FileOutputStream("text.txt");    
			file.write(b);  
			System.out.println("File created and inputted");
			file.close();    
		}
		catch(Exception e){
			System.out.println(e);
		}
		try{    
			
			FileInputStream file=new FileInputStream("text.txt");    
			int i;
			System.out.println("String in file:");
			while( (i=file.read()) != -1)  
				System.out.print((char)i);
			file.close();    
		}
		catch(Exception e){
			System.out.println(e);
		}    
	}
}
