package polymorphism.buchalkapolimorphism.movie;

public class Movie {
    private String movieTitle;

    public Movie(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String plot(){
        return "No plot here";
    }
}
