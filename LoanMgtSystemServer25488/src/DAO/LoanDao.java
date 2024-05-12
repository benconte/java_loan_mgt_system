/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Loan;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author auguste
 */
public class LoanDao {
    public Loan registerLoan(Loan theLoan) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(theLoan);
            tr.commit();
            ss.close();
            return theLoan;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Loan updateLoan(Loan theLoan) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(theLoan);
            tr.commit();
            ss.close();
            return theLoan;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Loan deleteLoan(Loan theLoan) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(theLoan);
            ss.close();
            return theLoan;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Loan findLoanById(Loan computerObj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Loan theLoan = (Loan) ss.get(Loan.class, computerObj.getId());
            ss.close();
            return theLoan;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Loan> retrieveAllLoan() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Loan> loans = ss.createQuery("select loan from Loan loan").list();
            ss.close();
            return loans;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
