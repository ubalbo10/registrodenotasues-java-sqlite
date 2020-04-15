package com.example.basedatosss14030.clases;

public class Alumno {
    String carnet;
    String nombre;
    String apellido;
    String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    Integer MatGanadas;

    public Alumno() {

    }

    public Alumno(String carnet, String nombre, String apellido) {

        this.carnet = carnet;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getMatGanadas() {
        return MatGanadas;
    }

    public void setMatGanadas(Integer matGanadas) {
        MatGanadas = matGanadas;
    }
}
