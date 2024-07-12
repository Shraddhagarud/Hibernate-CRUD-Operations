package Crud_Operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student1;

public class StudentInsert {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student1.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		Transaction transaction=session.beginTransaction();
		Student1 student1=new Student1(3,"mahesh","Garud","mahesh@123");
	    session.save(student1);
	    transaction.commit();
	}

}
