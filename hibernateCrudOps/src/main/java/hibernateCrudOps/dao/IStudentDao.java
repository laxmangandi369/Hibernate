package hibernateCrudOps.dao;

import java.util.List;

import hibernateCrudOps.Model.Student;

public interface IStudentDao {
	void saveStudent(Student student);
	void updateStudent(Student student);
	Student getStudentByemail(String email);
	List<Student> getAllStudents();
	void deleteStudent(Integer id);
}
