import java.util.Scanner; //step 1: import 

public class Main
{
	public static void main(String[] args)
	{
		Scanner keyboard  = new Scanner(System.in);
		//step 2: instantiate scanner
		NetflixOriginal[] userShows = new NetflixOriginal[2];

		for(int i = 0; i < userShows.length; i++) {
			//System.out.println("Entering Netflix Original Show Detail #" + (i+1));
			//System.out.println("---------------------");
			userShows[i] = Main.instantiateFromInput(keyboard);
			System.out.println(userShows [i]);
			//System.out.println("\nSuccessfully added show: " + userShows [i] + "\n");
		}

		//System.out.println("TEST show = " + test);  

		keyboard.close();//step 3: close scanner

	}

	public static NetflixOriginal instantiateFromInput
	(Scanner keyboard) {
		String name, genre;
		double starRating;
		boolean isValid; 

		NetflixOriginal result = new NetflixOriginal();

		//prompt use for input name 
		System.out.print("Please enter the name of the show: ");
		name = keyboard.nextLine(); //written as next(), leaves nothing n the buffer
		result.setName(name);

		//System.out.println("TEST: User entered name = " + name);

		//prompt user for input starRating (do while loop) - will keep on going while there is bad data 
		do {
			System.out.print("Please enter the star rating: ");
			starRating = Double.parseDouble(keyboard.nextLine());
			isValid = result.setStarRating(starRating);

			if(!isValid){
				//System.out.println("ERROR!: RATING MUST BE BETWEEN 0.0 AND 5.0, INCLUSIVE\n");
			}
		} while(!isValid);

		

		//starRating = keyboard.nextDouble();//leaves \n in the buffer
		
		//keyboard.nextLine();//cleans the buffer, gets rid of the \n

		//System.out.println("TEST: User entered rating = " + starRating);

		//prompt user for input genre (do while loop)
		do {
			System.out.print("Please enter the genre: ");
			genre = keyboard.nextLine();
			isValid = result.setGenre(genre);
			
			if(!isValid){
				//System.out.println("ERROR!: GENRE MUST BE ONE OF THE ALLOWED/RECOGNIZED GENRE, INCLUSIVE\n");
			}
		} while(!isValid);


		
		//System.out.println("TEST: User entered genre = " + genre);

	 	//return new NetflixOriginal(name, starRating, genre );//null;//stub
		return result;
	

	}
}