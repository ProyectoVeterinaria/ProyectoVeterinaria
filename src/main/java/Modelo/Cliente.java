/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Mariana M
 */
public class Cliente extends Persona{
    private String numeroCliente;
    private ArrayList<Mascota> mascotas;
    private String direccion;
    private String telefono;
    private String email;

    public Cliente(String numeroCliente, ArrayList<Mascota> mascotas, String direccion, String telefono, String email, String nombre, String edad, String identificacion) {
        super(nombre, edad, identificacion, "Cliente");
        this.numeroCliente = numeroCliente;
        this.mascotas = mascotas;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
    
}
