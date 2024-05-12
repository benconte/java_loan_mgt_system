/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Model.Loan;
import java.rmi.RemoteException;
import java.util.List;
import java.rmi.Remote;

/**
 *
 * @author auguste
 */
public interface LoanService extends Remote {
    Loan saveLoan(Loan theLoan) throws RemoteException;

    Loan updateLoan(Loan theLoan) throws RemoteException;

    Loan deleteLoan(Loan theLoan) throws RemoteException;

    Loan findLoanById(Loan theLoan) throws RemoteException;

    List<Loan> findAllLoans() throws RemoteException;
}
