import java.io.*;
import java.util.*;

class StudentNameSearch
{

public static  void main(String args[]) 
		{
		try{
	
		BufferedReader br=new BufferedReader(new FileReader("students.csv"));

		String search="Anita";
		String Line;br.readLine();
		
		while((Line=br.readLine())!=null)
		{
		String Record[]=Line.split(",");
		
		
		if(search.equalsIgnoreCase(Record[1]))
		{
			System.out.println(Arrays.toString(Record));
		}




		}
				br.close();
		
		


	
	}
	catch(Exception e)
		{
		e.printStackTrace();		}


}
}