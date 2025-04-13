package online.devplanet.Basics.InterviewQuestion.LLDElevatorPattern;

public class ElevatorDisplay {
    int floorNumber;
    Direction direction;

    public void setDisplay(int floorNumber, Direction direction) {
        this.floorNumber = floorNumber;
        this.direction = direction;
    }

    public void showDisplay(){
        System.out.println(floorNumber);
        System.out.println(direction);
    }

}
