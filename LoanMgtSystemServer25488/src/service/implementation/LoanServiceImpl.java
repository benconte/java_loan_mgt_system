/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import DAO.LoanDao;
import Model.Loan;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import service.LoanService;

/**
 *
 * @author auguste
 */
public class LoanServiceImpl extends UnicastRemoteObject implements LoanService {
    public LoanServiceImpl() throws RemoteException {
    }
    
    LoanDao dao = new LoanDao();

    @Override
    public Loan saveLoan(Loan theLoan) throws RemoteException {
        return dao.registerLoan(theLoan);
    }

    @Override
    public Loan updateLoan(Loan theLoan) throws RemoteException {
        return dao.updateLoan(theLoan);
    }

    @Override
    public Loan deleteLoan(Loan theLoan) throws RemoteException {
        return dao.deleteLoan(theLoan);
    }

    @Override
    public Loan findLoanById(Loan theLoan) throws RemoteException {
        return dao.findLoanById(theLoan);
    }

    @Override
    public List<Loan> findAllLoans() throws RemoteException {
        return dao.retrieveAllLoan();
    }
}
