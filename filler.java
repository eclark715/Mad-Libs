package MadLibs;
import java.util.Scanner;
import java.util.Random;

/*
 User picks a number and if that number is equal to the randomly generated number then 
 they are given the prompt called strange to fill in the blanks, however if it is not equal
 then they are given the prompt called politics to fill in.
 */

public class filler {
	public static Scanner scan1= new Scanner(System.in);
	public static Scanner scan = new Scanner(System.in);
	static String politics, strange;
	static int prompt, n;
	
	//Used for the original prompt to just display what spots need to be filled in
	static String[] adjectives = {"ADJECTIVE1", "ADJECTIVE2", "ADJECTIVE3", "ADJECTIVE4","ADJECTIVE5", "ADJECTIVE6", "ADJECTIVE7", "ADJECTIVE8", "ADJECTIVE9"};
	static String[] bodyParts = {"BODYPART1", "BODYPART2", "BODYPART3"};
	static String[] noun = {"PLURALNOUN1", "PLURALNOUN2", "NOUN1", "NOUN2", "PLURALNOUN3", "NOUN3", "NOUN4", "PLURALNOUN4", "PLURALNOUN5"};
	static String [] verbs = {"VERB1", "VERB2", "VERB3", "VERB4"};
	static String color = "COLOR";
	static String name = "MALENAME";
	static String num = "NUMBER";
	
	static Random rand = new Random();
	
	public static String decision()
	{
		//Chooses a random number from [0, 1]
		n = rand.nextInt(2) + 0;
		
		//Choice 1
		strange = "He holds out his " + bodyParts[0] + ", and in his " + bodyParts[1] + " are\n"
				+ num + " " + adjectives[0] + " " + color + " " + noun[0] + " linked with a thick\n"
				+ "black thread... Inside me! I " + verbs[0] + " and all the " + noun[1] + "\n"
				+ "deep in my " + bodyParts[2] + " clench. My inner " + " " + noun[2] + " is doing the\n"
				+ verbs[1] + " of the seven veils. It's a/an " + adjectives[1] + " feeling. Once they're inside me.\n"
				+ "I can't really " + verbs[2] + " them - but then again I know they're there. I may have to\n"
				+ verbs[3] + " these. They make me needy, needy for " + noun[3] + ".";
		
		//Choice 2
		politics = "Ladies and gentlemen, on this " + adjectives[0] + " occasion\n"
				+ "it is a privilege to address such a/an " + adjectives[1] + " - looking group\n"
				+ "of " + noun[0] + ". I can tell from your smiling " + noun[1] + " that you will\n"
				+ "support my " + adjectives[2] + " program in the coming election. I promise that\n"
				+ "if elected, there will be a/an " + noun[2] + " in every " + noun[3] + " and two\n"
				+ noun[4] + " in every garage. I want to warn you against my " + adjectives[3] + "\n"
				+ "opponent, Mr. " + name + ". The man is nothing but a/an " + adjectives[4] + " " + noun[5] + ".\n"
				+ "He has a/an " + adjectives[5] + " character and is working " + noun[6] + " in glove with the\n"
				+ "criminal element. If elected, I promise to eliminate vice. I will\n"
				+ "keep the " + noun[7] + " off the city's streets. I will keep crooks from\n"
				+ "dipping their " + noun[8] + " in the public till. I promise you " + adjectives[6] + " government,\n"
				+ adjectives[7] + " taxes, and " + adjectives[8] + " schools";
		
		
		System.out.print("To decide your prompt, pick an integer on the interval [0, 1] ");
		prompt = scan.nextInt();
		while(prompt > 1 || prompt < 0)
		{
			System.out.println("Pick a number between [0, 1]");
			prompt = scan.nextInt();
		}
		
		
		System.out.println("\nRetrieving your prompt...\n");
		
		//Pauses for 1 second before printing out the prompt
		try{Thread.sleep(1000);}
		//Needs the catch because the program may crash while asleep
		catch(InterruptedException e){System.out.println(e);}
		
		//If number given is equal to random generated number then return the strange prompt
		if(prompt == n)
		{
			System.out.println(strange);
			return strange;
		}
		else
		{
			System.out.println(politics);
			return politics;
		}
	}
	public static void fill(int i)
	{
		String def;
		System.out.print("Before you get started, would you like a recap on parts of speech: Noun, Adjective and Verb? ");
		def = scan.next();
		
		if(def .equalsIgnoreCase("yes"))
		{
			System.out.print("\nNOUN - A person, place or thing\n" + "ADJECTIVE - Describes a noun\n" + "VERB - An action word\n\n");
		}
		else
		{
			System.out.println("\nLet's get started then...");
		}
		
		System.out.println("It is your job to fill in all the words that are capitalized.");
		
		//Variable k is the numbered word of a specific type it is on
		if(i == n)
		{
			int k = 1;
			for(int j = 0; j < bodyParts.length; j++)
			{
				System.out.print("Body part " + k + ": ");
				bodyParts[j] = scan1.nextLine();
				bodyParts[j] = bodyParts[j].toUpperCase();
				k++;
			}
			k = 1;
			System.out.println();
			for(int j = 0; j < 3; j++)
			{
				System.out.print("Adjective " + k + ": ");
				adjectives[j] = scan1.nextLine();
				adjectives[j] = adjectives[j].toUpperCase();
				k++;
			}
			k = 1;
			System.out.println();
			for(int j = 0; j < 5; j++)
			{
				if(j == 0 || j == 1)
				{
					System.out.print("Plural ");
				}
				System.out.print("Noun " + k + ": ");
				noun[j] = scan1.nextLine();
				noun[j] = noun[j].toUpperCase();
				k++;
			}
			k = 1;
			System.out.println();
			for(int j = 0; j < 4; j++)
			{
				System.out.print("Verb " + k + ": ");
				verbs[j] = scan1.nextLine();
				verbs[j] = verbs[j].toUpperCase();
				k++;
			}
			System.out.print("\nNumber: ");
			num = scan.next();
			System.out.print("Color: ");
			color = scan1.nextLine();
			color = color.toUpperCase();
			
		}
		else
		{
			int k = 1;
			for(int j = 0; j < adjectives.length; j++)
			{
				System.out.print("Adjective " + k + ": ");
				adjectives[j] = scan1.nextLine();
				adjectives[j] = adjectives[j].toUpperCase();
				k++;
			}
			k = 1;
			System.out.println();
			for(int j = 0; j < noun.length; j++)
			{
				System.out.print("Noun " + k + ": ");
				noun[j] = scan1.nextLine();
				noun[j] = noun[j].toUpperCase();
				k++;
			}
			
			System.out.print("\nWhat is your last name? ");
			name = scan1.nextLine();
			name = name.toUpperCase();
		}
		
		politics = "Ladies and gentlemen, on this " + adjectives[0] + " occasion\n"
				+ "it is a privilege to address such a/an " + adjectives[1] + " - looking group\n"
				+ "of " + noun[0] + ". I can tell from your smiling " + noun[1] + " that you will\n"
				+ "support my " + adjectives[2] + " program in the coming election. I promise that\n"
				+ "if elected, there will be a/an " + noun[2] + " in every " + noun[3] + " and two\n"
				+ noun[4] + " in every garage. I want to warn you against my " + adjectives[3] + "\n"
				+ "opponent, Mr. " + name + ". The man is nothing but a/an " + adjectives[4] + " " + noun[5] + ".\n"
				+ "He has a/an " + adjectives[5] + " character and is working " + noun[6] + " in glove with the\n"
				+ "criminal element. If elected, I promise to eliminate vice. I will\n"
				+ "keep the " + noun[7] + " off the city's streets. I will keep crooks from\n"
				+ "dipping their " + noun[8] + " in the public till. I promise you " + adjectives[6] + " government,\n"
				+ adjectives[7] + " taxes, and " + adjectives[8] + " schools.";
		
		strange = "He holds out his " + bodyParts[0] + ", and in his " + bodyParts[1] + " are\n"
				+ num + " " + adjectives[0] + " " + color + " " + noun[0] + " linked with a thick\n"
				+ "black thread... Inside me! I " + verbs[0] + " and all the " + noun[1] + "\n"
				+ "deep in my " + bodyParts[2] + " clench. My inner " + " " + noun[2] + " is doing the\n"
				+ verbs[1] + " of the seven veils. It's a/an " + adjectives[1] + " feeling. Once they're inside me.\n"
				+ "I can't really " + verbs[2] + " them - but then again I know they're there. I may have to\n"
				+ verbs[3] + " these. They make me needy, needy for " + noun[3] + ".";
		
		System.out.println("\nCreating your final speech...\n");
		//Waits two seconds to print out
		try{Thread.sleep(2000);}
		catch(InterruptedException e){System.out.println(e);}
		
		
	}
	
	
}

