import java.io.*;

class ReadCsv 
{

public static  void main(String args[]) 
		{
		try{
		BufferedReader br=new BufferedReader(new FileReader("students.csv"));

		
		String Line;
		while((Line=br.readLine())!=null)
		{
		

		String []data=Line.split(",");
		for(String record:data)
		{
			System.out.print(record + " ");
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