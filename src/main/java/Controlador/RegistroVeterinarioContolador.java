/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Veterinario;
import Vista.RegistroVeterinario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Mariana M
 */
public class RegistroVeterinarioContolador implements ActionListener {
    private RegistroVeterinario vista;
    private Veterinario modelo;

    public RegistroVeterinarioContolador(RegistroVeterinario vista, Veterinario modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.getCancelar().addActionListener(this);
        this.vista.getRegistar().addActionListener(this);
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.getRegistar())
        {
            if(validarDatos())
            {
                
                //modelo = new Veterinario(noLicencia, especializacion, nombre, edad, identificacion);
                
            }
        }       
    }
    
    private boolean validarDatos()
    {
      return true;  
    }
    
}
