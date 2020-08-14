/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Estructural.Paciente;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author crist
 */
public interface IServicioPaciente extends Remote{
    
    public  void agregarPaciente (Paciente paciente) throws RemoteException;
    
    public Paciente obtener (int posicion) throws RemoteException;
    
    public int tamaño() throws RemoteException;
     
    public void EliminarPaciente (String documento) throws RemoteException;
    
    public void modificarDatos(String documento, String correo) throws RemoteException;
    
    public boolean buscarPaciente(String docuumento,int contador) throws RemoteException;
    
      
      
}
