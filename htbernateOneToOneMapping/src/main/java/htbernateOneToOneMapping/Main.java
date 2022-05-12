package htbernateOneToOneMapping;

import org.hibernate.Session;

import htbernateOneToOneMapping.model.Account;
import htbernateOneToOneMapping.model.Employee;
import htbernateOneToOneMapping.util.HibernateUtil;

public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Employee emp1 = new Employee("abc", "def", 22, 62000);
		Account emp1Account = new Account("22325565432", emp1);
		session.save(emp1Account);
		session.save(emp1);
		session.getTransaction().commit();
		session.close();
	}
}
