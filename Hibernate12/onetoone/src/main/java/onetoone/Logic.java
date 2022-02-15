package onetoone;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class Logic {


		public static void main(String[] args) {
		
			Session session = HibernateUtil.getSessionFactory().openSession();

		    Transaction t = session.beginTransaction();
		    
		    PersonDetail varundetails = new PersonDetail();
		    varundetails.setZipCode("124");
		    varundetails.setIncome(23000);
		    varundetails.setJob("tester");
		    
		    Person varun = new Person();
		    varun.setPersonName("ram");
		    
		    
		    varun.setPersondetail(varundetails);
		    session.save(varundetails);
		    session.save(varun);
		    t.commit();  
			session.close();

		

	}


}
