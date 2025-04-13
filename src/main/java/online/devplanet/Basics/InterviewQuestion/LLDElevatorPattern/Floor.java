package online.devplanet.Basics.InterviewQuestion.LLDElevatorPattern;

public class Floor {
    int floorNumber;
    ExternalDispatcher externalDispatcher;

    public Floor(int floorNumber){
        this.floorNumber=floorNumber;
        this.externalDispatcher=new ExternalDispatcher();
    }

    public void pressButton(Direction direction){
        externalDispatcher.submitExternalButton(floorNumber, direction);
    }
}
