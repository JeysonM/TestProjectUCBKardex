
public class UCBKardex {
	
	public static void main(String[] args) {
		System.out.println("Creating a list of Students...");
		Database INF209List = new Database();
		
		System.out.println("Creating a new record...");
    	Student Student001 = new Student("Pepe Martillo",1991,"001");
    	Student001.setAddress("Av. America", "Cochabamba","1234");
    	System.out.println ( "\n\n" );
    	Student001.enterMarks(8,7,4);
    	System.out.println ( Student001.GetStudentGradeReport());
    	INF209List.addPerson(Student001);

    	System.out.println("Creating a new record...");
    	Student Student002 = new Student("Darth Vader",1970,"002");
    	Student002.setAddress("Death Star","Far far galaxy","2396");
    	System.out.println ( "\n\n" );
    	Student002.enterMarks(9,9,8);
    	System.out.println ( Student002.GetStudentGradeReport());
    	INF209List.addPerson(Student002);
    	
    	
    	System.out.println ("-----All Students-----");
    	INF209List.listAll();
    	
    	System.out.println("Creating a Staff...");
    	Staff Staff001 = new Staff("Luke Skywalker", 1980, "005");
    	Staff001.setSalary(Staff001.calculatePayment(99));
    	System.out.println(Staff001.toString());
    	System.out.println ("The loan is paid during year:"+ Staff001.calculateLoan(10000,0.12,75,3000));
        

	}

}


