package com.example.poo_01;

public abstract class Figura {
    //No se puede instanciar, es decir no puedo crear objetos de esta clase
    String color;

    public Figura(String color) {
        this.color = color;
    }

    //Metodos sin logica o sin cuerpo es decir sin {}
    public abstract double perimetro();

    public abstract double area();

    public abstract void pintar();

    //En las clases abstractas pueden existir metodos que no sean abstractos

    public void saludar(){
        System.out.println("Saludos desde Figura");
    }






}
