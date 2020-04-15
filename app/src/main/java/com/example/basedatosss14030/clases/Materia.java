package com.example.basedatosss14030.clases;

public class Materia {
    String codMateria;
    String nombreMateria;
    Float UnidadesValorativas;

    public Materia(String codMateria, String nombreMateria, Float unidadesValorativas) {
        this.codMateria = codMateria;
        this.nombreMateria = nombreMateria;
        UnidadesValorativas = unidadesValorativas;
    }

    public Materia() {
    }

    public String getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(String codMateria) {
        this.codMateria = codMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Float getUnidadesValorativas() {
        return UnidadesValorativas;
    }

    public void setUnidadesValorativas(Float unidadesValorativas) {
        UnidadesValorativas = unidadesValorativas;
    }
}
