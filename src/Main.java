import java.util.ArrayList;
import java.util.Iterator;


public class Main {
private ArrayList<Student> students= new ArrayList<Student>();
private ArrayList<Team> teams= new ArrayList<Team>();
	public Main() {
		//ADD YOURSELF HERE with your Name, github email, and github username
		Student nathan = new Student("Nathan Green", "github@nathangreen.com", "ndgreen");
		nathan.canNotMeet(Day.SATURDAY);//Choose only the days you cannot meet
		nathan.canNotMeet(Day.SUNDAY);
		nathan.preferTimeToMeet(Time.DAY); // Choose Day/Night/Either
		addStudent(nathan);
		
		//Add yourself below here, Do not delete other Users
		Student arland = new Student("Arland Torres", "atorresgarcia9407@westfield.ma.edu", "ArlandTorres");
		arland.canNotMeet(Day.FRIDAY);
		arland.canNotMeet(Day.SATURDAY);
		arland.preferTimeToMeet(Time.EITHER); //MWF after 2:30, TR after 11:00. Sunday after 12.
		addStudent(arland);
		
		
	
		
		
		
		
		//finish add 
		printAllStudents();
	}

	public static void main(String[] args) {
      new Main();
	}
	
	private void addStudent(Student s){
		students.add(s);		
	}
	private void addStudentToTeam(Student s, int team){
		teams.get(team).addStudent(s);
	}

	private void printAllStudents(){
		Iterator<Student> i=students.iterator();
		while(i.hasNext()){
			i.next().printInfo();
		}
	}
}
