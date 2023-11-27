/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {

    private String codigoVendedor;
    private String Empresa;
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final String FILENAME = "vendedores.json";
    private static final String archivo = "src/main/java/Modelo/vendedores.txt";
    private static final String CODIFICACION = "UTF-8";

    public Vendedor(String codigoVendedor, String Empresa, String nombre, String edad, String identificacion) {
        super(nombre, edad, identificacion, "Vendedor");
        this.codigoVendedor = codigoVendedor;
        this.Empresa = Empresa;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public void escibirRegistro() {
        try ( BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true)))
        {

            String datos = getNombre() + ";" + getEdad() + ";" + getIdentificacion() + ";" + getCodigoVendedor() + ";" + getRol() + ";" + getEmpresa() + ";";
            escritor.write(datos);
            escritor.newLine();
            JOptionPane.showMessageDialog(null, "Veterinario registrado correctamente", "Usuario registrado", 3);

        } catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar", "Error", 0);
        }
    }

    public boolean validarRepetidos() {
        try
        {
            FileReader archivo = new FileReader("src/main/java/Modelo/vendedores.txt");
            BufferedReader lector = new BufferedReader(archivo);

            String linea;
            while ((linea = lector.readLine()) != null)
            {
                // Dividir la línea en campos usando ; como separador
                String[] campos = linea.split(";");

                // 
                if (campos[0].equals(this.getNombre()) && campos[2].equals(this.getIdentificacion()))
                {
                    JOptionPane.showMessageDialog(null, "El veterinario ya existe en el sistema", "Validación", 2);
                    return false;
                }
            }
            lector.close(); // Cierra el archivo cuando hayas terminado
        } catch (IOException e)
        {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return true;

    }

    public ArrayList<String[]> leerRegistros() {
        ArrayList<String[]> registros = new ArrayList<>();
        try ( BufferedReader lector = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), CODIFICACION)))
        {
            String linea;
            while ((linea = lector.readLine()) != null)
            {
                String[] campos = linea.split(";");
                if (campos.length > 4 && campos[4].equalsIgnoreCase("Vendedor"))
                {
                    campos = removeElement(campos, 4);
                }
                registros.add(campos);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return registros;
    }

    // Método para eliminar un elemento de un array
    private String[] removeElement(String[] arr, int index) {
        String[] newArr = new String[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++)
        {
            if (i == index)
            {
                continue;
            }
            newArr[k++] = arr[i];
        }
        return newArr;
    }
    
    public void eliminarRegistro() {
        boolean encontrado = false;
        String cedula = JOptionPane.showInputDialog(null, "Escribe la cedula del veterinario que deseas eliminar", "Eliminar", 2);
        try
        {
            ArrayList<String> lineas = new ArrayList<>();
            String linea;
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            while ((linea = reader.readLine()) != null)
            {
                String[] campos = linea.split(";");
                if (campos[2].equals(cedula)) //ignora la linea donde encuentra cc
                {
                    encontrado = true;
                } else
                {
                    lineas.add(linea);
                }
            }
            reader.close();

            // Reescribe el archivo sin la linea de cc
            BufferedWriter escribir = new BufferedWriter(new FileWriter(archivo));
            for (String l : lineas)
            {
                escribir.write(l);
                escribir.newLine();
            }
            escribir.close();

        } catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro", "Error", 0);
        }

        if (encontrado)
        {
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente", "Registro eliminado", 3);
        } else
        {
            JOptionPane.showMessageDialog(null, "La cédula ingresad no se encuetra registrada", "Eliminar", 0);
        }
    }

}
