/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cliente extends Persona {

    private String numeroCliente;
    private ArrayList<Mascota> mascotas;
    private String direccion;
    private String telefono;
    private String email;
    private static final String archivo = "src/main/java/Modelo/clientes.txt";

    public Cliente(String numeroCliente, ArrayList<Mascota> mascotas, String telefono, String email, String nombre, String edad, String identificacion) {
        super(nombre, edad, identificacion, "Cliente");
        this.numeroCliente = numeroCliente;
        this.mascotas = mascotas;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void agregarCliente() {
        try ( BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true)))
        {
            String datos = getNombre() + ";" + getEdad() + ";" + getIdentificacion() + ";" + getNumeroCliente() + ";" + getRol() + ";" + getTelefono() + ";" + getEmail() + ";";
            escritor.write(datos);
            escritor.newLine();
            JOptionPane.showMessageDialog(null, "Cliente registrado correctamente", "Cliente registrado", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscarCliente(String numeroCliente) {
        try ( BufferedReader lector = new BufferedReader(new FileReader(archivo)))
        {
            String linea;
            while ((linea = lector.readLine()) != null)
            {
                String[] campos = linea.split(";");
                if (campos.length > 6 && campos[3].equals(numeroCliente))
                {
                    // Muestra la información del cliente
                    JOptionPane.showMessageDialog(null, "Información del Cliente:\nNombre: " + campos[0] + "\nEdad: " + campos[1] + "\nIdentificación: " + campos[2]
                            + "\nNúmero de Cliente: " + campos[3] + "\nRol: " + campos[4] + "\nTeléfono: " + campos[5] + "\nEmail: " + campos[6], "Información del Cliente", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Cliente no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizarCliente(String numeroCliente, String nuevoTelefono, String nuevoEmail) {
        ArrayList<String> lineas = new ArrayList<>();
        boolean encontrado = false;

        try ( BufferedReader lector = new BufferedReader(new FileReader(archivo)))
        {
            String linea;
            while ((linea = lector.readLine()) != null)
            {
                String[] campos = linea.split(";");
                if (campos.length > 6 && campos[3].equals(numeroCliente))
                {
                    campos[5] = nuevoTelefono;
                    campos[6] = nuevoEmail;
                    encontrado = true;
                }
                lineas.add(String.join(";", campos));
            }
        } catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (encontrado)
        {
            try ( BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo)))
            {
                for (String l : lineas)
                {
                    escritor.write(l);
                    escritor.newLine();
                }
                JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente", "Cliente actualizado", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al escribir en el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarCliente(String numeroCliente) {
        ArrayList<String> lineas = new ArrayList<>();
        boolean encontrado = false;

        try ( BufferedReader lector = new BufferedReader(new FileReader(archivo)))
        {
            String linea;
            while ((linea = lector.readLine()) != null)
            {
                String[] campos = linea.split(";");
                if (campos.length > 6 && campos[3].equals(numeroCliente))
                {
                    encontrado = true;
                } else
                {
                    lineas.add(linea);
                }
            }
        } catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (encontrado)
        {
            try ( BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo)))
            {
                for (String l : lineas)
                {
                    escritor.write(l);
                    escritor.newLine();
                }
                JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente", "Cliente eliminado", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al escribir en el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
