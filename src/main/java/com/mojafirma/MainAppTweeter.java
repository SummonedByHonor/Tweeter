package com.mojafirma;

import com.mojafirma.utility.HibernateConnector;
import org.hibernate.Session;

public class MainAppTweeter {

    public static void main(String[] args) {
        Session session = HibernateConnector.getHibernateSession();

        session.close();
    }
}
