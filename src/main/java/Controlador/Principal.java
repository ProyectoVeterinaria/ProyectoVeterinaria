

package Controlador;
import Modelo.Login;
import Vista.FormularioLogin;
import javax.swing.JFrame;


public class Principal  {

    public static void main(String[] args) {
       
        FormularioLogin iniciosesion = new FormularioLogin();
      
        iniciosesion.setVisible(true);
        Login usuario= new Login();
        ControladorLogin controlador= new ControladorLogin(iniciosesion, usuario);
       
        
        
    }
    
}
