/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Persona {

    @JsonProperty("nombre")
    String nombre;

    @JsonProperty("edad")
    String edad;

    @JsonProperty("identificacion")
    String identificacion;

    @JsonProperty("rol")
    private String rol;

    public Persona(String nombre, String edad, String identificacion, String rol) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.rol = rol;
    }

    public Persona() {
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public static boolean validarNombre(String nombre) {
        String regex = "^[a-zA-Z]+(\\s[a-zA-Z]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nombre);
        return matcher.matches();
    }

    public boolean validarEdad(String Edad) {
        try
        {
            int edad = Integer.parseInt(Edad);
            return edad > 18 && edad < 100;
        } catch (NumberFormatException e)
        {
            return false; // Si no se puede convertir a número, es inválido
        }
    }

    public boolean validarCedula(String cedula) {
        return cedula.matches("\\d{6,}");
    }

    public boolean validarNombreEmpresa(String nombreEmpresa) {
        return nombreEmpresa.matches("[a-zA-Z\\s]{3,}");
    }
}
