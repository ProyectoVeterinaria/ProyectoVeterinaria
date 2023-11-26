/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Login;
import Modelo.Veterinario;
import Vista.FormularioLogin;
import Vista.FormularioPrincipal;
import Vista.RegistroVeterinario;
import Vista.VistaAcercade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Mariana M
 */
public class FormularioPrincipalControlador implements ActionListener {

    private FormularioPrincipal vista;

    public FormularioPrincipalControlador(FormularioPrincipal vista) {
        this.vista = vista;
        this.vista.getRegistrarveterinario().addActionListener(this);
        this.vista.getRegistrocliente().addActionListener(this);
        this.vista.getCerrarsesion().addActionListener(this);
        this.vista.getIntegrantes().addActionListener(this);
        this.vista.getSalir().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getRegistrarveterinario())
        {
            RegistroVeterinario frmveterinario = new RegistroVeterinario(vista, true); // El segundo parámetro indica que es modal
            
            Veterinario veterinario = new Veterinario("", "", "", "","");
            RegistroVeterinarioContolador controlador = new RegistroVeterinarioContolador(frmveterinario, veterinario);
            
            frmveterinario.setVisible(true);
            frmveterinario.setUndecorated(true);
        }
        if (e.getSource() == vista.getCerrarsesion())
        {
           vista.setVisible(false);
           FormularioLogin iniciosesion = new FormularioLogin();
           iniciosesion.setVisible(true);
           Login usuario= new Login();
           ControladorLogin controlador= new ControladorLogin(iniciosesion, usuario);
        }
        if(e.getSource() == vista.getSalir())
        {
            System.exit(0);
        }
        if (e.getSource() == vista.getIntegrantes())
        {
            VistaAcercade integrantes = new VistaAcercade(vista, true);
            integrantes.setVisible(true);
        }

    }

}
