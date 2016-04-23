package Design_Questions;


/*
 * For irctc design question: is it find in this way :
I would have three tables Train, Station and TrainStations(which is a join of two prev tables).
Train would have train id, train name etc columns
Station would have station id, station name etc columns
TrainStations would have train id, station id, running day etc as columns

Now user would give :
From Station 
To Station
Date
using "From station" one can fetch station id using which one can find all trains from which comes to this station 
on a particular day
(first fetch day from date given by user)->list1
Then "To station" name we can find station id of destination station
 then from TrainStations table we can find all trains which have "To station"->list2 
then intersection of list1 and list2 gives the answer.

 */
public class DesignIRCTC {

}
