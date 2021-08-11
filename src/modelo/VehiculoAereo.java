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
public class VehiculoAereo extends Vehiculo {
    private String oxigeno,propulsores;

    public VehiculoAereo(){}
    public VehiculoAereo(String oxigeno, String propulsores, String placa, String modelo, String color) {
        super(placa, modelo, color);
        this.oxigeno = oxigeno;
        this.propulsores = propulsores;
    }

    public String getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(String oxigeno) {
        this.oxigeno = oxigeno;
    }

    public String getPropulsores() {
        return propulsores;
    }

    public void setPropulsores(String propulsores) {
        this.propulsores = propulsores;
    }
    
    @Override
    public void agregar(){}
    @Override
    public void eliminar(){}
}
