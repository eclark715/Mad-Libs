package MadLibs;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.*;


public class speech {
	
	public static void main(String[] args)
	{	
		System.out.println("Welcome to Mad Libs!");	
		filler.decision();
		System.out.println();
		filler.fill(filler.prompt);
		
		//Creates the variable of the current date from the class Date
		Date date = new Date();
		
		try
		{
			//Appends to the file "MadLibs History", true means the text is appended to the file instead of creating a new file
			FileWriter fw = new FileWriter("MadLibs History.doc", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw);
			
			//Only uncomment this out when starting a new file
			//out.println("MadLibs History:\n");
			
			out.println(date);
			if(filler.prompt == filler.n)
			{
				
				System.out.println(filler.strange);
				out.println(filler.strange);
			}
			else
			{
				System.out.println(filler.politics);
				out.println(filler.politics);
			}
			
			//You have to close the PrintWriter or the message will not print out
			out.close();
		
			
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
					
	}
}


