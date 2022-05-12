package hibernateFullyJavaBased;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateFullyJavaBased.model.Player;
import hibernateFullyJavaBased.util.HibernateUtil1;

public class Main {
	public static void main(String[] args) {
		Player p1 = new Player("Akshay","patidaar","cricket player",22);
		Player p2 = new Player("Sachin","Tendulkar","cricket player",222);
		Player p3 = new Player("Aashish","Sehwag","cricket player",98);
		Player p4 = new Player("Jhon","Doe","cricket player",169);
		Player p5 = new Player("ALex","Albon","F1 Driver",32);
		Transaction transaction = null;
		try(Session session = HibernateUtil1.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			session.save(p4);
			session.save(p5);
			session.save(p1);
			
			transaction.commit();
		}
		catch(Exception ex)
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
			ex.printStackTrace();
		}
	}
}
