package service.implementation;

import DAO.CustomerDao;
import Model.Customer;
import java.rmi.RemoteException;
import java.util.List;
import java.rmi.server.UnicastRemoteObject;
import service.CustomerService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author auguste
 */
public class CustomerServiceImpl extends UnicastRemoteObject implements CustomerService {
    public CustomerServiceImpl() throws RemoteException {
    }
    
    CustomerDao dao = new CustomerDao();

    @Override
    public Customer saveCustomer(Customer theCustomer) throws RemoteException {
        return dao.registerCustomer(theCustomer);
    }

    @Override
    public Customer updateCustomer(Customer theCustomer) throws RemoteException {
        return dao.updateCustomer(theCustomer);
    }

    @Override
    public Customer deleteCustomer(Customer theCustomer) throws RemoteException {
        return dao.deleteCustomer(theCustomer);
    }

    @Override
    public Customer findCustomerById(Customer theCustomer) throws RemoteException {
        return dao.findCustomerById(theCustomer);
    }

    @Override
    public List<Customer> findAllCustomers() throws RemoteException {
        return dao.retrieveAllCustomer();
    }
}
