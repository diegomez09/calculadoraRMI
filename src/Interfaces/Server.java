package Interfaces;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
       // Impl obj = new Impl();

        // Binds the remote object by the name ADD 
        Naming.rebind("ADD", new Impl());

        System.out.println("Server Started");
    }

}
