/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalClienteRMI;

import java.rmi.Naming;
import model.IServicioPaciente;
import model.ServicioLocalPaciente;
import view.GUIAgregarPacientes;
import view.GUIPrincipal;

/**
 *
 * @author crist
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           
            IServicioPaciente model = (IServicioPaciente)Naming.lookup("//192.168.1.67/ServidorHola");
            ServicioLocalPaciente.setServicio(model);
            GUIPrincipal guiP = new GUIPrincipal();
            
        guiP.setVisible(true);
       }catch(Exception e)
       {
           System.out.println("Error!!" + e);
       }
        
       
    }
    
}
