package online.devplanet.Basics.InterviewQuestion.LLDbookMYShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {
    Map<City, List<Theater>> cityVsTheater;
    List<Theater> allTheaters;

    TheaterController(){
        cityVsTheater = new HashMap<>();
        allTheaters= new ArrayList<>();
    }

    public void addTheater(City city, Theater theater){
       allTheaters.add(theater);

       List<Theater> theaterList= cityVsTheater.getOrDefault(city,new ArrayList<>());

       theaterList.add(theater);
       cityVsTheater.put(city,theaterList);
    }


    public Map<Theater, List<Show>> getAllShows(Movie movieInterested, City city) {
        Map<Theater, List<Show>> theaterVsShows= new HashMap<>();

        List<Theater> theaters= cityVsTheater.get(city);

        for(Theater theater: theaters){
            List<Show> shows= theater.getShows();
            for(Show show: shows){
                if(show.getMovie().getMovieId()== movieInterested.getMovieId()){
                    List<Show> showList= theaterVsShows.getOrDefault(theater,new ArrayList<>());
                    showList.add(show);
                    theaterVsShows.put(theater,showList);
                }
            }
        }
        return theaterVsShows;
    }
}
