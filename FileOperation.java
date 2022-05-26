import java.io.*;
import java.nio.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FileOperation
{
	
	public static void main(String[] args) throws IOException{
		
		createFileUsingFileClass();
		
		System.out.println("**********File Read Operation************");
		
		List l = readFileInList("D://FileOperation/Testfile9.txt");
		
		Iterator<String> itr = l.iterator();
		
		while(itr.hasNext())
			
		{
			
			System.out.println(itr.next());
		}
		
		System.out.println("**************File amend operation***********");
		
		modifyFile("D://FileOperation/TestFile11.txt","should","could");
		
		System.out.println("Done");
		
	}
	
	private static void createFileUsingFileClass() throws IOException
	
	
	{
		
		System.out.println("*********File Creation Operation**********");
		
		File file = new File("D://FileOperation/Testfile20.txt");
		
		if(file.createNewFile()==true)
			
		{
			
			System.out.println("New file is created");
		}
		
		else
			
		{
			
			System.out.println("File already exits");
		}
		
	}
	
	public static List <String> readFileInList(String filename)
	
	{
		
		List <String> lines = Collections.emptyList();
		
		try
		
		{
			
			lines = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
			
			
		}
		
		catch(Exception e)
		
		{
			
			e.printStackTrace();
		}
		
		return lines;
	}
	
	static void modifyFile(String filePath, String oldString, String newString)
	
	{
		
		File fileTobeModified = new File(filePath);
		
		String oldContent = "";
		
		BufferedReader reader = null;
		
		FileWriter writer = null;
		
		try
		
		{
			
			reader = new BufferedReader(new FileReader(fileTobeModified));
			
			String line1 = reader.readLine();
			
			while(line1 != null)
				
			{
				
				oldContent = oldContent + line1 + System.lineSeparator();
				
				line1 = reader.readLine();	
			}
			
			String newContent = oldContent.replaceAll(oldString, newString);
			
			writer = new FileWriter(fileTobeModified);
			
			writer.write(newContent);
		}
		
		catch(IOException e) 
		
		{
			
			e.printStackTrace();
		}
		
		
	}
	
}