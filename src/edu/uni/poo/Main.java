package edu.uni.poo;

public class Main {
    public static void main(String[] args) {
        Curso ingSoftware = new Curso("CIB02", "Ingeniería de Software", 4);
        Curso calculo = new Curso("CB401","Cálculo Aplicado",3);

        Estudiante ana = new Estudiante("20211001","Ana","Quispe Rojas","71234567");
        ana.matricular(ingSoftware);
        ana.matricular(calculo);

        System.out.println("Cursos de " + ana.getNombreCompleto() + ":");
        for (Curso c : ana.getCursosMatriculados()) {
            System.out.println(" - " + c);
        }
    }
}
