package com.example.poo_01;

public class AccesoProtegido {
    //atributos
    public String nombre="Luis Rojas";
    protected String documento="Pasaporte";
    protected String nacionalidad="Colombiana";
    protected String numeroDocumento="56589745";
    protected String direccion= "calle 68 #456-085";
    protected String telefono= "3146598569";

    public void saludar(){
        System.out.println("Nivel de acceso Protected");
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getDocumento() {
        return documento;
    }

    protected void setDocumento(String documento) {
        this.documento = documento;
    }

    protected String getNacionalidad() {
        return nacionalidad;
    }

    protected void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    protected String getNumeroDocumento() {
        return numeroDocumento;
    }

    protected void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    protected String getDireccion() {
        return direccion;
    }

    protected void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    protected String getTelefono() {
        return telefono;
    }

    protected void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
