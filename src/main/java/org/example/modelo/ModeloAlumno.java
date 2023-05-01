package org.example.modelo;

public class ModeloAlumno {
    private int numControl;
    private String nombre;
    private ModeloEspecialidad especialidad;

    public ModeloAlumno() {
    }

    public ModeloAlumno(int numControl, String nombre, ModeloEspecialidad especialidad) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getNumControl() {
        return numControl;
    }

    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ModeloEspecialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(ModeloEspecialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numControl=" + numControl +
                ", nombre='" + nombre + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }

}
