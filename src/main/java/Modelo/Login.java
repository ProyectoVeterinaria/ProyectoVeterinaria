/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Login {

    private static final String administradores = "src/main/java/Modelo/administradores.txt";
    private static final String veterinarios = "src/main/java/Modelo/veterinarios.txt";
    private static final String vendedores = "src/main/java/Modelo/vendedores.txt";
    private String usuario;
    private String contraseña;
    private String tipo;

    public Login() {
    }

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

    public boolean validarIngresoAdmin() {
        return validarIngreso(administradores, 0, 1, 2); // Para admin, campos en la posición 0, 1 y 2
    }

    public boolean validarIngresoVendedor() {
        return validarIngreso(vendedores, 2, 2, 4); // Para vendedores, campos en la posición 2, 2 y 4
    }

    public boolean validarIngresoVeterinario() {
        return validarIngreso(veterinarios, 2, 2, 4); // Para veterinarios, campos en la posición 2, 2 y 4
    }

    private boolean validarIngreso(String archivo, int usuarioIndex, int contraseñaIndex, int tipoIndex) {
        try
        {
            FileReader lector = new FileReader(archivo);
            BufferedReader escritor = new BufferedReader(lector);

            String linea;
            while ((linea = escritor.readLine()) != null)
            {
                String[] campos = linea.split(";|,");

                if (campos.length > tipoIndex)
                {
                    String usuarioActual = campos[usuarioIndex];
                    String contraseñaActual = campos[contraseñaIndex];
                    String tipoActual = campos[tipoIndex];

                    if (usuario.equals(usuarioActual) && contraseña.equals(contraseñaActual) && tipo.equals(tipoActual))
                    {
                        escritor.close();
                        return true;
                    }
                }
            }

            escritor.close();
            return false;
        } catch (IOException e)
        {
            System.err.println("Error: No se pudo leer el archivo '" + archivo + "'.");
            return false;
        }
    }
}
