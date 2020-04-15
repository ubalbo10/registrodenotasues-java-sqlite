package com.example.basedatosss14030.clases;

public class Nota {
    String codMateria;
    String carnet;
    String ciclo;
    Float notaFinal;

    public Nota(String codMateria, String carnet, String ciclo, Float notaFinal) {
        this.codMateria = codMateria;
        this.carnet = carnet;
        this.ciclo = ciclo;
        this.notaFinal = notaFinal;
    }

    public Nota() {
    }

    public String getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(String codMateria) {
        this.codMateria = codMateria;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public Float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Float notaFinal) {
        this.notaFinal = notaFinal;
    }
}
