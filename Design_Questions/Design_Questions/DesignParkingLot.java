package Design_Questions;

//Design a parking lot where cars and motorcycles can be parked.

/*
 * Some questions needs to be asked --- Are both expected to consume the same amount of space? 
 * (It may be desirable that a different parking lot or a different level or a selected area be designated for
 *  Motorcycle parking). 
Other important point that needs consideration are duration of parking and payment, 
Type of parking spot (Regular, Valet or for Handicapped - More classes can be added).
 */
public class DesignParkingLot {

}


/*
 * class ParkingLot
{
    Space[][] spaces;

    ParkingLot(wide, long); // constructor

    FindOpenSpace(TypeOfCar); // find first open space where type matches
}

enum TypeOfSpace = {compact, handicapped, regular };
enum TypeOfCar = {compact, handicapped, regular };

class Space
{
    TypeOfSpace type;
    bool empty;
    // gets and sets here
    // make sure car type
}

class car
{
    TypeOfCar type;
}

 */

/*
 * public class ParkingLot 
{
    Vector<ParkingSpace> vacantParkingSpaces = null;
    Vector<ParkingSpace> fullParkingSpaces = null;

    int parkingSpaceCount = 0;

    boolean isFull;
    boolean isEmpty;

    ParkingSpace findNearestVacant(ParkingType type)
    {
        Iterator<ParkingSpace> itr = vacantParkingSpaces.iterator();

        while(itr.hasNext())
        {
            ParkingSpace parkingSpace = itr.next();

            if(parkingSpace.parkingType == type)
            {
                return parkingSpace;
            }
        }
        return null;
    }

    void parkVehicle(ParkingType type, Vehicle vehicle)
    {
        if(!isFull())
        {
            ParkingSpace parkingSpace = findNearestVacant(type);

            if(parkingSpace != null)
            {
                parkingSpace.vehicle = vehicle;
                parkingSpace.isVacant = false;

                vacantParkingSpaces.remove(parkingSpace);
                fullParkingSpaces.add(parkingSpace);

                if(fullParkingSpaces.size() == parkingSpaceCount)
                    isFull = true;

                isEmpty = false;
            }
        }
    }

    void releaseVehicle(Vehicle vehicle)
    {
        if(!isEmpty())
        {
            Iterator<ParkingSpace> itr = fullParkingSpaces.iterator();

            while(itr.hasNext())
            {
                ParkingSpace parkingSpace = itr.next();

                if(parkingSpace.vehicle.equals(vehicle))
                {
                    fullParkingSpaces.remove(parkingSpace);
                    vacantParkingSpaces.add(parkingSpace);

                    parkingSpace.isVacant = true;
                    parkingSpace.vehicle = null;

                    if(vacantParkingSpaces.size() == parkingSpaceCount)
                        isEmpty = true;

                    isFull = false;
                }
            }
        }
    }

    boolean isFull()
    {
        return isFull;
    }

    boolean isEmpty()
    {
        return isEmpty;
    }
}

public class ParkingSpace 
{
    boolean isVacant;
    Vehicle vehicle;
    ParkingType parkingType;
    int distance;
}

public class Vehicle 
{
    int num;
}

public enum ParkingType
{
    REGULAR,
    HANDICAPPED,
    COMPACT,
    MAX_PARKING_TYPE,
}
*/
