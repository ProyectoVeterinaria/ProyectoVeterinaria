/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Login;
import Modelo.Mascota;
import Modelo.Vendedor;
import Modelo.Veterinario;
import Vista.FormularioLogin;
import Vista.FormularioPrincipal;
import Vista.RegistroClientesFrame;
import Vista.RegistroMascotaFraame;
import Vista.RegistroVendedor;
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

    public FormularioPrincipalControlador(FormularioPrincipal vista, int n) {
        switch (n)
        {
            case 0 ->
            {
                this.vista = vista;
                this.vista.getRegistrarveterinario().addActionListener(this);
                this.vista.getRegistrarMascotas().addActionListener(this);
                this.vista.getRegistrocliente().addActionListener(this);
                this.vista.getCerrarsesion().addActionListener(this);
                this.vista.getIntegrantes().addActionListener(this);
                this.vista.getSalir().addActionListener(this);
                this.vista.getItmRegistroVendedor().addActionListener(this);

            }
            case 1 ->
            {
                this.vista = vista;

                this.vista.getRegistrarMascotas().addActionListener(this);
                this.vista.getRegistrocliente().addActionListener(this);
                this.vista.getCerrarsesion().addActionListener(this);
                this.vista.getIntegrantes().addActionListener(this);
                this.vista.getSalir().addActionListener(this);
                this.vista.getMnu_vendedor().setVisible(false);
                this.vista.getMnu_vetrinario().setVisible(false);

            }
            case 2 ->
            {
                this.vista = vista;
                this.vista.getCerrarsesion().addActionListener(this);
                this.vista.getIntegrantes().addActionListener(this);
                this.vista.getSalir().addActionListener(this);
                this.vista.getMnu_vendedor().setVisible(false);
                this.vista.getMnu_vetrinario().setVisible(false);
                this.vista.getMnu_mascota().setVisible(false);
                this.vista.getMnu_cliente().setVisible(false);

            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getRegistrarveterinario())
        {
            RegistroVeterinario frmveterinario = new RegistroVeterinario(vista, true); // El segundo parámetro indica que es modal

            Veterinario veterinario = new Veterinario("", "", "", "", "");

            RegistroVeterinarioContolador controlador = new RegistroVeterinarioContolador(frmveterinario, veterinario);

            frmveterinario.setVisible(true);
            frmveterinario.setUndecorated(true);
        }
        if (e.getSource() == vista.getItmRegistroVendedor())
        {
            RegistroVendedor frmvendedor = new RegistroVendedor(vista, true);

            Vendedor vendedor = new Vendedor("", "", "", "", "");

            RegistroVendedorControlador controlador = new RegistroVendedorControlador(frmvendedor, vendedor);

            frmvendedor.setVisible(true);
            frmvendedor.setUndecorated(true);
        }
        if (e.getSource() == vista.getRegistrarMascotas())
        {
            RegistroMascotaFraame frmMascota = new RegistroMascotaFraame(vista, true);

            Mascota mascota = new Mascota("", "", "", "");

            RegistroMascotaControlador controlador = new RegistroMascotaControlador(frmMascota, mascota);

            frmMascota.setVisible(true);
            frmMascota.setUndecorated(true);
        }
        if (e.getSource() == vista.getRegistrocliente())
        {
            RegistroClientesFrame frmCliente = new RegistroClientesFrame(vista, true);
            Cliente cliente = new Cliente("", "", "","", "");
             RegistroClienteControlador controlador = new RegistroClienteControlador(frmCliente, cliente);
            frmCliente.setVisible(true);
            frmCliente.setUndecorated(true);
        }
        
        if (e.getSource() == vista.getCerrarsesion())
        {
            vista.setVisible(false);
            FormularioLogin iniciosesion = new FormularioLogin();
            iniciosesion.setVisible(true);
            Login usuario = new Login();
            ControladorLogin controlador = new ControladorLogin(iniciosesion, usuario);
        }
        if (e.getSource() == vista.getSalir())
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
