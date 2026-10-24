package edu.uni.poo;

public class Persona {
    protected String nombres;
    protected String apellidos;
    protected String dni;

    public Persona(String nombres, String apellidos, String dni) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombres + " "+ apellidos;
    }

    public String getDni() {
        return dni;
    }
}