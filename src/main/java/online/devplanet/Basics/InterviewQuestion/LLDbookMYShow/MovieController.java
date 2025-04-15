package online.devplanet.Basics.InterviewQuestion.LLDbookMYShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityVSmovies;
    List<Movie> allMovies;

    MovieController(){
        cityVSmovies= new HashMap<>();
        allMovies= new ArrayList<>();
    }

    // add movie to the particular city

    public void addMovie(City city, Movie movie){
        allMovies.add(movie);

        List<Movie> movieList= cityVSmovies.getOrDefault(city,new ArrayList<>());
        movieList.add(movie);
        cityVSmovies.put(city,movieList);
    }

    // get movie by name

    public Movie getMovieByName(String movieName){
        for(Movie movie:allMovies){
            if(movie.getMovieName().equals(movieName)){
                return movie;
            }
        }
        return null;
    }

    List<Movie> getMoviesByCity(City city) {
        return cityVSmovies.get(city);
    }

}
