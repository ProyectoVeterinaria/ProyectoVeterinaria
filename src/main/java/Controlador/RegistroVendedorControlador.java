/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Vendedor;
import Modelo.Veterinario;
import Vista.FormularioPrincipal;
import Vista.RegistroVendedor;
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
public class RegistroVendedorControlador implements ActionListener {

    private RegistroVendedor vista;
    private Vendedor vendedor;
    private String digitosCedula = "";
    private MouseListener tablaMostrarMouseListener;

    public RegistroVendedorControlador(RegistroVendedor vista, Vendedor vendedor) {
        this.vista = vista;
        this.vendedor = vendedor;
        this.vista.getRegistrar().addActionListener(this);
        this.vista.getBtnLimpiar().addActionListener(this);
        this.vista.getItmSalir().addActionListener(this);
        this.vista.getItmEliminar().addActionListener(this);
        this.vista.getItmMostrar().addActionListener(this);
        this.vista.getItmNomostrar().addActionListener(this);
        this.vista.getBtnModificar().addActionListener(this);
        this.vista.getItmRegistrar().addActionListener(this);
        this.vista.getItmModificar().addActionListener(this);
        this.vista.getPnlModificar().setVisible(false);
        this.vista.getPnlRegistrar().setVisible(true);
        
        

        //cargarTabla();
        //habilitarMouseListener(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.getRegistrar())
        {
            habilitarMouseListener(false);
       
            if (validarDatos())
            {
                vendedor = new Vendedor(vista.getNovendedor(), vista.getEmpresa(), vista.getNombre(), vista.getEdad(), vista.getCedula());
                if (vendedor.validarDatosVendedor())
                {
                    if (vendedor.validarRepetidos())
                    {
                        vendedor.escibirRegistro();
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
//             vista.getPnlRegistrar().setVisible(false);
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

                vendedor = new Vendedor(vista.getNovendedor(), vista.getEmpresa(), vista.getNombre(), vista.getEdad(), vista.getCedula());
                if (vendedor.validarDatosVendedor())
                {
                    vendedor.modificarRegistros(vista.getCedula());
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
        if (e.getSource() == vista.getItmEliminar())
        {
            vista.getPnlFormulario().setVisible(false);
            vista.getPnlRegistrar().setVisible(false);
            vendedor.eliminarRegistro();
            cargarTabla();
            vista.getPnlMostrar().setVisible(true);
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

        if (e.getSource() == vista.getItmSalir())
        {
            vista.setVisible(false);
        }
        if (e.getSource() == vista.getItmNomostrar())
        {
            vista.getPnlMostrar().setVisible(false);
            limpiarCampos();
        }

    }

    public void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getTablaMostrar().getModel();

        modelo.setRowCount(0);

        ArrayList<String[]> registros = vendedor.leerRegistros();
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

    private void limpiarCampos() {
        vista.setNombre("");
        vista.setEdad("");
        vista.setCedula("");
        vista.setEmpresa("");
        vista.setNoVendedor("");
    }

    private void tablaMostrarModificar(java.awt.event.MouseEvent evt) {
        int filaSeleccionada = vista.getTablaMostrar().getSelectedRow();

        if (filaSeleccionada >= 0)
        {
            String nombre = vista.getTablaMostrar().getValueAt(filaSeleccionada, 0).toString();
            String edad = vista.getTablaMostrar().getValueAt(filaSeleccionada, 1).toString();
            String cedula = vista.getTablaMostrar().getValueAt(filaSeleccionada, 2).toString();
            String noLicencia = vista.getTablaMostrar().getValueAt(filaSeleccionada, 3).toString();
            String especializacion = vista.getTablaMostrar().getValueAt(filaSeleccionada, 4).toString();

            vista.setNombre(nombre);
            vista.setEdad(edad);
            vista.setCedula(cedula);
            vista.setNoVendedor(noLicencia);
            vista.setEmpresa(especializacion);

            vista.getPnlModificar().setVisible(true);
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

    private void filtrarRegistros() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getTablaMostrar().getModel();
        modelo.setRowCount(0);

        ArrayList<String[]> registros = vendedor.leerRegistros();
        for (String[] registro : registros)
        {
            // Verifica si la cédula comienza con los dígitos ingresados por el usuario
            if (registro[2].startsWith(digitosCedula))
            {
                modelo.addRow(registro);
            }

        }
    }

    private boolean validarDatos() {
        if (vista.getNombre().isEmpty() || vista.getCedula().isEmpty() || vista.getEmpresa().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "Validación", 2);
            return false;
        }
        return true;
    }
}
