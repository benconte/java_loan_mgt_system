/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import service.implementation.AdminsServiceImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import service.implementation.CustomerServiceImpl;
import service.implementation.LoanServiceImpl;

/**
 *
 * @author auguste
 */
public class Server {
        public static void main(String[] args) {
        try{
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry theRegistry = LocateRegistry.createRegistry(6000);
            theRegistry.rebind("customer", new CustomerServiceImpl());
            theRegistry.rebind("loan", new LoanServiceImpl());
            theRegistry.rebind("admins", new AdminsServiceImpl());
            System.out.println("Server is running on port 6000");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
