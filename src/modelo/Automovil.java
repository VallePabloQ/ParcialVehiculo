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
public class Automovil extends VehiculoTerrestre {
    private String puertas,cambios;

    public Automovil(){}
    public Automovil(String puertas, String cambios, String llantas, String escape, String placa, String modelo, String color) {
        super(llantas, escape, placa, modelo, color);
        this.puertas = puertas;
        this.cambios = cambios;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }
    
    @Override
    public void agregar(){}
    @Override
    public void eliminar(){}
}
