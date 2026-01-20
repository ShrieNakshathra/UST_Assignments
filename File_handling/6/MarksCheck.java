import java.io.*;
import java.util.*;

class MarksCheck
{

public static  void main(String args[]) 
		{
		try{
		BufferedReader br=new BufferedReader(new FileReader("students.csv"));

		
		String Line;br.readLine();
		while((Line=br.readLine())!=null)
		{
		


		String []data=Line.split(",");
		
			int marks=Integer.parseInt(data[data.length-1]);
			
			if(marks>=79)
			{
			System.out.println(Arrays.toString(data));
			}
		
		System.out.println();
		}
		br.close();
		
		


	
	}
	catch(Exception e)
		{
		e.printStackTrace();		}


}
}