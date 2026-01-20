import java.io.*;
import java.util.*;

class SumOfMarks
{

public static  void main(String args[]) 
		{
		try{
		BufferedReader br=new BufferedReader(new FileReader("students.csv"));
	

		
		String Line;br.readLine();
		int sum=0;
		int count=0;	
		while((Line=br.readLine())!=null)
		{
		


		String []data=Line.split(",");
		
			int marks=Integer.parseInt(data[data.length-1]);
			sum+=marks;
			count++;
		
		
		}
	System.out.println(sum);

	int avg=sum/count;
	System.out.println("avg:"+avg);
		br.close();
		
		


	
	}
	catch(Exception e)
		{
		e.printStackTrace();		}


}
}