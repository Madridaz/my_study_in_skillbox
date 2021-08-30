import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        List<String> list = new ArrayList<>();
        for (int i = 1; i < 47; i++) {
            Session session = sessionFactory.openSession();
            Course course = session.get(Course.class, i);
            list.add("Название курса: " + course.getName() + ", количество студентов: " + course.getStudentsCount());
           // System.out.println("Название курса: " + course.getName() + ", количество студентов: " + course.getStudentsCount());

        }
        sessionFactory.close();


    }
}
