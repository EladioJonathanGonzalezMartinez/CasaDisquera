/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author remix
 */
public class CantanteFamoso {
    private String Nombre;
    private String DiscoFamoso;
    
    public CantanteFamoso(){
        Nombre = "";
        DiscoFamoso = "";
    }

    public CantanteFamoso(String Nombre, String DiscoFamoso) {
        this.Nombre = Nombre;
        this.DiscoFamoso = DiscoFamoso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDiscoFamoso() {
        return DiscoFamoso;
    }

    public void setDiscoFamoso(String DiscoFamoso) {
        this.DiscoFamoso = DiscoFamoso;
    }
    
    
    
}
