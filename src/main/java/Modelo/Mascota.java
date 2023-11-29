/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static Modelo.Persona.validarNombre;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariana M
 */
public class Mascota {
   
    private String nombre;
    private String raza;
    private String edad;
    private String nombreDueno;
    private static final String CODIFICACION = "UTF-8";
    private static final String archivo = "src/main/java/Modelo/mascotas.txt";

    public Mascota(String nombre, String raza, String edad, String idDueno) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.nombreDueno = idDueno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getEdad() {
        return edad;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }
    public static boolean validarNombreMascota(String nombre) {
        String regex = "^[a-zA-Z\\s]{3,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nombre);
        return matcher.matches();
    }
       public static boolean validarNombreCliente(String nombre) {
        String regex = "^[a-zA-Z]+(\\s[a-zA-Z]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nombre);
        return matcher.matches();
    }

    public boolean validarEdad(String Edad) {
        try
        {
            int edad = Integer.parseInt(Edad);
            return edad >=0 && edad < 35;
        } catch (NumberFormatException e)
        {
            return false; // Si no se puede convertir a número, es inválido
        }
    }
    
    
     public boolean validarDatosMascota() {
        boolean nombreValido = validarNombre(this.getNombre());
        boolean edadValida = validarEdad(this.getEdad());
        boolean nombreusu = validarNombreCliente(this.getNombreDueno());
    

        if (!nombreValido) {
            JOptionPane.showMessageDialog(null, "Nombre inválido");
        }
        if (!edadValida) {
            JOptionPane.showMessageDialog(null, "Edad inválida");
        }
        if (!nombreusu) {
            JOptionPane.showMessageDialog(null, "Nombre del dueño inválido");
        }
        
         return nombreValido && edadValida && nombreusu;

     }

    public void escibirRegistro() {
        try ( BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true)))
        {

            String datos = getNombre() + ";" + getEdad() + ";" + getRaza() + ";" + getNombreDueno() + ";";
            escritor.write(datos);
            escritor.newLine();
            JOptionPane.showMessageDialog(null, "Mascota registrada correctamente", "Usuario registrado", 3);

        } catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar", "Error", 0);
        }
    }
    
public void modificarRegistros(String cedula) {
    boolean encontrado = false;

    try {
        ArrayList<String> lineas = new ArrayList<>();
        String linea;
        BufferedReader reader = new BufferedReader(new FileReader(archivo));
        while ((linea = reader.readLine()) != null) {
            String[] campos = linea.split(";");
            if (campos.length >= 4 && campos[3].equals(nombreDueno)) {
                // Actualizar los campos con los valores proporcionados
                campos[0] = nombre;
                campos[1] = edad;
                campos[2] = raza;
                campos[3] = nombreDueno;
               

               
                linea = String.join(";", campos);
                encontrado = true;
            }
            lineas.add(linea);
        }
        reader.close();


        BufferedWriter escribir = new BufferedWriter(new FileWriter(archivo));
        for (String l : lineas) {
            escribir.write(l);
            escribir.newLine();
        }
        escribir.close();

    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al modificar el registro", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (encontrado) {
        JOptionPane.showMessageDialog(null, "Registro modificado correctamente", "Registro modificado", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "La cédula ingresada no se encuentra registrada", "Error", JOptionPane.ERROR_MESSAGE);
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
                
                registros.add(campos);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return registros;
    }
      
    public void eliminarRegistro() {
        boolean encontrado = false;
        String nombre = JOptionPane.showInputDialog(null, "Escribe el Nombre de la mascota que deseas eliminar", "Eliminar", 2);
        String dueno = JOptionPane.showInputDialog(null, "Escribe el nombre del dueño", "Eliminar", 2);
        try
        {
            ArrayList<String> lineas = new ArrayList<>();
            String linea;
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            while ((linea = reader.readLine()) != null)
            {
                String[] campos = linea.split(";");
                if (campos[0].equals(nombre)&&campos[3].equals(dueno)) //ignora la linea donde encuentra cc
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
            JOptionPane.showMessageDialog(null, "La registro no encontrado, revisa los datos ingresados", "Eliminar", 0);
        }
    }

    
     public boolean validarRepetidos() {
        try
        {
            FileReader archivo = new FileReader("src/main/java/Modelo/mascotas.txt");
            BufferedReader lector = new BufferedReader(archivo);

            String linea;
            while ((linea = lector.readLine()) != null)
            {
                // Dividir la línea en campos usando ; como separador
                String[] campos = linea.split(";");

                // 
                if (campos[0].equals(this.getNombre()) && campos[3].equals(this.getNombreDueno()))
                {
                    JOptionPane.showMessageDialog(null, "La mascota ya existe en el sistema", "Validación", 2);
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

}