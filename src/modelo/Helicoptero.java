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
public class Helicoptero extends VehiculoAereo {
    private String helices;

    public Helicoptero(){}
    public Helicoptero(String helices, String oxigeno, String propulsores, String placa, String modelo, String color) {
        super(oxigeno, propulsores, placa, modelo, color);
        this.helices = helices;
    }

    public String getHelices() {
        return helices;
    }

    public void setHelices(String helices) {
        this.helices = helices;
    }
    
    @Override
    public void agregar(){}
    @Override
    public void eliminar(){}
    
}
