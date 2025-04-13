package online.devplanet.Basics.InterviewQuestion.LLDElevatorPattern;

import java.util.List;

public class InternalDispatcher {
    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

    public void submitInternalRequest(int floorNumber, ElevatorCar elevatorCar) {
        elevatorCar.elevatorState = ElevatorState.MOVING;
        elevatorCar.setElevatorDisplay();
        elevatorCar.currentFloor = floorNumber;
        elevatorCar.setElevatorDisplay();

        for (ElevatorController elevatorController : elevatorControllerList) {
            if (elevatorController.elevatorCar == elevatorCar) {
                elevatorController.submitInternalRequest(floorNumber);
                break;
            }
        }

    }
}
