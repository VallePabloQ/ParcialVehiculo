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
abstract class Vehiculo {
    private String placa,modelo,color;

    public Vehiculo(){}
    public Vehiculo(String placa, String modelo, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    protected void agregar(){}
    protected void eliminar(){}
}
