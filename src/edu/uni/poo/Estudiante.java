package edu.uni.poo;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona{
    private String codigo;
    private List<Curso> cursosMatriculados;

    public Estudiante(String codigo, String nombres, String apellidos, String dni) {
        super(nombres, apellidos, dni);
        this.codigo = codigo;
        this.cursosMatriculados = new ArrayList<>();
    }

    public void matricular (Curso curso) {
        cursosMatriculados.add(curso);
        System.out.println(getNombreCompleto() + " se matriculó en " + curso);
    }

    public List<Curso> getCursosMatriculados() {
        return cursosMatriculados;
    }
}
