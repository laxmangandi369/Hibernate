package hibernateManyToManyMapping;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hibernateManyToManyMapping.Model.Answer;
import hibernateManyToManyMapping.Model.Question;
import hibernateManyToManyMapping.Util.HibernateUtil;

public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
			try {
				
				
				Answer ans1 = new Answer("java is a programming language","Ravi Malik" );
				Answer ans2 = new Answer("Java is a open Source Software", "Sudhir Kumar");
				Answer ans3 = new Answer("Java is platform Independent","Ashley Young");
				List<Answer> question1Answers = new LinkedList<Answer>();
				question1Answers.add(ans1);
				question1Answers.add(ans2);
				question1Answers.add(ans3);
				
				Question que1 = new Question("What is java?",question1Answers);
				session.save(ans2);
				session.save(ans1);
				session.save(ans3);
				session.save(que1);
				
				session.getTransaction().commit();
				session.close();
			
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}

}
