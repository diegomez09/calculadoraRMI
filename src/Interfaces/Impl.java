/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author User
 */
public class Impl extends UnicastRemoteObject implements calculadoraCliente{

    public Impl() throws Exception { super(); }

    @Override
    public Integer suma(int x, int y) throws RemoteException {
      return x + y;
    }

    @Override
    public Integer resta(int x, int y) throws RemoteException {
       return x - y; 
    }

    @Override
    public Integer multiplicacion(int x, int y) throws RemoteException {
        return x * y; 
    }

    @Override
    public Integer division(int x, int y) throws RemoteException {
       return x / y;
    }
    
    
    
}
