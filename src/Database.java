import java.util.ArrayList;
import java.util.Iterator;

/**
 * A very simple database of people in a university. This class simply stores
 * persons and, at request, lists them on standard output.
 */

public class Database {

	private ArrayList persons;

 	/**
	 * Create a new, empty person database.
     */
  	public Database() 
	{
        persons = new ArrayList();
    }

    /**
     * Add a person to the database.
     */
    public void addPerson(Person p) 
	{
        persons.add(p);
    }

    /**
     * List all the persons currently in the database on standard out.
     */
    public void listAll () 
    {
        for (Iterator i = persons.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
    }
    
    /**
	 * return all persons of the database.
     */
  	public Object firstPerson() 
	{
        return persons.get(0);
    }
  	/**
	 * return first person of the database.
     */
  	public ArrayList getAllPersons() 
	{
        return persons;
    }
}
