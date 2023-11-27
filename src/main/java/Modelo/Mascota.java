/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Mariana M
 */
public class Mascota {
   
    private String nombre;
    private String raza;
    private int edad;
    private String idDueno;

    public Mascota(String nombre, String raza, int edad, String idDueno) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.idDueno = idDueno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getIdDueno() {
        return idDueno;
    }
}