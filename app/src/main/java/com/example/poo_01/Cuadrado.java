package com.example.poo_01;

public class Cuadrado extends Figura{
    //Al heredar de una clase abstracta nos obliga a implementar su metodos
    //abstractos
    double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    //Polimorfismo por sobreescritura
    @Override
    public double perimetro() {
        return 4*this.lado;
    }

    @Override
    public double area() {
        return this.lado*this.lado;
    }

    @Override
    public void pintar() {
        System.out.println("El cuadrado se pinto de color:"+this.color);
    }
}
