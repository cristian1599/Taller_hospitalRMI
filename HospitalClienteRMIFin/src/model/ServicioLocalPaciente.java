/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author crist
 */
public class ServicioLocalPaciente {
    private static IServicioPaciente servicio;

    private ServicioLocalPaciente() {
        
    }
    
    public static void setServicio(IServicioPaciente pServicio)
    {
        if(servicio == null)
        {
          servicio = pServicio;
        }
        
    }
    
    public static IServicioPaciente getServicio()
    {
        return servicio;
    }
            
          
    
}
