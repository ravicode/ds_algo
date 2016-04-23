package Design_Questions;

public class DesignElevatorSystem {

}

/*Elevator
private int weightApplied
private int passengerNumber;
private String elevatorID;
private int floorNumber
private int capacity
private boolean started
private String direction
private String state
private boolean goingUp
private boolean doorsOpen
private PriorityQueue pq//PQ that gives priority to different floors based on floorNumber, non-preemptive priority scheduling

void go_up(int floorNumber);
void go_down(int floorNumber);
boolean isStarted(boolean start);
boolean setStarted(boolean start);
void load_passengers();
void unload_passengers();
etc...
getters and setters for all instance variables...
Passenger extends Elevator
private int destinationFloor;

int current_destination(int destinationFloor)*/

/*
 * My idea is to make Elevator implement Runnable, and constantly check a queue (linkedList). 
 * A Controller class will assign which floor to go in the queue. When the queue is empty, 
 * the run() method will wait (queue.wait() ), when a floor is assigned to this elevator, 
 * it will call queue.notify() to wake up the run() method, and run() method will call 
 * goToFloor(queue.pop())
 */

/*enum Motion 
{ 
	Going_Up, Going_Down, Stoped 
} 

Class Lift 
{ 
	int current Floor; 
	int priorityQueue nextFloorToStop; 
	int LiftId; 
} 

Class LiftController 
{ 
	array of lifts; 
	queue Allrequests; 

	public void CallLift(int floorIndex) 
	{ 

	} 

	public void int NearestLift(int floorIndex) 
	{ 

	} 

	public void bool IsMovingInSameDirection(int liftId, int FloorIndex) 
	{ 

	} 
} 

If No lift is available to take request then add that request in AllRequest queue else add it in lift's queue. 
When when lift comes to stop (after completing its all floor stops) then it will notify controller class to 
check if there is any request pending in "allRequest Queue".*/