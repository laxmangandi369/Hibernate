package hibernateJavaBased.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.mapping.MetadataSource;

public class HibernateUtil {
	public static StandardServiceRegistry register;
	public static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory==null)
		{
			try {
				register = new StandardServiceRegistryBuilder().configure().build();
				MetadataSources source = new MetadataSources(register);
				Metadata data = source.getMetadataBuilder().build();
				sessionFactory = data.getSessionFactoryBuilder().build();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return sessionFactory;
	}

	public static void shutdown() {
		if (register != null) {
			StandardServiceRegistryBuilder.destroy(register);
		}
	}
}
