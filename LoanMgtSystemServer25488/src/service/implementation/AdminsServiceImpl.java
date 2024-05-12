package service.implementation;


import DAO.AdminsDao;
import Model.Admins;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import service.AdminsService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author auguste
 */
public class AdminsServiceImpl extends UnicastRemoteObject implements AdminsService {

    public AdminsServiceImpl() throws RemoteException {
    }

    AdminsDao dao = new AdminsDao();

    @Override
    public Admins saveAdmins(Admins theAdmins) throws RemoteException {
        return dao.registerAdmins(theAdmins);
    }

    @Override
    public Admins updateAdmins(Admins theAdmins) throws RemoteException {
        return dao.updateAdmins(theAdmins);
    }

    @Override
    public Admins deleteAdmins(Admins theAdmins) throws RemoteException {
        return dao.deleteAdmins(theAdmins);
    }

    @Override
    public Admins findAdminsById(Admins theAdmins) throws RemoteException {
        return dao.findAdminsById(theAdmins);
    }

    @Override
    public List<Admins> findAllAdminss() throws RemoteException {
        return dao.retrieveAllAdmins();
    }
}
