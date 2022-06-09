package hibernateCrudOps.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateCrudOps.Model.Student;
import hibernateCrudOps.Util.HibernateUtil;

public class StudentDao implements IStudentDao {
	@Override
	public void saveStudent(Student student) {
		Transaction transaction =null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			

			transaction = session.beginTransaction();
			Student foundStudent = findStudent(student.getEmail());
			if(foundStudent.getEmail().equals(student.getEmail()))
			{
				System.out.println("duplicate data");
			} 
			else {
				session.save(student);
			}
//			session.save(student);
			transaction.commit();
			
		} catch (Exception e) {
//			if(transaction!=null)
//			{
//				transaction.rollback();
//			}
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudent(Student student) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.saveOrUpdate(student);
			transaction.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Student getStudentByemail(String email) {
		Transaction transaction =null;
		Student student = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			student = findStudent(email);
			transaction.commit();
//			session.close();
		}
		catch (Exception e) {
//				if(transaction!=null)
//				{
//					transaction.rollback();
//				}
			e.printStackTrace();
		}
		return student;
	}
	private Student findStudent(String email)
	{
		Student student =null;
		List<Student> allStudent = getAllStudents();
		for(int i=0;i<allStudent.size();i++)
		{
			if(allStudent.get(i).getEmail().equals(email))
			{
				student= allStudent.get(i);
				break;
			}
		}
		return student;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudents() {
		Transaction transaction=null;
		List<Student> students = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			students = session.createQuery("from Student").list();
			transaction.commit();
//			session.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}

	@Override
	public void deleteStudent(Integer id) {
		Transaction transaction=null;
		Student student = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			
			List<Student> allStudent = getAllStudents();
			for(int i=0;i<allStudent.size();i++)
			{
				if(allStudent.get(i).getId()==id)
				{
					student = allStudent.get(i);
					session.delete(student);
					break;
				}
			}
			
			transaction.commit();
//			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
