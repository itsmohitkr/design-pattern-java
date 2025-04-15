package online.devplanet.Basics.InterviewQuestion.LLDbookMYShow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {

    public MovieController movieController;
    public TheaterController theaterController;

    BookMyShow(){
        movieController= new MovieController();
        theaterController= new TheaterController();
    }

    public static void main(String[] args) {

        BookMyShow bookMyShow= new BookMyShow();
        bookMyShow.initialize();

        //user1
        bookMyShow.createBooking(City.Bangalore, "Bahubali");
        //user2
        bookMyShow.createBooking(City.Bangalore, "Bahubali");


    }

    private void createBooking(City city, String movieName) {
       // search movie by location
        List<Movie> movies = movieController.getMoviesByCity(city);

        Movie movieInterested = null;
        for(Movie movie: movies){
            if(movie.getMovieName().equals(movieName)){
                movieInterested= movie;
                break;
            }
        }

        Map<Theater, List<Show>> showsTheatreWise= theaterController.getAllShows(movieInterested,city);

        Map.Entry<Theater,List<Show>> entry = showsTheatreWise.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);

        //5. select the seat
        int seatNumber = 30;
        List<Integer> bookedSeats = interestedShow.getBookedSeatIds();
        if(!bookedSeats.contains(seatNumber)){
            bookedSeats.add(seatNumber);
            //startPayment
            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();
            for(Seat screenSeat : interestedShow.getScreen().getSeats()) {
                if(screenSeat.getSeatId() == seatNumber) {
                    myBookedSeats.add(screenSeat);
                }
            }
            booking.setBookedSeats(myBookedSeats);
            booking.setShow(interestedShow);
        } else {
            //throw exception
            System.out.println("seat already booked, try again");
            return;
        }

        System.out.println("BOOKING SUCCESSFUL");

    }

    private void initialize() {
        createMovies();
        createTheater();
    }

    private void createTheater() {

        Movie avengerMovie = movieController.getMovieByName("AVENGERS");
        Movie bahubali = movieController.getMovieByName("BAHUBALI");

        Theater inoxTheater = new Theater();
        inoxTheater.setTheaterId(234);
        inoxTheater.setScreens(createScreen());
        inoxTheater.setCity(City.Bangalore);

        List<Show>inoxShows= new ArrayList<>();
        Show inoxMorningShow= createShow(1,inoxTheater.getScreens().get(0),avengerMovie, 10);
        Show inoxEveningShow = createShow(2, inoxTheater.getScreens().get(0), bahubali, 16);
        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);
        inoxTheater.setShows(inoxShows);

        Theater pvrTheater = new Theater();
        pvrTheater.setTheaterId(334);
        pvrTheater.setScreens(createScreen());
        pvrTheater.setCity(City.Delhi);

        List<Show> pvrShows = new ArrayList<>();
        Show pvrMorningShow = createShow(1, pvrTheater.getScreens().get(0),avengerMovie, 10);
        Show pvrEveningShow = createShow(2, pvrTheater.getScreens().get(0), bahubali, 16);
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);
        pvrTheater.setShows(pvrShows);

        theaterController.addTheater(City.Delhi, pvrTheater);
        theaterController.addTheater( City.Bangalore,inoxTheater);
    }

    private List<Screen> createScreen() {
        List<Screen>screens= new ArrayList<>();
        Screen screen1= new Screen();
        screen1.setScreeId(1);
        screen1.setSeats(createSeats());
        screens.add(screen1);

        return screens;
    }

    //creating 100 seats
    private List<Seat> createSeats() {

        //creating 100 seats for testing purpose, this can be generalised
        List<Seat> seats = new ArrayList<>();

        //1 to 40 : SILVER
        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }

        //41 to 70 : SILVER
        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

        //1 to 40 : SILVER
        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }

        return seats;
    }



    List<Integer>bookedSeatIds= new ArrayList<>();
    private Show createShow(int showId, Screen screen, Movie movie, int showStartTime) {
        Show show= new Show();
        show.setShowId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setShowStartTime(showStartTime);
        return show;
    }

    private void createMovies() {
        Movie movie1= new Movie();
        movie1.setMovieId(8345);
        movie1.setMovieName("Avenger");
        movie1.setMovieDurationInMinutes(160);

        Movie movie2 = new Movie();
        movie2.setMovieId(8245);
        movie2.setMovieName("Bahubali");
        movie2.setMovieDurationInMinutes(180);

        movieController.addMovie(City.Bangalore, movie1);
        movieController.addMovie(City.Delhi, movie1);
        movieController.addMovie(City.Bangalore, movie2);
        movieController.addMovie(City.Delhi,movie2);



    }
}
