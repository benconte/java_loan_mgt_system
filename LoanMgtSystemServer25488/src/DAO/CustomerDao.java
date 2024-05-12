package DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Model.Customer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author auguste
 */
public class CustomerDao {

    public Customer registerCustomer(Customer theCustomer) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(theCustomer);
            tr.commit();
            ss.close();
            return theCustomer;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Customer updateCustomer(Customer theCustomer) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(theCustomer);
            tr.commit();
            ss.close();
            return theCustomer;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Customer deleteCustomer(Customer theCustomer) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(theCustomer);
            ss.close();
            return theCustomer;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Customer findCustomerById(Customer computerObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Customer theCustomer = (Customer) ss.get(Customer.class, computerObj.getCustomer_id());
            ss.close();
            return theCustomer;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Customer> retrieveAllCustomer() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Customer> customers = ss.createQuery("select cust from Customer cust").list();
            ss.close();
            return customers;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
