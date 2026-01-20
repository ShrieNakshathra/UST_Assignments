import java.io.*;
import java.util.*;

class StudentsCount
{

public static  void main(String args[]) 
		{
		try{
		int count=0;
		BufferedReader br=new BufferedReader(new FileReader("students.csv"));

		
		String Line;br.readLine();
		while((Line=br.readLine())!=null)
		{
		


		count++;

		}
		System.out.println(count);
		br.close();
		
		


	
	}
	catch(Exception e)
		{
		e.printStackTrace();		}


}
}