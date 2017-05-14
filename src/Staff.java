/**
 * A class representing staff members
 */
class Staff extends Person
{
    private String room;
    private double salary;
    

    /**
     * Create a staff member with default settings for detail information.
     */
    Staff()
    {
        super("(unknown name)", 0000);
        room = "(unknown room)";
    }

    /**
     * Create a staff member with given name, year of birth and room
     * number.
     */
    Staff(String name, int yearOfBirth, String roomNumber)
    {
        super(name, yearOfBirth);
        room = roomNumber;
    }

    /**
     * Set a new room number for this person.
     */
    public void setRoom(String newRoom)
    {
        room = newRoom;
    }

    /**
     * Return the room number of this person.
     */
    public String getRoom()
    {
        return room;
    }
    
    /**
     * Return the salary.
     */
    public double getSalary()
    {
        return salary;
    }
    
    /**
     * Return the salary.
     */
    public void setSalary(double payment)
    {
        salary = payment;
    }

    /**
     * Return a string representation of this object.
     */
    public String toString()    // redefined from "Person"
    {
        return super.toString() +
               "Staff member\n" +
               "Room: " + room + "\n"+
               "Salary: "+ salary+ "\n";
               
    }
    
    public double calculatePayment(int hours)
    {
    	final double RATE = 8.25;
    	final int STANDARD = 40;
    	double pay = 0.0;
    	if (hours > STANDARD)
    	{
    		pay = STANDARD * RATE +  (hours - STANDARD)*1.5*RATE;
    	}
    	else
    	{
    		pay = hours * RATE; 
        }
    	return pay;
    }
    
    public int calculateLoan(double loan, double interests, double fee, double payment)
    {
		int currentYear=2017;
    	for (currentYear = 1; loan>=0; currentYear++)
    	{
    		loan = loan + (loan * interests) + (12.0 * fee);
    		loan = loan - payment;
    		if (loan<0)
    		{
    			return currentYear;
    		}
    		
    	}
		return -1;
    }
    
}

