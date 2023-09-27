import java.util.*;
public class MovieDriver_Task1
{
	public static void main (String [] args)
		{
			Scanner input = new Scanner(System.in);
			Movie movie = new Movie();
			String movieName;
			String rating;
			int numTicket;
			
			System.out.println("Enter the name of a movie.");
			movieName = input.nextLine();
			movie.setTitle(movieName);
			
			System.out.println("Enter the rating of the movie.");
			rating = input.nextLine();
			movie.setRating(rating);
			
			System.out.println("Enter the number of tickets sold for this movie.");
			numTicket = input.nextInt();
			movie.setSoldTickets(numTicket);
			
			
			System.out.println(movie.toString());
			System.out.println("Good Bye");
			
		}
		

	}



