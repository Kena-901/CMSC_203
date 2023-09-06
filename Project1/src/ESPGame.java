/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Write a program that tests your ESP (extrasensory perception). 
 				Create a list of the seven names of colors. The program should randomly 
 				select the name of a color from your list 
 * Due: 09/11/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Kenawak Abebe
*/

//Import random and scanner classes
import java.util.Scanner;
import java.util.Random;

//Create ESPGame class
public class ESPGame 
{
	public static void main(String[]args) 
	{ 
		// Declare variables and constants
		String name,describe,date,userChoice,systemColor1,systemColor2;
		final String color1 = "Red",color2 = "Green",color3 = "Yellow",
					 color4 = "Blue",color5 = "White",color6 = "Black",
					 color7 = "Purple",color8 = "red",color9 = "green",
					 color10 = "yellow",color11 = "blue",color12 = "white",
					 color13 = "black",color14 = "purple";
		int i = 0,correct = 0,roundCount = 1,colorMax = 6;
		
		//Prompt user and store for user info
		Scanner username = new Scanner(System. in);
		System .out.print("Enter Your name: ");
		name = username.nextLine();
		
		Scanner Description = new Scanner(System. in);
		System .out.print("Describe yourself: ");
		describe = Description.nextLine();
		
		Scanner Duedate = new Scanner(System. in);
		System .out.print("Due Date: ");
		date = Duedate.nextLine();
		
		System .out.println("CMSC203 Assignment1: Test your ESP skills!\r");
		
		//start while loop for 11 rounds of game
		while (i < 11) 
		{	
			//prompt user for color guess and accept user input
			System .out.print("Round " + roundCount + "\r\r\n");
			
			Scanner userColor = new Scanner(System. in);
			System .out.print("I am thinking of a color.\r\n"
					+ "Is it Red, Green, Blue, White, Black, Purple or Yellow?\r\n"
					+ "Enter your guess:\r\n");
			
			userChoice = userColor.nextLine();
			
			//use if else statement to validate user input
			if(!userChoice.equals(color1) &&!userChoice.equals(color2)&& !userChoice.equals(color3)
					  && !userChoice.equals(color4)&&!userChoice.equals(color5)&& !userChoice.equals(color6)
					  &&!userChoice.equals(color7) &&!userChoice.equals(color8)&&!userChoice.equals(color9)
					  &&!userChoice.equals(color10)&&!userChoice.equals(color11)&&!userChoice.equals(color12)
					  &&!userChoice.equals(color13)&&!userChoice.equals(color14)) 
			{
				//use while loop to repeat code until correct input from user
				while(!userChoice.equals(color1) &&!userChoice.equals(color2)&& !userChoice.equals(color3)
						  && !userChoice.equals(color4)&&!userChoice.equals(color5)&& !userChoice.equals(color6)
						  &&!userChoice.equals(color7) &&!userChoice.equals(color8)&&!userChoice.equals(color9)
						  &&!userChoice.equals(color10)&&!userChoice.equals(color11)&&!userChoice.equals(color12)
						  &&!userChoice.equals(color13)&&!userChoice.equals(color14)) 
				{
					System .out.print("You entered incorrect color. Is it Red, Green, Blue, "
							+ "White, Black, Purple or Yellow?\r\n" 
	                        + "Enter your guess again:\r\n");
					userChoice = userColor.nextLine();
				}
				
				//generate random number for code to make a choice for color
				Random rand = new Random();
				int systemGuess = rand.nextInt(colorMax);
				
				//use if else statement to assign a random number to a color
				if (systemGuess == 0) 
				{
					systemColor1 = "Yellow";
					systemColor2 = "yellow";
				}
				else if (systemGuess == 1) 
				{
					systemColor1 = "Red";
					systemColor2 = "red";
				}
				else if (systemGuess == 2) 
				{
					systemColor1 = "Green";
					systemColor2 = "green";
				}
				else if (systemGuess == 3) 
				{
					systemColor1 = "Blue";
					systemColor2 = "blue";
				}
				else if (systemGuess == 4) 
				{
					systemColor1 = "White";
					systemColor2 = "white";
				}
				else if (systemGuess == 5) 
				{
					systemColor1 = "Black";
					systemColor2 = "black";
				}
				else
				{
					systemColor1 ="Purple";
					systemColor2 ="purple";
				}
				System .out.print("\r\nI was thinking of " + systemColor1 + ".\n" );	
					
			}
			else 
			{ 
				//generate random number for code to make a choice for color
				Random rand = new Random();
				int systemGuess = rand.nextInt(colorMax);
				
				//use if else statement to assign a random number to a color
				if (systemGuess == 0) 
				{
					systemColor1 = "Yellow";
					systemColor2 = "yellow";
				}
				else if (systemGuess == 1) 
				{
					systemColor1 = "Red";
					systemColor2 = "red";
				}
				else if (systemGuess == 2) 
				{
					systemColor1 = "Green";
					systemColor2 = "green";
				}
				else if (systemGuess == 3) 
				{
					systemColor1 = "Blue";
					systemColor2 = "blue";
				}
				else if (systemGuess == 4) 
				{
					systemColor1 = "White";
					systemColor2 = "white";
				}
				else if (systemGuess == 5) 
				{
					systemColor1 = "Black";
					systemColor2 = "black";
				}
				else
				{
					systemColor1 ="Purple";
					systemColor2 ="purple";
				}
			
				//display code guess
				System .out.print("\r\nI was thinking of " + systemColor1 + ".\n" );	
				
			}
			
			//use if statement to keep track of correct guesses	
			if(userChoice.equals(systemColor1) || userChoice.equals(systemColor2))
			{
				correct++;
			}
				
			i++;
			roundCount++;
		}
		
		//display user info
		System .out.print("Game Over\r\n" + "\r\nYou guessed "+correct+" out of 11 colors correctly.\r\n");
		System .out.print("User name: " + name + "\r\n");
		System .out.print("User description: " + describe + "\r\n");
		System .out.print("Due Date: " + date + "\r\n");
	}

}