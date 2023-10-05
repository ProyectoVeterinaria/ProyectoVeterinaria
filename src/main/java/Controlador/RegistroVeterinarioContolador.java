/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Veterinario;
import Vista.RegistroVeterinario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariana M
 */
public class RegistroVeterinarioContolador implements ActionListener {

    private RegistroVeterinario vista;
    private Veterinario veterinario;

    public RegistroVeterinarioContolador(RegistroVeterinario vista, Veterinario veterinario) {
        this.vista = vista;
        this.veterinario = veterinario;
        this.vista.getRegistrar().addActionListener(this);
        this.vista.getCancelar().addActionListener(this);
        this.vista.getbtnEliminar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getRegistrar())
        {
            if (validarDatos())
            {
                veterinario = new Veterinario(vista.getnoLicencia(), vista.getEspecializacion(), vista.getNombre(), vista.getEdad(), vista.getCedula());
                if (veterinario.validarRepetidos())
                {
                    veterinario.escibirRegistro();
                    
                    // Borrar datos de los campos después de ingresar--- no está funcionando
//                    vista.setnoLicencia(null);
//                    vista.setEspecializacion(null);
//                    vista.setNombre(null);
//                    vista.setEdad(null);
//                    vista.setCedula(null);
                }
            }
        }

        if (e.getSource() == vista.getCancelar())
        {
            vista.setVisible(false);
        }
        if (e.getSource() == vista.getbtnEliminar())
        {
            veterinario.eliminarRegistro();
        }

    }

    private boolean validarDatos() {
        if (vista.getNombre().isEmpty() || vista.getCedula().isEmpty() || vista.getnoLicencia().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "Validación", 2);
            return false;
        }
        return true;
    }

}
