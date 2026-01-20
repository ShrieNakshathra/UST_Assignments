import java.io.*;

class FileClosing
{

	public static void main(String args[])
		{

			FileOutputStream fos=null;
		try{
			
			fos=new FileOutputStream("Read.txt");
			
			String sentence="HElLO BONNY";
			
			fos.write(sentence.getBytes());
			
			
			
			
			}
		catch(Exception e)
			{
			System.out.println(e);
			}
		finally{
			try{
			if(fos!=null)
			{
			fos.close();
			}
			}
			catch(Exception e)
			{
				System.out.println("Exception catched in the  file");
			}
		
	}
		

		}
}