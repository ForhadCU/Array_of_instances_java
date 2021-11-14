import java.util.ArrayList;

/**
 * Movie
 */
public class Movie {
    private String title;
    private String studio;
    private int rating;

    //question: a
    public Movie(String title, String studio, int rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    //question: b
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = 10;
    }

    //question: c
    public ArrayList<Movie> getRating(ArrayList<Movie> moviesList)
    {
        if (moviesList != null){
            Movie newMovieInstance;
            ArrayList<Movie> newMovieList = new ArrayList<>();

            for (int i = 0; i < moviesList.size(); i++) {
                if (moviesList.get(i).getMovieRating() == 10) {
                    newMovieInstance = new Movie(moviesList.get(i).getTitle(), moviesList.get(i).getStudio());
                    newMovieList.add(newMovieInstance);
                }
            }
            return newMovieList;
        } else {
            return null;
        }
    }

    // to get three values
    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public int getMovieRating() {
        return rating;
    }

}