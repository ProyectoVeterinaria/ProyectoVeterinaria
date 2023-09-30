/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import Vista.FormularioLogin;


public class ControladorLogin  {
     private static final String administradores = "administradores.txt";

    public static boolean login(String usuario, String contraseña, String tipoUsuario) {
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

                    if (usuario.equals(usuarioAdmin) && contraseña.equals(contraseñaAdmin) && tipoUsuario.equals(tipoAdmin)) {
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



  

    

