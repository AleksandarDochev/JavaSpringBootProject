package com.SpringApp.springboot.demo.SpringBootProject;


//import com.SpringApp.springboot.demo.SpringBootProject.rest.TestRestController;
import com.SpringApp.springboot.demo.SpringBootProject.dao.StudentDAO;
import com.SpringApp.springboot.demo.SpringBootProject.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

//we are adding whitch folders(packadges) should our spring boot app scan
//we are doing this so we can scann components out side of our base directory
//we also have to mention our base dir in the configuration , we moved our Coach and CricketCoach
//back to our common packadge so we don't need this for now
/*@org.springframework.boot.autoconfigure.SpringBootApplication(
		scanBasePackages = {"com.SpringApp.springboot.demo.SpringBootProject",
				            "com.SpringApp.util"}
)
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplicationCrudAPP {

	public static void main(String[] args) {SpringApplication.run(SpringBootApplicationCrudAPP.class, args);}

	@Bean //we define a commandline runner for command line application
	//this CommandLineRunner comes from the Spring Boot Framework
	//and this snipped of code is executed after the Spring Beans have been loaded
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

//		CommandLineRunner runner = new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//				System.out.println("Hello World!");
//			}
//		};
		//with the -> here we skip the otherwise needed implementation  up bove
		return runner ->{
			//createStudent(studentDAO);
			//createMultipleStudents(studentDAO);
			//readStudent(studentDAO);
			//queryForAllStudent(studentDAO);
			//queryForAllStudentSorted(studentDAO);
			//queryForStudentsByLastName(studentDAO);
			//updateStudent(studentDAO);
			deleteStudent(studentDAO);
		};
	}

	private void deleteStudent(StudentDAO studentDAOinApp) {
		//relive the student based  on the ID the primary key
        int StudentId = 1;
        System.out.println("Deleting student with ID " + StudentId);
        studentDAOinApp.deleteByIdStudentMethod(StudentId);
        System.out.println("Student deleted with ID " + StudentId);
	}

	private void updateStudent(StudentDAO studentDAO) {
		//relive the student based  on the ID the primary key
		int StudentId = 1;
		System.out.println("Getting student with ID " + StudentId);
        Student myStudent = studentDAO.findByID(StudentId);
		//change first name to "John"
		System.out.println("Updating student...");
		myStudent.setFirstName("John");
        //update the student
		studentDAO.updateStudentMethod(myStudent);
		//display and update student
		System.out.println("Updating targeted Student :"+ myStudent);
		//check updated student status
		// TODO  create a first name query for student checks
//		System.out.println("Updated student: " + studentDAO.queryByLastName());
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		//get a list of students
        List<Student> theStudents = studentDAO.findOnlyByLastName("Doe");
        //display list of students
        System.out.println("Printing all students by last name Doe: ");
        for (Student tempStudent : theStudents){
            System.out.println(tempStudent);
        }
	}

	private void queryForAllStudent(StudentDAO studentDAO) {
		//get a list of students
		List<Student> theStudents = studentDAO.findAll();
        //display list of students
		System.out.println("Printing all students: ");
        for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}
	private void queryForAllStudentSorted(StudentDAO studentDAO) {
		//get a list of students
		List<Student> theStudents = studentDAO.queryByLastName();
		//display list of students
		System.out.println("Printing all students sorted by lastname: ");
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		//create a student object
		System.out.println("Creating new students object....");
		Student tempStudent = new Student("Daffy","Duck","bbablblabbla@abv.bg");
		//save the student
		System.out.println("Saving the students ...");
		studentDAO.save(tempStudent);

		//display id of the save student
		int theid = tempStudent.getId();
		System.out.println("Saved student. Generated id: " + theid);

		//retrieve student based on id : primary key
		System.out.println("Retreaving student with id: " + theid);
		Student myStudent =studentDAO.findByID(theid);

		//display student
		System.out.println("Found the student: "+myStudent);



	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		//create the students object
		System.out.println("Creating new students object....");
		Student tempStudent = new Student("Paul","Doe","bbablblabbla@abv.bg");
		Student tempStudent2 = new Student("boul","dsd","awda@abv.bg");
		Student tempStudent3 = new Student("smalu","Ddasad","bawawef@abv.bg");
		//save the student
		System.out.println("Saving the students ...");
		studentDAO.save(tempStudent);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		//display id of saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
		System.out.println("Saved student. Generated id: " + tempStudent2.getId());
		System.out.println("Saved student. Generated id: " + tempStudent3.getId());
	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating new student object....");
		Student tempStudent = new Student("Paul","Doe","bbablblabbla@abv.bg");
		//save the student
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);
		//display id of saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}

}
