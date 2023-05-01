package org.example.modelo;

public class ModeloCatedratico {
    private String rfc,nombre;

    public ModeloCatedratico() {
    }

    public ModeloCatedratico(String rfc, String nombre) {
        this.rfc = rfc;
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
