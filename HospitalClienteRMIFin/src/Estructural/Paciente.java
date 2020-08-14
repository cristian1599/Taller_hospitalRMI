/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructural;

import java.io.Serializable;

/**
 *
 * @author crist
 */
public class Paciente implements Serializable {
    
    private String nombre,documento,correo,telefono, sexo;

    public Paciente() {
        this.nombre = "NN";
        this.documento = "NN";
        this.correo = "NN";
        this.telefono = "NN";
        this.sexo = "NN";
    }

    public Paciente(String nombre, String documento, String correo, String telefono, String sexo) {
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
        this.telefono = telefono;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", documento=" + documento + ", correo=" + correo + ", telefono=" + telefono + ", sexo=" + sexo + '}';
    }
}
