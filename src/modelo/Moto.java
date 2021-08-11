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
public class Moto extends VehiculoTerrestre {
    private String pata,baul;

    public Moto(){}
    public Moto(String pata, String baul, String llantas, String escape, String placa, String modelo, String color) {
        super(llantas, escape, placa, modelo, color);
        this.pata = pata;
        this.baul = baul;
    }

    public String getPata() {
        return pata;
    }

    public void setPata(String pata) {
        this.pata = pata;
    }

    public String getBaul() {
        return baul;
    }

    public void setBaul(String baul) {
        this.baul = baul;
    }
    
    @Override
    public void agregar(){}
    @Override
    public void eliminar(){}
}
