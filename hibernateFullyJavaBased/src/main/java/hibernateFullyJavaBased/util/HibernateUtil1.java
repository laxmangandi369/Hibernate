package hibernateFullyJavaBased.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.exception.spi.Configurable;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil1 {
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory == null)
		{
			try {
				Configuration configure = new Configuration();
				Properties properties = new Properties();
				properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
				properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate_02");
				properties.put(Environment.USER, "root");
				properties.put(Environment.PASS, "root@123");
				properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				properties.put(Environment.SHOW_SQL, "true");
				properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				properties.put(Environment.HBM2DDL_AUTO, "update");
				
				configure.setProperties(properties);
				configure.addAnnotatedClass(hibernateFullyJavaBased.model.Player.class);
				
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configure.getProperties()).build();
				
				sessionFactory = configure.buildSessionFactory(serviceRegistry);
				
			} catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return sessionFactory;
	}
	

}
