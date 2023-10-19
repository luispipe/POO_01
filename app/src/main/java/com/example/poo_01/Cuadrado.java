package com.example.poo_01;

public class Cuadrado {
    //Atributos
    double lado;
    String color;

    //Metodo constructor
    public Cuadrado(double lado, String color) {
        this.lado = lado;
        this.color = color;
    }

    //Otros metodos
    public double area(){
        return this.lado*this.lado;
    }
    public double perimetro(){
        return this.lado*4;
    }

    public void pintar(){
        System.out.println("El cuadrado se pinto de color: "+this.color);
    }

    public double getLado() {
        return lado;
    }

    public String getColor() {
        return color;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
