package com.SpringApp.springboot.demo.SpringBootProject;


//import com.SpringApp.springboot.demo.SpringBootProject.rest.TestRestController;
import com.SpringApp.springboot.demo.SpringBootProject.dao.StudentDAO;
import com.SpringApp.springboot.demo.SpringBootProject.entity.Student;
import com.SpringApp.springboot.demo.SpringBootProject.rest.SpringCoreController;
import com.SpringApp.springboot.demo.SpringBootProject.rest.TestRestController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

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
			queryForStudent(studentDAO);
		};
	}

	private void queryForStudent(StudentDAO studentDAO) {
		//get a list of students
		List<Student> theStudents = studentDAO.findAll();
        //display list of students
		System.out.println("Printing students: ");
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
