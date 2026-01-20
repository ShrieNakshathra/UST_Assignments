import java.io.*;

class WriteToCsv 
{

public static  void main(String args[]) 
		{
		try{
		BufferedWriter bw=new BufferedWriter(new FileWriter("students.csv"));

	String records[]={"id,name,marks","101,Ravi,78","102,Anita,85"};
	
		

		for(String Record:records)a
			{
			bw.write(Record);
			bw.newLine();
			
			System.out.println(Record);
		}
	bw.close();
	}
	catch(Exception e)
		{
		e.printStackTrace();		}


}
}