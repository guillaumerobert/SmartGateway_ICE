package test_cases;

import java.io.FileWriter;
import java.io.IOException;

public class TC_Log
{
	private FileWriter logWriter;

	TC_Log(String filePath)
	{
		try
		{
			logWriter = new FileWriter(filePath);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	TC_Log(FileWriter fileWr)
	{

	}
}
