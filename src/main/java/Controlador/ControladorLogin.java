/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Login;
import Modelo.Veterinario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import Vista.FormularioLogin;
import Vista.FormularioPrincipal;
import javax.swing.JOptionPane;

public class ControladorLogin implements ActionListener {

    private FormularioLogin vista;
    private Login modelo;

    public ControladorLogin(FormularioLogin vista, Login modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.getBtningresar().addActionListener(this);
        this.vista.getBtnsalir().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtningresar())
        {
            // Verificamos que se llenen todos los campos
            if (validarDatos())
            {
                modelo = new Login(vista.getNombreUsuario(), vista.getContraseña(), vista.getTipousuario());
                if (modelo.validarIngreso())
                {
                     JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso","Validacion",3);
                     vista.setVisible(false);
                     FormularioPrincipal principal=new FormularioPrincipal();   
                     FormularioPrincipalControlador formprincipal= new FormularioPrincipalControlador(principal);
                     principal.setVisible(true);
                     
                }else
                {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión fallido. Verifica tus credenciales.","Vlidacion",0);
                }

            }
            

        }else
            if (e.getSource() == vista.getBtnsalir())
            {
                System.exit(0);//cierra el proyecto
            } 

    }

    private boolean validarDatos() {

        if (vista.getNombreUsuario().isEmpty() || vista.getContraseña().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "Validacion", 2);
            return false;
        }

        return true;
    }

}
