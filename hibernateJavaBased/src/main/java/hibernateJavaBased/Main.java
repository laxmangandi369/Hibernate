package hibernateJavaBased;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateJavaBased.model.Student;
import hibernateJavaBased.util.HibernateUtil;

public class Main {
	public static void main(String[] args) {
		Transaction trans= null;
		Student s1= new Student("aditiya","Kanimaar","kanimar.adi@gmail.com");
		Student s2 = new Student("aishwariya","pratap","pratap.ash@gmail.com");
		
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			trans= session.beginTransaction();
			
			session.save(s1);
			session.save(s2);
			trans.commit();
		}catch (Exception e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		}
	}
}
