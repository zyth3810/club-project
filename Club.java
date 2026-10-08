//Question 1
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class Club
{
    // Define any necessary fields here ...
    
    //Question 1
    private ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Question 1
        members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        // Question 3
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
        // Question 2
    }
    
    /**
     * @return The members who joined in the given month and year
     * Question 4
     */
    public int joinedInMonth(int month)
    {
      if (month > 12 || month < 1){
            System.out.println("Month is out of range");
            return 0;
      }else{
        int count = 0;
        for (Membership m : members){
            if (m.getMonth() == month){
                    count++;
                }
            }    
        return month;
        
      }
    }
    
    // Question 5
    /**
     * Remove from the club's collection all members who
     * joined in the given month, and return them stored
     * in a separate collection object.
     * @param month The month of the membership.
     * @param year The year of the membership.
     * @return The members who joined in the given month and year.
     * 
     */
    
     public ArrayList<Membership> purge(int month, int year){
         ArrayList<Membership> purgeList = new ArrayList<>();
         if (month < 1 || month > 12) {
             System.out.println("Month is outside of valid range");
             return purgeList;
         }
         
         Iterator<Membership> it = members.iterator();
         while (it.hasNext()){
             Membership m = it.next();
             if(m.getMonth() == month && m.getYear() == year){
                 purgeList.add(m);
                 it.remove();
             }
         }
         return purgeList;
    }
}
