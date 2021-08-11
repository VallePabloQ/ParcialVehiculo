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
public class VehiculoTerrestre extends Vehiculo {
    private String llantas,escape;

    public VehiculoTerrestre(){}
    public VehiculoTerrestre(String llantas, String escape, String placa, String modelo, String color) {
        super(placa, modelo, color);
        this.llantas = llantas;
        this.escape = escape;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getEscape() {
        return escape;
    }

    public void setEscape(String escape) {
        this.escape = escape;
    }
    
    @Override
    public void agregar(){}
    @Override
    public void eliminar(){}
}
