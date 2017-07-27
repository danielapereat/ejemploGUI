/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author daniela.perea
 */
public class persona {
    
    private String nombre1;
    private String codigo1;

    public persona() {
        
        
    }

    public persona(String nombre1, String codigo1) {
        this.nombre1 = nombre1;
        this.codigo1 = codigo1;
    }

    public String getNombre() {
        return nombre1;
    }

    public void setNombre(String nombre) {
        this.nombre1 = nombre1;
    }

    public String getCodigo() {
        return codigo1;
    }

    public void setCodigo(String codigo) {
        this.codigo1 = codigo1;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre1 + ", codigo=" + codigo1 + '}';
    }
    
    
    
}
