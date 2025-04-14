package online.devplanet.Basics.InterviewQuestion.LLDElevatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {
    static List<ElevatorController> elevatorControllerList = new ArrayList<>();

    static {
        ElevatorCar elevatorCar1 = new ElevatorCar();
        elevatorCar1.elevatorCarId=1;
        ElevatorController elevatorController1 = new ElevatorController(elevatorCar1);

        ElevatorCar elevatorCar2 = new ElevatorCar();
        elevatorCar2.elevatorCarId=2;
        ElevatorController elevatorController2 = new ElevatorController(elevatorCar2);

        elevatorControllerList.add(elevatorController1);
        elevatorControllerList.add(elevatorController2);
    }

}
