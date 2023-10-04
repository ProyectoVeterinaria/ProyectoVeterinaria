/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Veterinario;
import Vista.FormularioPrincipal;
import Vista.RegistroVeterinario;
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

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getRegistrarveterinario())
        {
            RegistroVeterinario frmveterinario = new RegistroVeterinario(vista, true); // El segundo parámetro indica que es modal
            
            Veterinario veterinario = new Veterinario("", "", "", "","");
            RegistroVeterinarioContolador controlador = new RegistroVeterinarioContolador(frmveterinario, veterinario);
            frmveterinario.setVisible(true);
        }
        if (e.getSource() == vista.getCerrarsesion())
        {
            System.exit(0);//cierra el proyecto
        }

    }

}
