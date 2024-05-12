/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import Model.Customer;
/**
 *
 * @author auguste
 */
public interface CustomerService extends Remote {
    Customer saveCustomer(Customer theCustomer) throws RemoteException;

    Customer updateCustomer(Customer theCustomer) throws RemoteException;

    Customer deleteCustomer(Customer theCustomer) throws RemoteException;

    Customer findCustomerById(Customer theCustomer) throws RemoteException;

    List<Customer> findAllCustomers() throws RemoteException;
}
