
package protofinancial;

import clases.Usuario;
import java.io.IOException;
import servicios.Archivos;
import vistas.Login;

public class ProtoFinancial {

    public static void main(String[] args) {
        
        Archivos Manejador = new Archivos();
        Usuario user = new Usuario();
        user.Login= "minato";
        user.Password = "santi2";
        String[] lista = {user.Login, user.Password};
        
        //Manejador.Insertar("Usuarios", lista);
        
        Login login = new Login();
        login.show();
    }
    
}
