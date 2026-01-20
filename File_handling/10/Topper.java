import java.io.*;
import java.util.*;

class Topper
{

public static  void main(String args[]) 
		{
		try{
		BufferedReader br=new BufferedReader(new FileReader("students.csv"));
		
	

		
		String Line;
		br.readLine();
		int topper=1;
		String [] topper_details=null;
		
		while((Line=br.readLine())!=null)
		{
		


		String []data=Line.split(",");
		
			int marks=Integer.parseInt(data[data.length-1]);
			if(marks>topper)
			{
			topper=marks;
			topper_details=data;
			}
			
		
		
		
		}

		
		System.out.println(Arrays.toString(topper_details));
		
		br.close();
		
		


	
	}
	catch(Exception e)
		{
		e.printStackTrace();		}


}
}