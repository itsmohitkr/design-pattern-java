package online.devplanet.Basics.InterviewQuestion.LLDElevatorPattern;

public class ElevatorCar {
    int elevatorCarId;
    int currentFloor;
    ElevatorDisplay elevatorDisplay;
    InternalButtons internalButtons;
    ElevatorState elevatorState;
    Direction elevatorDirection;
    ElevatorDoor elevatorDoor;

    public ElevatorCar(){
        elevatorDisplay=new ElevatorDisplay();
        internalButtons=new InternalButtons();
        elevatorState=ElevatorState.IDLE;
        elevatorDirection=Direction.UP;
        elevatorDoor=new ElevatorDoor();
        currentFloor=0;
    }

    public void showDisplay(){
        elevatorDisplay.showDisplay();
    }
    public void pressButton(int destinationFloor){
        internalButtons.pressButton(destinationFloor, this);
    }

    public void setElevatorDisplay(){
        this.elevatorDisplay.setDisplay(currentFloor,elevatorDirection);
    }


}
