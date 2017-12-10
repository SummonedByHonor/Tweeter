package com.mojafirma.model.modelDAO;

import com.mojafirma.model.User;
import com.mojafirma.utility.HibernateConnector;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDAO {

public Integer addUser (User user){
    Session session = HibernateConnector.getHibernateSession();
    Transaction transaction = null;
    Integer userID = null;

    transaction = session.beginTransaction();
    userID = (Integer) session.save(user);
    transaction.commit();

    session.close();

    return userID;
}

public User getUser (Integer userID){
    Session session = HibernateConnector.getHibernateSession();
    Transaction transaction = null;
    User user = session.get(User.class, userID);
    transaction.commit();

    session.close();
    return user;
}

public User getUserByNickAndPassword(String nick, String password){

}
}
