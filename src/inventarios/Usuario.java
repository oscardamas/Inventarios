/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios;

/**
 *
 * @author oscar
 */
public class Usuario {

   
    
    private String username;
    private String contra;
    
    
     public Usuario(String username, String contra) {
        this.username = username;
        this.contra = contra;
    }

     
     
    public String getUsername() {
        return username;
    }

    public String getContra() {
        return contra;
    }
     
     
     
    
}
