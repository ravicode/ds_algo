package Dynamic_Programming;

public class EggDroppingProblem {


/* Function to get minimum number of trails needed in worst
case with n eggs and k floors */
static int eggDrop(int numberOfeggs, int numberOfFloors)
{
  /* A 2D table where entery eggFloor[i][j] will represent minimum
     number of trials needed for i eggs and j floors. */
  int eggFloor[][]=new int[numberOfeggs+1][numberOfFloors+1];
  int res;
  int i, j, x;

  // We need one trial for one floor and0 trials for 0 floors
  for (i = 1; i <= numberOfeggs; i++)
  {
      eggFloor[i][1] = 1;
      eggFloor[i][0] = 0;
  }

  // We always need j trials for one egg and j floors.
  for (j = 1; j <= numberOfFloors; j++)
      eggFloor[1][j] = j;

  // Fill rest of the entries in table using optimal substructure
  // property
  for (i = 2; i <= numberOfeggs; i++)
  {
      for (j = 2; j <= numberOfFloors; j++)
      {
          eggFloor[i][j] = Integer.MAX_VALUE;
          for (x = 1; x <= j; x++)
          {
              res = 1 + Math.max(eggFloor[i-1][x-1], eggFloor[i][j-x]);
              //if it breaks(1 less egg to work with and x-1 floors to work, if it doesnt break(same number of egss and (j-x) floors to work with
              if (res < eggFloor[i][j])
                  eggFloor[i][j] = res;
          }
      }
  }

  // eggFloor[n][k] holds the result
  return eggFloor[numberOfeggs][numberOfFloors];
}

/* Driver program to test to pront printDups*/
public static void main(String[] args) {
  int n = 2, k = 6;
  System.out.println("\nMinimum number of trials in worst case with "+n+" eggs and "+k+
           " floors is="+ eggDrop(n, k));
  
}
}