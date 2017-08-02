
public class NEtflixRunner {
	public static void main(String[] args) {
		// 1. Instantiate some Movie objects (at least 5).
		Movie Austin = new Movie("Austin Powers in GoldMember", 4);
		Movie Jumpst = new Movie("ET", 5);
		Movie Expelled = new Movie("Expelled", 4);
		Movie BatnRob = new Movie("Batman and Robin", +1);
		Movie Star = new Movie("Star Wars the Force Awakens", +2);
		// 2. Use the Movie class to get the ticket price of one of your movies.
		// Austin
		System.out.println(Austin.getTitle() + " Price is " + Austin.getTicketPrice());
		// Jumpst
		System.out.println(Jumpst.getTitle() + " Price is " + Jumpst.getTicketPrice());
		// Expelled
		System.out.println(Expelled.getTitle() + " Price is " + Expelled.getTicketPrice());
		// BatnRob
		System.out.println(BatnRob.getTitle() + " Price is " + BatnRob.getTicketPrice());
		// Star
		System.out.println(Star.getTitle() + " Price is " + Star.getTicketPrice());
		// 3. Instantiate a NetflixQueue.
		NetflixQueue queue = new NetflixQueue();
		// 4. Add your movies to the Netflix queue.
		queue.addMovie(Star);
		queue.addMovie(BatnRob);
		queue.addMovie(Expelled);
		queue.addMovie(Jumpst);
		queue.addMovie(Austin);
		// 5. Print all the movies in your queue.
		queue.printMovies();
		// 6. Use your NetflixQueue object to finish the sentence "the best
		// movie is...."
		System.out.println("The best movie is " + queue.getBestMovie() );
		// 7. Use your NetflixQueue to finish the sentence "the second best
		// movie is...."
		queue.sortMoviesByRating();
for(int i = 0; i<5;i++){
		System.out.println(  queue.getMovie(i));
	
	}
}
}