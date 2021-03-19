package mypack;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Student s=new Student();
        s.setId(101);
        s.setName("Diwakar");
        s.setCourse("JAVA");
        s.setFees(1200);
    	
        Configuration cnf=new Configuration();
        cnf.configure("mypack/hibernate.cfg.xml");
        SessionFactory fact=cnf.buildSessionFactory();
        
        Session ses=fact.openSession();
        Transaction t=ses.beginTransaction();
        ses.save(s);
        t.commit();
        ses.close();
        
        
        
    }
}
