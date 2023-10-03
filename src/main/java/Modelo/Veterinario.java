/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedWriter;
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

    public Veterinario(String noLicencia, String especializacion, String nombre, String edad, String identificacion) {
        super(nombre, edad, identificacion, "Veterinario");
        this.noLicencia = noLicencia;
        this.especializacion = especializacion;
    }
    
    
     public void escibirRegistro(String archivo) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true))) {

            String datos = getNombre() + ";" + getEdad() + ";" + getIdentificacion() + ";" + getRol();
            escritor.write(datos);
            escritor.newLine();
            JOptionPane.showMessageDialog(null,"Guardado correctamente" );
            
        } catch (IOException e) {
            e.printStackTrace();
           JOptionPane.showMessageDialog(null,"Error al guardar" );
        }
    }
}
