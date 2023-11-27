/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelo;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    
}
