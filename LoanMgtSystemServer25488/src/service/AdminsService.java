/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Model.Admins;
import java.rmi.RemoteException;
import java.util.List;
import java.rmi.Remote;

/**
 *
 * @author auguste
 */
public interface AdminsService extends Remote {
    Admins saveAdmins(Admins theAdmins) throws RemoteException;

    Admins updateAdmins(Admins theAdmins) throws RemoteException;

    Admins deleteAdmins(Admins theAdmins) throws RemoteException;

    Admins findAdminsById(Admins theAdmins) throws RemoteException;

    List<Admins> findAllAdminss() throws RemoteException;
}
