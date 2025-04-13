package online.devplanet.Basics.InterviewQuestion.LLDElevatorPattern;

import java.util.PriorityQueue;

public class ElevatorController {
    PriorityQueue<Integer>upMinPQ;
    PriorityQueue<Integer>downMaxPQ;
    ElevatorCar elevatorCar;

    public ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
        this.upMinPQ = new PriorityQueue<>();
        this.downMaxPQ = new PriorityQueue<>((a, b) -> b - a);
    }

    public void submitExternalRequest(int floorNumber, Direction direction) {
        if (direction == Direction.UP) {
            upMinPQ.offer(floorNumber);
        } else {
            downMaxPQ.offer(floorNumber);
        }
    }

    public void submitInternalRequest(int floorNumber) {
        if (elevatorCar.elevatorState == ElevatorState.IDLE) {
            elevatorCar.currentFloor = floorNumber;
            elevatorCar.setElevatorDisplay();
        } else if (elevatorCar.elevatorState == ElevatorState.MOVING) {
            if (elevatorCar.elevatorDirection == Direction.UP) {
                upMinPQ.offer(floorNumber);
            } else {
                downMaxPQ.offer(floorNumber);
            }
        }
    }

    public void controlElevator(){
        while(true){

        }
    }
}
