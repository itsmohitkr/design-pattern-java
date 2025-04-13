package online.devplanet.Basics.InterviewQuestion.LLDElevatorPattern;

import java.util.List;

public class ExternalDispatcher {
    List<ElevatorController> elevatorControllerList=ElevatorCreator.elevatorControllerList;

    public void submitExternalButton(int floorNumber, Direction direction){
        for (ElevatorController elevatorController : elevatorControllerList) {
            int elevatorId= elevatorController.elevatorCar.elevatorCarId;


        }

    }
}
