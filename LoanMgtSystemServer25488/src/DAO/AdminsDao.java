/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Admins;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author auguste
 */
public class AdminsDao {
    public Admins registerAdmins(Admins theAdmins) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(theAdmins);
            tr.commit();
            ss.close();
            return theAdmins;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Admins updateAdmins(Admins theAdmins) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(theAdmins);
            tr.commit();
            ss.close();
            return theAdmins;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Admins deleteAdmins(Admins theAdmins) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(theAdmins);
            ss.close();
            return theAdmins;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Admins findAdminsById(Admins computerObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Admins theAdmins = (Admins) ss.get(Admins.class, computerObj.getId());
            ss.close();
            return theAdmins;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Admins> retrieveAllAdmins() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Admins> admins = ss.createQuery("select adm from Admins adm").list();
            ss.close();
            return admins;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
