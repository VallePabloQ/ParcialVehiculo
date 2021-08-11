/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lenovo FX
 */
public class Avion extends VehiculoAereo {
    private String alas;

    public Avion(){}
    public Avion(String alas, String oxigeno, String propulsores, String placa, String modelo, String color) {
        super(oxigeno, propulsores, placa, modelo, color);
        this.alas = alas;
    }

    public String getAlas() {
        return alas;
    }

    public void setAlas(String alas) {
        this.alas = alas;
    }
    
    @Override
    public void agregar(){}
    @Override
    public void eliminar(){}
}
