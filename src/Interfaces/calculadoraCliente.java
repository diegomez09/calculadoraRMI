/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.rmi.RemoteException;

/**
 *
 * @author User
 */
public interface calculadoraCliente {
    public Integer suma(int x, int y) throws RemoteException;
    
    public Integer resta(int x, int y) throws RemoteException;
    
    public Integer multiplicacion(int x, int y) throws RemoteException;
    
    public Integer division(int x, int y) throws RemoteException;
    
}
