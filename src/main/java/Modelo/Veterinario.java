/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariana M
 */
public class Veterinario extends Persona{
    private String noLicencia;
    private String especializacion;
    private static final String archivo = "veterinarios.txt";

   
   
    
    public Veterinario(String noLicencia, String especializacion, String nombre, String edad, String identificacion) {
        super(nombre, edad, identificacion, "Veterinario");
        this.noLicencia = noLicencia;
        this.especializacion = especializacion;
    }

    public String getNoLicencia() {
        return noLicencia;
    }

    public void setNoLicencia(String noLicencia) {
        this.noLicencia = noLicencia;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

   
    
    
     public void escibirRegistro() {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true))) {

            String datos = getNombre() + ";" + getEdad() + ";" + getIdentificacion() +";" +getNoLicencia() + ";" + getRol() +";"+ getEspecializacion()+";";
            escritor.write(datos);
            escritor.newLine();
            JOptionPane.showMessageDialog(null,"Veterinario registrado correctamente", "Usuario registrado",3 );
            
        } catch (IOException e) 
        {
            e.printStackTrace();
           JOptionPane.showMessageDialog(null,"Error al guardar","Error",0);
        }
    }
     
     
     
     
    public boolean validarRepetidos()
    {
          try {
            FileReader archivo = new FileReader("veterinarios.txt");
            BufferedReader lector = new BufferedReader(archivo);

            String linea;
            while ((linea = lector.readLine()) != null) {
                // Dividir la línea en campos usando ; como separador
                String[] campos = linea.split(";"); 
                
                // 
                if (campos[0].equals(this.getNombre()) && campos[2].equals(this.getIdentificacion())) 
                {
                    JOptionPane.showMessageDialog(null,"El veterinario ya existe en el sistema", "Validación",2 );
                    return false;
                }
            }

            lector.close(); // Cierra el archivo cuando hayas terminado
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return true;
    
    }
}
