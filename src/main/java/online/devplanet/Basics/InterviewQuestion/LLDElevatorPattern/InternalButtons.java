package online.devplanet.Basics.InterviewQuestion.LLDElevatorPattern;

public class InternalButtons {
    InternalDispatcher dispatcher = new InternalDispatcher();
    int[] availableButtons={1,2,3,4,5,6,7,8,9,10};

    int buttonSeleced;

    public void pressButton(int destinationFloor, ElevatorCar elevatorCar) {
        dispatcher.submitInternalRequest(destinationFloor, elevatorCar);
    }
}
