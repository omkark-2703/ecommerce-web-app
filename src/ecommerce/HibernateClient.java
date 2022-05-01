package ecommerce;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateClient {
	
	Session session;

	public HibernateClient() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		session = factory.openSession();

	}

	public void insert(Product product) {
		Transaction t = session.beginTransaction();
		session.save(product);
		t.commit();

	}
	
	public void update(Product product) {
		Transaction t = session.beginTransaction();
		session.saveOrUpdate(product);
		t.commit();
	}

	public Product get(int id) {
		Product product = null;
		Transaction t = session.beginTransaction();
		product = session.get(Product.class, id);
		t.commit();
		return product;
	}
	
	public void remove(Product product) {
		Transaction t = session.beginTransaction();
		session.delete(product);
		t.commit();
	}
	
	public boolean contains(User u) {
		
		Transaction t = session.beginTransaction();
		
		User user= session.get(User.class, u.getUsername());
		
		if (user != null) {
			
			return true;
		}
		
			return false;
	}

	public void close() {
		session.close();
	}
	
	public ArrayList<Product> getAll() {
		ArrayList < Product > students = null;
		students  = (ArrayList<Product>) session.createQuery("from Product", Product.class).list();
		
		return students;
	}

	
}
