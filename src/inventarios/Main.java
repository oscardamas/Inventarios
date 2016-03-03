/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios;

import java.util.ArrayList;

/**
 *
 * @author francisco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         ArrayList<Usuario> lista_Usuarios = new ArrayList<>();
        
        Usuario damas = new Usuario("oscar","damas");
        lista_Usuarios.add(damas);
      
        
        
        
      SaludosJFrame login = new SaludosJFrame(lista_Usuarios);
        login.setVisible(true);
        
        
        
    }

}
