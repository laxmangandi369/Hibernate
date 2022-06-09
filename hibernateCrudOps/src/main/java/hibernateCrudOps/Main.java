package hibernateCrudOps;

import java.util.List;

import hibernateCrudOps.Model.Student;
import hibernateCrudOps.dao.StudentDao;

public class Main {
	public static void main(String[] args) {
	
		StudentDao studentDao = new StudentDao();
		
		Student student1 = new Student("Anand","Bhardwaz","anandbhardwaz@gmail.com");
		Student student2 = new Student("Atif","Rahim","atifrhm@gmail.com");
		Student student3 = new Student("Antony","Albanese","antonyalb@gmail.com");
		Student student4 = new Student("Han","Duck-soo","ducksoohan@gmail.com");
		studentDao.saveStudent(student4);
		studentDao.saveStudent(student3);
		studentDao.saveStudent(student2);
		studentDao.saveStudent(student1);
//		studentDao.deleteStudent(14);
//		studentDao.deleteStudent(13);
//		studentDao.deleteStudent(12);
//		studentDao.deleteStudent(11);
		
		
		List<Student> list = studentDao.getAllStudents();
		
		list.forEach(allStudent -> System.out.println(allStudent.getFname()));
		
	}
}
