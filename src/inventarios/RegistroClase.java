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
public class RegistroClase {
    
      public RegistroClase(String nombre, String codigo, String modelo, String categoria, String observaciones) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.modelo = modelo;
        this.categoria = categoria;
        this.observaciones = observaciones;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    private String nombre;
    private String codigo;
    private String modelo;
    private String categoria;
    private String observaciones;
    
    
    
    
    
    
}
