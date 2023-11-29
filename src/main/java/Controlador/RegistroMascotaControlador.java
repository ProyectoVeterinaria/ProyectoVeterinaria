/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Mascota;
import Modelo.Vendedor;
import Vista.RegistroMascotaFraame;
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
public class RegistroMascotaControlador implements ActionListener {

    private RegistroMascotaFraame vista;
    private Mascota mascota;
    private String nombreBuscar = "";
    private MouseListener tablaMostrarMouseListener;

    public RegistroMascotaControlador(RegistroMascotaFraame vista, Mascota mascota) {
        this.vista = vista;
        this.mascota = mascota;
        this.vista.getRegistrar().addActionListener(this);
        this.vista.getItmModificar().addActionListener(this);
        this.vista.getItmSalir().addActionListener(this);
        this.vista.getBtnModificar().addActionListener(this);
        this.vista.getPnlModificar().setVisible(false);
        this.vista.getItmRegistrar().addActionListener(this);
        this.vista.getItmMostrar().addActionListener(this);
        this.vista.getItmNomostrar().addActionListener(this);
        this.vista.getItmEliminar().addActionListener(this);
        this.vista.getBtnLimpiar().addActionListener(this);
        vista.getPnlMostrar().setVisible(false);
        cargarTabla();
        //habilitarMouseListener(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getItmSalir())
        {
            vista.setVisible(false);
        }
        if (e.getSource() == vista.getRegistrar())
        {
            habilitarMouseListener(false);

            if (validarDatos())
            {
                mascota = new Mascota(vista.getNombre(), vista.getRaza(), vista.getEdad(), vista.getNombreDueno());
                if (mascota.validarDatosMascota())
                {
                    if (mascota.validarRepetidos())
                    {
                        mascota.escibirRegistro();
                        cargarTabla();
                        limpiarCampos();
                        vista.getPnlMostrar().setVisible(true);

                    }
                }
            }
        }

        if (e.getSource() == vista.getItmRegistrar())
        {
            limpiarCampos();
            vista.getPnlFormulario().setVisible(true);
            vista.getPnlRegistrar().setVisible(true);
            habilitarMouseListener(false);
            
        }
        if (e.getSource() == vista.getItmModificar())
        {
            vista.getPnlFormulario().setVisible(true);
            cargarTabla();
            vista.getPnlMostrar().setVisible(true);
            vista.getPnlRegistrar().setVisible(false);
            String dueno = JOptionPane.showInputDialog(null, "Escribe el nombre del dueño de la mascota a la que deseas cambiar información", "Modificar", 2);
            nombreBuscar = dueno;

            filtrarRegistros();
            habilitarMouseListener(true);

        }

        if (e.getSource() == vista.getBtnModificar())
        {

            vista.getPnlRegistrar().setVisible(false);

            if (validarDatos())
            {

                mascota = new Mascota(vista.getNombre(), vista.getRaza(), vista.getEdad(), vista.getNombreDueno());
                if (mascota.validarDatosMascota())
                {
                    mascota.modificarRegistros(vista.getNombreDueno());
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
            mascota.eliminarRegistro();
            cargarTabla();
            vista.getPnlMostrar().setVisible(true);
        }
        
        if (e.getSource() == vista.getBtnLimpiar())
        {
            limpiarCampos();
        }

    }

    private boolean validarDatos() {
        if (vista.getNombre().isEmpty() || vista.getNombreDueno().isEmpty() || vista.getEdad().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "Validación", 2);
            return false;
        }
        return true;
    }

    public void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) vista.getTablaMostrar().getModel();

        modelo.setRowCount(0);

        ArrayList<String[]> registros = mascota.leerRegistros();
        for (String[] registro : registros)
        {
            modelo.addRow(registro);
        }
        vista.getTablaMostrar().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < vista.getTablaMostrar().getColumnCount(); i++)
        {
            int ancho = 115; // Ancho inicial mínimo
            for (int j = 0; j < vista.getTablaMostrar().getRowCount(); j++)
            {
                TableCellRenderer renderizador = vista.getTablaMostrar().getCellRenderer(j, i);
                Component componente = vista.getTablaMostrar().prepareRenderer(renderizador, j, i);
                ancho = Math.max(componente.getPreferredSize().width + 1, ancho);
            }
            vista.getTablaMostrar().getColumnModel().getColumn(i).setPreferredWidth(ancho);
        }
    }

    private void tablaMostrarModificar(java.awt.event.MouseEvent evt) {
        int filaSeleccionada = vista.getTablaMostrar().getSelectedRow();

        if (filaSeleccionada >= 0)
        {
            String nombre = vista.getTablaMostrar().getValueAt(filaSeleccionada, 0).toString();
            String edad = vista.getTablaMostrar().getValueAt(filaSeleccionada, 1).toString();
            String raza = vista.getTablaMostrar().getValueAt(filaSeleccionada, 2).toString();
            String dueno = vista.getTablaMostrar().getValueAt(filaSeleccionada, 3).toString();

            vista.setNombre(nombre);
            vista.setEdad(edad);
            vista.setRaza(raza);
            vista.setNombreDueno(dueno);

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

        ArrayList<String[]> registros = mascota.leerRegistros();
        for (String[] registro : registros)
        {
            // Obtener el nombre a buscar en minúsculas para hacer la comparación
            String nombreRegistro = registro[3].toLowerCase();
            nombreBuscar = nombreBuscar.toLowerCase();

            if (nombreRegistro.startsWith(nombreBuscar))
            {
                modelo.addRow(registro);
            }
        }
    }

    private void limpiarCampos() {
        vista.setNombre("");
        vista.setEdad("");
        vista.setNombreDueno("");
        vista.setRaza("");
    }

}
