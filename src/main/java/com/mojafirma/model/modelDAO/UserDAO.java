package com.mojafirma.model.modelDAO;

import com.mojafirma.model.User;
import com.mojafirma.utility.HibernateConnector;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Collections;
import java.util.List;

public class UserDAO {

    public Integer addUser(User user) {
        Session session = HibernateConnector.getHibernateSession();
        Transaction transaction = null;
        Integer userID = null;

        transaction = session.beginTransaction();
        userID = (Integer) session.save(user);
        transaction.commit();

        session.close();

        return userID;
    }

    public User getUser(Integer userID) {
        Session session = HibernateConnector.getHibernateSession();
        Transaction transaction = null;
        User user = session.get(User.class, userID);
        transaction.commit();

        session.close();
        return user;
    }

    public List<User> getUserByNick(String nick) {
        Session session = HibernateConnector.getHibernateSession();
        Transaction transaction = null;
        String hql = "FROM User WHERE userName = :nick";
        org.hibernate.query.Query query = session.createQuery(hql);
        query.setParameter("nick", nick);
        List result = query.getResultList();
        if (result.isEmpty() || result == null) {
            return Collections.EMPTY_LIST;
        } else {
            return result;
        }
    }
}
