/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Vista.RegistroClientesFrame;
import Vista.RegistroMascotaFraame;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Mariana M
 */
public class RegistroClienteControlador implements ActionListener {

    private RegistroClientesFrame vista;
    private Cliente cliente;
    private String digitosCedula = "";
    private MouseListener tablaMostrarMouseListener;

    
    public RegistroClienteControlador(RegistroClientesFrame vista, Cliente cliente) {
        this.vista = vista;
        this.cliente = cliente;
        this.vista.getRegistrar().addActionListener(this);
        this.vista.getBtnLimpiar().addActionListener(this);
        this.vista.getItmSalir().addActionListener(this);
        this.vista.getItmEliminar().addActionListener(this);
        this.vista.getItmMostrar().addActionListener(this);
        this.vista.getItmNomostrar().addActionListener(this);
        this.vista.getBtnModificar().addActionListener(this);
        this.vista.getItmRegistrar().addActionListener(this);
        this.vista.getItmModificar().addActionListener(this);
        vista.getPnlMostrar().setVisible(false);
        this.vista.getPnlModificar().setVisible(false);

        cargarTabla();
        habilitarMouseListener(false);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getItmSalir())
        {
            vista.setVisible(false);
        }
        if (e.getSource() == vista.getRegistrar())
        {
            if (validarDatos())
            {
                cliente = new Cliente(vista.getTelefono(),vista.getCorreo(), vista.getNombre(), vista.getedad(), vista.getCedula());
                if (cliente.validarRepetidos())
                {
                    if (cliente.validarDatosCliente())
                    {
                        cliente.agregarCliente();
                        cargarTabla();
                        limpiarCampos();
                        vista.getPnlMostrar().setVisible(true);
                    }

                }
            }
        }
        if (e.getSource() == vista.getItmModificar())
        {
            vista.getPnlFormulario().setVisible(true);
            cargarTabla();
            vista.getPnlMostrar().setVisible(true);
            vista.getPnlRegistrar().setVisible(false);
            String cedula = JOptionPane.showInputDialog(null, "Escribe la cedula del vendedor que deseas cambiar información", "Modificar", 2);
            digitosCedula = cedula;

            filtrarRegistros();
            habilitarMouseListener(true);

        }
        if (e.getSource() == vista.getBtnModificar())
        {
            
            
            vista.getPnlRegistrar().setVisible(false);
            if (validarDatos())
            {

                cliente = new Cliente(vista.getTelefono(),vista.getCorreo(), vista.getNombre(), vista.getedad(), vista.getCedula());
                if (cliente.validarDatosCliente())
                {
                    cliente.modificarRegistros(vista.getCedula());
                    limpiarCampos();
                    cargarTabla();
                }

            }
        }
        if (e.getSource() == vista.getItmMostrar())
        {

            vista.getPnlFormulario().setVisible(false);
            vista.getPnlRegistrar().setVisible(false);
            vista.getPnlMostrar().setVisible(true);
            cargarTabla();
            habilitarMouseListener(false);
        }
        if (e.getSource() == vista.getItmNomostrar())
        {
            vista.getPnlFormulario().setVisible(true);
            vista.getPnlMostrar().setVisible(false);
            vista.getPnlModificar().setVisible(false);
            limpiarCampos();
        
        }  
        
        if (e.getSource() == vista.getItmRegistrar())
        {
            vista.getPnlFormulario().setVisible(true);
            limpiarCampos();
            vista.getPnlFormulario().setVisible(true);
            vista.getPnlRegistrar().setVisible(true);
            habilitarMouseListener(false);

        }

        if (e.getSource() == vista.getBtnLimpiar())
        {
            limpiarCampos();
        }
         if (e.getSource() == vista.getItmEliminar())
        {
            vista.getPnlFormulario().setVisible(false);
            vista.getPnlRegistrar().setVisible(false);
            cliente.eliminarRegistro();
            cargarTabla();
            vista.getPnlMostrar().setVisible(true);
        }

    }
      private void filtrarRegistros() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getTablaMostrar().getModel();
        modelo.setRowCount(0);

        ArrayList<String[]> registros = cliente.leerRegistros();
        for (String[] registro : registros)
        {
            // Verifica si la cédula comienza con los dígitos ingresados por el usuario
            if (registro[1].startsWith(digitosCedula))
            {
                modelo.addRow(registro);
            }

        }
    }

    private void tablaMostrarModificar(java.awt.event.MouseEvent evt) {
        int filaSeleccionada = vista.getTablaMostrar().getSelectedRow();

        if (filaSeleccionada >= 0)
        {
            String nombre = vista.getTablaMostrar().getValueAt(filaSeleccionada, 0).toString();
            String cedula = vista.getTablaMostrar().getValueAt(filaSeleccionada, 1).toString();
            String edad = vista.getTablaMostrar().getValueAt(filaSeleccionada, 2).toString();
            String telefono = vista.getTablaMostrar().getValueAt(filaSeleccionada, 3).toString();
            String correo = vista.getTablaMostrar().getValueAt(filaSeleccionada, 4).toString();
            
            vista.setNombre(nombre);
            vista.setEdad(edad);
            vista.setCedula(cedula);
            vista.setTelefono(telefono);
            vista.setCorreo(correo);

            vista.getPnlModificar().setVisible(true);
        }
    }
    
    public void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getTablaMostrar().getModel();

        modelo.setRowCount(0);

        ArrayList<String[]> registros = cliente.leerRegistros();
        for (String[] registro : registros)
        {
            modelo.addRow(registro);
        }
        vista.getTablaMostrar().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < vista.getTablaMostrar().getColumnCount(); i++)
        {
            int ancho = 100; // Ancho inicial mínimo
            for (int j = 0; j < vista.getTablaMostrar().getRowCount(); j++)
            {
                TableCellRenderer renderizador = vista.getTablaMostrar().getCellRenderer(j, i);
                Component componente = vista.getTablaMostrar().prepareRenderer(renderizador, j, i);
                ancho = Math.max(componente.getPreferredSize().width + 1, ancho);
            }
            vista.getTablaMostrar().getColumnModel().getColumn(i).setPreferredWidth(ancho);
        }
    }


    private void habilitarMouseListener(boolean habilitar) {
        if (habilitar)
        {
            // Agregar el MouseListener y almacenarlo para poder removerlo después
            tablaMostrarMouseListener = new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tablaMostrarModificar(evt);
                }
            };
            vista.getTablaMostrar().addMouseListener(tablaMostrarMouseListener);
        } else
        {
            // Remover el MouseListener específico
            vista.getTablaMostrar().removeMouseListener(tablaMostrarMouseListener);
            vista.getPnlModificar().setVisible(false);
            cargarTabla();
        }
    }
   

    private boolean validarDatos() {
        if (vista.getNombre().isEmpty() || vista.getCedula().isEmpty() || vista.getedad().isEmpty()||vista.getCorreo().isEmpty()||vista.getTelefono().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "Validación", 2);
            return false;
        }
        return true;
    }
      private void limpiarCampos() {
        vista.setNombre("");
        vista.setEdad("");
        vista.setCedula("");
        vista.setTelefono("");
        vista.setCorreo("");
    }
}
