package com.example.poo_01;

public class Circulo extends Figura{
    //Atributos
    double radio;
    //Constructor
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    //Metodos
    @Override
    public double perimetro() {
        return 2*Math.PI*this.radio;
    }

    @Override
    public double area() {
        return Math.PI*(this.radio*this.radio);
    }

    @Override
    public void pintar() {
        System.out.println("Se pinto el circulo de color:"+this.color);
    }




}
