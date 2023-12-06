/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cliente extends Persona {

    private ArrayList<String> mascotas;
    private String direccion;
    private String telefono;
    private String email;
    private static final String archivo = "src/main/java/Modelo/clientes.txt";
    private static final String CODIFICACION = "UTF-8";

    public Cliente(String telefono, String email, String nombre, String edad, String identificacion) {
        super(nombre, edad, identificacion, "Cliente");

        this.mascotas = mascotas;
        this.telefono = telefono;
        this.email = email;
    }

    public ArrayList<String> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<String> mascotas) {
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
            String datos = getNombre() + ";" + getIdentificacion()+ ";" + getEdad()+ ";" + getTelefono() + ";" + getEmail() + ";";
            escritor.write(datos);
            escritor.newLine();
            JOptionPane.showMessageDialog(null, "Cliente registrado correctamente", "Cliente registrado", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

  
    public void modificarRegistros(String cedula) {
        boolean encontrado = false;

        try
        {
            ArrayList<String> lineas = new ArrayList<>();
            String linea;
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            while ((linea = reader.readLine()) != null)
            {
                String[] campos = linea.split(";");
                if (campos.length >= 5 && campos[1].equals(cedula))
                {

                    campos[0] = this.nombre;
                    campos[1] = this.identificacion;
                    campos[2] = this.edad;
                    campos[3] = this.telefono;
                    campos[4] = this.email;

                    linea = String.join(";", campos);
                    encontrado = true;
                }
                lineas.add(linea);
            }
            reader.close();

            // Reescribe el archivo con las modificaciones
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
            JOptionPane.showMessageDialog(null, "Error al modificar el registro", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (encontrado)
        {
            JOptionPane.showMessageDialog(null, "Registro modificado correctamente", "Registro modificado", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "La cédula ingresada no se encuentra registrada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarRegistro() {
        boolean encontrado = false;
        String cedula = JOptionPane.showInputDialog(null, "Escribe la cedula del vendedor que deseas eliminar", "Eliminar", 2);
        try
        {
            ArrayList<String> lineas = new ArrayList<>();
            String linea;
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            while ((linea = reader.readLine()) != null)
            {
                String[] campos = linea.split(";");
                if (campos[1].equals(cedula)) //ignora la linea donde encuentra cc
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

    public ArrayList<String[]> leerRegistros() {
        ArrayList<String[]> registros = new ArrayList<>();
        try ( BufferedReader lector = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), CODIFICACION)))
        {
            String linea;
            while ((linea = lector.readLine()) != null)
            {
                String[] campos = linea.split(";");
                if (campos.length > 4 && campos[4].equalsIgnoreCase("Cliente"))
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

    public boolean validarDatosCliente() {
        boolean nombreValido = validarNombre(this.getNombre());
        boolean edadValida = validarEdad(this.getEdad());
        boolean cedulaValida = validarCedula(this.getIdentificacion());
        boolean correo = validarCorreo(this.getEmail());
        boolean telefono = validarTelefono(this.getTelefono());

        if (!nombreValido)
        {
            JOptionPane.showMessageDialog(null, "Nombre inválido", "Ingresa los datos nuevamente", 0);
        }
        if (!edadValida)
        {
            JOptionPane.showMessageDialog(null, "Edad inválida", "Ingresa los datos nuevamente", 0);
        }
        if (!cedulaValida)
        {
            JOptionPane.showMessageDialog(null, "Cédula inválida", "Ingresa los datos nuevamente", 0);
        }
        if (!correo)
        {
            JOptionPane.showMessageDialog(null, "Correo inválido", "Ingresa los datos nuevamente", 0);
        }
        if (!telefono)
        {
            JOptionPane.showMessageDialog(null, "Telefono inválido", "Ingresa los datos nuevamente", 0);
        }

        return nombreValido && edadValida && cedulaValida && correo;
    }
public void mostrarMascotasEnOptionPane() {
    if (mascotas != null && !mascotas.isEmpty()) {
        StringBuilder mensaje = new StringBuilder("Lista de mascotas:\n");

        for (String mascota : mascotas) {
            mensaje.append(mascota).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Mascotas", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "No hay mascotas registradas.", "Mascotas", JOptionPane.INFORMATION_MESSAGE);
    }
}
    public boolean validarRepetidos() {
        try
        {
            FileReader archivo = new FileReader("src/main/java/Modelo/clientes.txt");
            BufferedReader lector = new BufferedReader(archivo);

            String linea;
            while ((linea = lector.readLine()) != null)
            {
                // Dividir la línea en campos usando ; como separador
                String[] campos = linea.split(";");

                // 
                if (campos[0].equals(this.getNombre()) && campos[1].equals(this.getIdentificacion()))
                {
                    JOptionPane.showMessageDialog(null, "El cliente ya existe en el sistema", "Validación", 2);
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
 public void agregarMascotasDesdeArchivo(String nombre) {
    if (mascotas == null) {
        mascotas = new ArrayList<>(); // Inicializar la lista si es nula
    }

    try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/Modelo/clientes.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] campos = line.split(";");

            if (campos.length >= 4 && nombre.equals(campos[3])) {
                mascotas.add(campos[0]);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
