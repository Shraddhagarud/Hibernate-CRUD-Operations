package Crud_Operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student1;

public class StudentUpdate {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student1.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		Transaction transaction=session.beginTransaction();
		Student1 student1=new Student1(1,"Shree","Garud","shree@123");
	    session.delete(student1);
	    transaction.commit();
	}

}
