/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Estructural.Paciente;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class ServicioPaciente extends UnicastRemoteObject implements IServicioPaciente {
    
    ArrayList <Paciente> listaPacientes;

    public ServicioPaciente() throws RemoteException {
         listaPacientes = new ArrayList<>();
    }

    @Override
    public void agregarPaciente(Paciente paciente) throws RemoteException {
       listaPacientes.add(paciente);
    }

    @Override
    public Paciente obtener(int posicion) throws RemoteException {
         return listaPacientes.get(posicion);
    }

    @Override
    public int tamaño() throws RemoteException {
         return listaPacientes.size();
    }

    @Override
    public void EliminarPaciente(String documento) throws RemoteException {
         for(int i = 0; i < listaPacientes.size(); i++)
      {
          if(listaPacientes.get(i).getDocumento().equals(documento))
          {
              listaPacientes.remove(i);
          }
      }
    }

    @Override
    public void modificarDatos(String documento, String correo) throws RemoteException {
         for(int i =0; i < listaPacientes.size(); i++)
          
      {
          if(listaPacientes.get(i).getDocumento().equals(documento))
          {
              listaPacientes.get(i).setCorreo(correo);
            
          }
          
      }
    }

    @Override
    public boolean buscarPaciente(String docuumento, int contador) throws RemoteException {
        boolean encontrado = false;
 
 while (encontrado == false && contador < listaPacientes.size())
 {
     if(listaPacientes.get(contador).getDocumento().equals(docuumento))
     {
        
         encontrado = true;
         
     }else{
         encontrado = false;
         contador ++;
     }
 }
 return encontrado;

     }
    
    
        
    
}
