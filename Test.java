import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        // Insert data
        Employee e1 = new Employee();
        e1.setEmpcode(101);
        e1.setEmpname("Jenny");
        e1.setEmpage(25);
        e1.setEsalary(10000);

        Employee e2 = new Employee();
        e2.setEmpcode(102);
        e2.setEmpname("Jacky");
        e2.setEmpage(30);
        e2.setEsalary(20000);

        Employee e3 = new Employee();
        e3.setEmpcode(103);
        e3.setEmpname("Joe");
        e3.setEmpage(20);
        e3.setEsalary(40000);

        Employee e4 = new Employee();
        e4.setEmpcode(104);
        e4.setEmpname("John");
        e4.setEmpage(40);
        e4.setEsalary(80000);

        Employee e5 = new Employee();
        e5.setEmpcode(105);
        e5.setEmpname("Shameer");
        e5.setEmpage(25);
        e5.setEsalary(90000);

        // Load Hibernate configuration
        Configuration configuration = new Configuration().configure().addAnnotatedClasses(Employee.class);
        SessionFactory factory = configuration.buildSessionFactory();

        // Create session
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Save all employees
        session.persist(e1);
        session.persist(e2);
        session.persist(e3);
        session.persist(e4);
        session.persist(e5);

        // Commit transaction
        transaction.commit();
        session.close();
        factory.close();
        
    }
}


