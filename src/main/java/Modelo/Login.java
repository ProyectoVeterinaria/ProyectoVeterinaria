/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Mariana M
 */
public class Login {
    private String usuario;
    private String contraseña;
    private String tipo;

    public Login(String usuario, String contraseña, String tipo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    // Getters y Setters para usarlos en controlador Login
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    
    
}
