package com.example.poo_01;

public class AccesoPrivado {
    //atributos
    private String nombre="Luis Rojas";
    private String documento="Pasaporte";
    public String nacionalidad="Colombiana";
    private String numeroDocumento="56589745";
    private String direccion= "calle 68 #456-085";
    private String telefono= "3146598569";

    private void saludar(){
        System.out.println("Nivel de acceso Private");
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getDocumento() {
        return documento;
    }

    private void setDocumento(String documento) {
        this.documento = documento;
    }

    private String getNacionalidad() {
        return nacionalidad;
    }

    private void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    private String getNumeroDocumento() {
        return numeroDocumento;
    }

    private void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    private String getDireccion() {
        return direccion;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private String getTelefono() {
        return telefono;
    }

    private void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
