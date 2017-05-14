/**
 * A class representing students.
 *
 */

class Student extends Person
{
	private String SID;    // student ID number
	private int markForMaths; //math mark
	private int markForEnglish;//english mark
	private int markForScience;//science mark

    /**
     * Create a student with default settings for detail information.
     */

    Student()
    {
    	super("(unknown name)", 0000);
    	SID = "(unknown ID)";
    }
 

    /**
     * Create a student with given name, year of birth and student ID
     */
    Student(String name, int yearOfBirth, String studentID)
	{
		super(name, yearOfBirth);
        SID = studentID;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
       return SID;
    }

    /**
     * Return a string representation of this object.
     */
    public String toString()    // redefined from "Person"
    {
        return super.toString() +
               "Student\n" +
               "Student ID: " + SID + "\n";
    }
    
    public void enterMarks(int maths, int english, int science)
    {
    	markForMaths = maths;
    	markForEnglish = english;
    	markForScience = science;
    }

    // return mark for maths
    public int getMathsMark()
    {
    	return markForMaths;
    }

    // return mark for English
    public int getEnglishMark()
    {
    	return markForEnglish;
    }
    
    // return mark for Science
    public int getScienceMark()
    {
    	return markForScience;
    }

    // return the average of the three marks
    public double calculateAverageMark()
    {
    	return ((markForMaths + markForEnglish +
    			markForScience) / 3.0);
    }
    
    //return the grade 
    public String getGrade(double gradeFloat)
    {
    	String category;
    	int grade;
    	grade = (int) Math.round(gradeFloat); 
    	switch (grade)
    	{
    	case 10:
    		category = "Perfect Score";
    		break;
    	case 9:
    		category = "Excellent";
    		break;
    	case 8:
    		category = "Good";
    		break;
    	case 7:
    		category = "Above Average";
    		break;
    	case 6:
    		category = "Average";
    		break;
    	case 5:
    		category =  "Below Average";
    		break;
    	default:
    		category = "Not Passing";
    		break;
    	}
    	return category;
    	
    }
    
    //return the marks report
    public String GetStudentGradeReport()
    {
        return "Grades Report"+ "\n"+
                "Name: " +this.getName()+ "\n"+
    	        "Average: " +this.calculateAverageMark()+ "\n"+
    	        "Grade: " +this.getGrade(this.calculateAverageMark()) + "\n"+
    	        "Math Mark: " + markForMaths + "\n"+
    	        "English Mark: " + markForEnglish + "\n"+
    	        "Science Mark: " + markForScience + "\n";
    }
 }


