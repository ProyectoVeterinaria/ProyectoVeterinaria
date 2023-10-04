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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == vista.getRegistrar())
        {
            if (validarDatos())
            {
                veterinario = new Veterinario(vista.getnoLicencia(), vista.getEspecializacion(), vista.getNombre(), " ", vista.getCedula());
                if (veterinario.validarRepetidos())
                {
                    veterinario.escibirRegistro();
                    vista.setVisible(false);
                }
            }
        } else
        {
            if (e.getSource() == vista.getCancelar())
            {
                vista.setVisible(false);
            }
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
