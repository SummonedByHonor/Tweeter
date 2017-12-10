package com.mojafirma.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConnector {

    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    private static Session session = sessionFactory.openSession();

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public HibernateConnector() {
    }

    public static Session getHibernateSession(){
        if (session == null){
            session = (Session) new HibernateConnector();
        }
        return session;
    }
}
