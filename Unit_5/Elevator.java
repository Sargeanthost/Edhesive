// Unit 5: Lesson 5 - Coding Activity 2

public class Elevator {

  private int maxFloor; // Represents max possible floor of elevator.
  private int currentFloor; // Represents current floor of elevator.
  private boolean inService = true; // True if elevator in service, false if not.

  // Creates an elevator which is in service. If max is greater than 1 sets
  // the maximum floor to max, otherwise sets the maximum floor to 2. If start
  // is between 1 and the maximum floor inclusive, the elevator starts at this
  // floor, otherwise it starts at 1.
  public Elevator(int max, int start) {
    // if (max > 1){
    // maxFloor = max;
    // }else{
    // maxFloor = 2;
    if (start >= 1 && start <= maxFloor) {
      currentFloor = start;
    } else {
      currentFloor = 1;
    }
    inService = true;
    maxFloor = max > 1 ? max : 2;
    // if(start <= max && start >=1){
    // currentFloor = start;
    // } else{
    // currentFloor = 1;
    // }
    // // currentFloor = start <= max && start >=1 ? start : 1;
    // inService = true;
  }

  // Returns the maximum floor of the elevator.
  public int getMaxFloor() {
    return maxFloor;
  }

  // Returns the floor the elevator is currently on.
  public int getCurrentFloor() {
    return currentFloor;
  }

  // Returns true if the elevator is in service, false if it is not.
  public boolean isInService() {
    return inService;
  }

  // If the elevator is in service, sets it to not be in service. If the
  // elevator is not in service, sets it to be in service.
  public void toggleInService() {
    inService = !inService;
  }

  // If the value of floor is between 1 and the maximum floor inclusive, and
  // the elevator is in service, sets the current floor to floor. Otherwise
  // does nothing.
  public void goToFloor(int floor) {
    if (inService && (1 <= floor && floor <= maxFloor)) {
      currentFloor = floor;
    }
  }
}
