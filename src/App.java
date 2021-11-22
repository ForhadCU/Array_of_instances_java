/* import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Movie> moviesList = new ArrayList<>(); // arraylist of generic class named "Movie"
        Movie movieInstance; // Declare a variable which DataType is Movie

        //input multiple movie Instance as array
        movieInstance = new Movie("Movie 1", "Actor 1", 10);
        moviesList.add(movieInstance);
        movieInstance = new Movie("Movie 2", "Actor 2", 7);
        moviesList.add(movieInstance);
        movieInstance = new Movie("Movie 3", "Actor 1", 10);
        moviesList.add(movieInstance);
        movieInstance = new Movie("Movie 4", "Actor 3", 10);
        moviesList.add(movieInstance);
        movieInstance = new Movie("Movie 5", "Actor 1", 5);
        moviesList.add(movieInstance); //End
        

        //call method getRating, with parameter: array of Movie Instances
        ArrayList<Movie> newMovieArrayList = new ArrayList<>();
        newMovieArrayList = movieInstance.getRating(moviesList);
        for (int i = 0; i < newMovieArrayList.size(); i++) {
            System.out.println(newMovieArrayList.get(i).getTitle());
        }
    }
}
 */