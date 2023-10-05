/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mariana M
 */
public class Login {
    private static final String administradores = "src/main/java/Modelo/administradores.txt";

    private String usuario;
    private String contraseña;
    private String tipo;

    public Login() {}

    public Login(String usuario, String contraseña, String tipo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    // Getters y Setters para usarlos en el formulario
    
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

   
    public boolean validarIngreso() {
        try {
            FileReader lector = new FileReader(administradores);
            BufferedReader escritor = new BufferedReader(lector);

            String linea;
            while ((linea = escritor.readLine()) != null) { // Mientras haya líneas
                String[] campos = linea.split(";|,"); // toma cada dato por separado por ";" o ","

                if (campos.length == 3) { // Ahora esperamos tres campos: usuario, contraseña y tipo
                    String usuarioAdmin = campos[0];
                    String contraseñaAdmin = campos[1];
                    String tipoAdmin = campos[2];

                    if (usuario.equals(usuarioAdmin) && contraseña.equals(contraseñaAdmin) && tipo.equals(tipoAdmin)) {
                        // Coinciden los datos, el inicio de sesión es exitoso
                        escritor.close();
                        return true;
                    }
                }
            }

            
            escritor.close();
            return false;
        } catch (IOException e) {
            System.err.println("Error: No se pudo leer el archivo 'administradores.txt'.");
            return false;
        }
    }
    
}
