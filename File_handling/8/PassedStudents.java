import java.io.*;
import java.util.*;

class PassedStudents
{

public static  void main(String args[]) 
		{
		try{
		BufferedReader br=new BufferedReader(new FileReader("students.csv"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("Passed_students.csv"));
	

		
		String Line;
		String Header=br.readLine();
		bw.write(Header);
		while((Line=br.readLine())!=null)
		{
		


		String []data=Line.split(",");
		
			int marks=Integer.parseInt(data[data.length-1]);
			
		
			if(marks>79)
			{
			bw.newLine();
			String csvLine=String.join(",",data);
			bw.write(csvLine);
			}
		
		
		}
		bw.close();
		br.close();
		
		


	
	}
	catch(Exception e)
		{
		e.printStackTrace();		}


}
}