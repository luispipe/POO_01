package com.example.poo_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creamo un objeto
        /*
        * Un objeto es la instancia de una clase
        * */

        Circulo circuloVerde= new Circulo("Verde",2);

        System.out.println(circuloVerde.area());
        System.out.println(circuloVerde.perimetro());
        circuloVerde.pintar();
        System.out.println(circuloVerde.getColor());
        circuloVerde.setColor("Verde Oscuro");
        System.out.println(circuloVerde.getColor());

    }
}