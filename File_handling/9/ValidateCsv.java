import java.io.*;
import java.util.*;

class ValidateCsv
{

public static  void main(String args[]) 
		{
		try{
		BufferedReader br=new BufferedReader(new FileReader("students.csv"));
	

		
		String Line;br.readLine();
		
		
		while((Line=br.readLine())!=null)
		{

		  
		
		   
                if (Line.trim().isEmpty() || Line.replace(",", "").trim().isEmpty()) {
                    continue;
                }

		

		String []data=Line.split(",");
		
		if(data.length<3)
		continue;

		try{
		int marks=Integer.parseInt(data[2]);
		}
		catch(NumberFormatException e)
			{
			System.out.println(e.toString());
			continue;}
		
		
		System.out.println(Arrays.toString(data));
		
			
			
			
		
		
		}
	
	
		br.close();
		
		


	
	}
	catch(Exception e)
		{
		System.out.println(e.getMessage());	}


}
}