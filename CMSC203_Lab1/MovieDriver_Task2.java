import java.util.Scanner;
public class MovieDriver_Task2 
{
		public static void main (String [] args)
		{
				Scanner input = new Scanner(System.in);
				Movie movie = new Movie();
				String movieName;
				String rating;
				String choice;
				String c;
				int numTicket;
				do
				{
					System.out.println("Enter the name of a movie.");
					movieName = input.nextLine();
					movie.setTitle(movieName);
				
					System.out.println("Enter the rating of the movie.");
					rating = input.nextLine();
					movie.setRating(rating);
				
					System.out.println("Enter the number of tickets sold for this movie.");
					numTicket = input.nextInt();
					movie.setSoldTickets(numTicket);
				
					input.nextLine();
					System.out.println(movie.toString());
					System.out.println("Do you want to Enter another movie? (y or n)");
					choice = input.nextLine();
				
				}while(choice.equals("y")||choice.equals("Y"));
				System.out.println("Good Bye");
				
		}
			
}