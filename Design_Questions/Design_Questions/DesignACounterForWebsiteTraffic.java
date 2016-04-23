package Design_Questions;


/*
 * If we need to maintain statistics for only a week than "Circular buffer" will be the right candidate. 
It will contain 7 buckets (day, count). 
As we will reach at 7th day (completed cycle), it will override first day. 

And we will maintain a single global counter for "week". 
Each time we will move from Sunday to Monday and will overiride Monday than we will remove its count value from the week counter.


Mon->Tue->Wed->Thu->Fri->Sat->Sun->Mon

 */
public class DesignACounterForWebsiteTraffic {

}
