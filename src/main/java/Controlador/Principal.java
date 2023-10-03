

package Controlador;
import Modelo.Login;
import Vista.FormularioLogin;
import javax.swing.JFrame;


public class Principal  {

   
    public static void main(String[] args) {
       
        FormularioLogin vista = new FormularioLogin();
        vista.setVisible(true);
        Login modelo= new Login();
        ControladorLogin controlador= new ControladorLogin(vista, modelo);
       
        
        
    }
    
}
