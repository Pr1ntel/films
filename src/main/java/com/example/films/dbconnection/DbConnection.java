package com.example.films.dbconnection;


import com.example.films.model.FilmsItem;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class DbConnection {
    private static DbConnection instance = null;

    private SessionFactory sessionFactory;

    private DbConnection(){
        try {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(FilmsItem.class);
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(builder.build());

        } catch (Exception e) {
            System.out.println("HibernateSession init error:" + e);
        }
    }
    public static DbConnection getInstance() {
        if (instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
