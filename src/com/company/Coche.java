package com.company;

public class Coche {

    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad=0;


    //Contrusctores
    public Coche() {
    }

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo, Integer velocidad) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
        this.velocidad = velocidad;
    }
    //Comportamiento
    public void acelerar(Integer cantidad){
        if(cantidad>0 && cantidad <=120){
            this.velocidad+=cantidad;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
}
