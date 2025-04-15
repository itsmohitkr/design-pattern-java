package online.devplanet.Basics.InterviewQuestion.LLDbookMYShow;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    int screeId;
    List<Seat> seats = new ArrayList<>();

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public int getScreeId() {
        return screeId;
    }

    public void setScreeId(int screeId) {
        this.screeId = screeId;
    }
}
