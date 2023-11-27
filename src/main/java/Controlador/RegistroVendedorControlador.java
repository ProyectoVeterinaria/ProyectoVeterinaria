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
        this.vista.getRegistrar().addActionListener(this);
        this.vista.getBtnLimpiar().addActionListener(this);
        this.vista.getItmSalir().addActionListener(this);
        this.vista.getItmEliminar().addActionListener(this);
        this.vista.getItmMostrar().addActionListener(this);
        this.vista.getItmNomostrar().addActionListener(this);
        this.vista.getBtnModificar().addActionListener(this);
        this.vista.getItmMostrar().addActionListener(this);

        //cargarTabla();
        //habilitarMouseListener(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getRegistrar())
        {
            if (validarDatos())
            {
                vendedor = new Vendedor(vista.getNovendedor(), vista.getEmpresa(), vista.getNombre(), vista.getEdad(), vista.getCedula());
                if (vendedor.validarRepetidos())
                {
                    vendedor.escibirRegistro();
                    vista.getPnlMostrar().setVisible(true);
                    cargarTabla();
                }
            }
        }
        if (e.getSource() == vista.getItmSalir())
        {
            vista.setVisible(false);
        }
        if (e.getSource() == vista.getItmNomostrar())
        {
            vista.getPnlMostrar().setVisible(false);
            //limpiarCampos();
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

    private boolean validarDatos() {
        if (vista.getNombre().isEmpty() || vista.getCedula().isEmpty() || vista.getEmpresa().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "Validación", 2);
            return false;
        }
        return true;
    }
}
