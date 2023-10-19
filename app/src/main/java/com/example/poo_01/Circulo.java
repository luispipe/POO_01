package com.example.poo_01;

public class Circulo {
    //Atributos o caracteristicas del objeto
    String color;
    double radio;

    //Metodos o los comportamientos del objeto

    //Metodo constructor-> es el que construye el objeto
    public Circulo(String color, double radio){
        //utilizamos la palabra reservada this para referirnos al objeto
        this.color=color;
        this.radio=radio;
    }

    public double area(){
        // Area= π * (r^2)
        return (Math.PI*(this.radio*this.radio));
    }

    public double perimetro(){
        return 2*Math.PI*this.radio;
    }

    public void pintar(){
        System.out.println("Se pinto el circulo de color:"+this.color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
