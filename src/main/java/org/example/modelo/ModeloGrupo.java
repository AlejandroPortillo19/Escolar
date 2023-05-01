package org.example.modelo;

import java.time.LocalTime;
import java.util.ArrayList;

public class ModeloGrupo {
    private String clave;
    private ModeloMateria materia;
    private ModeloCatedratico catedratico;
    private LocalTime hora;
    private int salon;
    private ArrayList<ModeloAlumno> alumnos;

    public ModeloGrupo() {
    }

    public ModeloGrupo(String clave, ModeloMateria materia, ModeloCatedratico catedratico, LocalTime hora, int salon, ArrayList<ModeloAlumno> alumnos) {
        this.clave = clave;
        this.materia = materia;
        this.catedratico = catedratico;
        this.hora = hora;
        this.salon = salon;
        this.alumnos = alumnos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ModeloMateria getMateria() {
        return materia;
    }

    public void setMateria(ModeloMateria materia) {
        this.materia = materia;
    }

    public ModeloCatedratico getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(ModeloCatedratico catedratico) {
        this.catedratico = catedratico;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public ArrayList<ModeloAlumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<ModeloAlumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "ModeloGrupo{" +
                "clave='" + clave + '\'' +
                ", materia=" + materia +
                ", catedratico=" + catedratico +
                ", hora=" + hora +
                ", salon=" + salon +
                ", alumnos=" + alumnos +
                '}';
    }
}
