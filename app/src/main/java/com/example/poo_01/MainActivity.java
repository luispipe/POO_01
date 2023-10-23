package com.example.poo_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Una clase abstracta no permite crear objetos

        Circulo circulo1= new Circulo("Verde",4);
        circulo1.saludar();

    }
}