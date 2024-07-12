package Crud_Operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student1;

public class StudentSelect {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student1.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		Student1 student1= session.load(Student1.class, 3);
		System.out.println(student1);
		Student1 student2 =session.load(Student1.class, 2);
		System.out.println(student2);
		
	    
	}

}
