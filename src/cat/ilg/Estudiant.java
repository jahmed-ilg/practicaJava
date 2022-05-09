package cat.ilg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Estudiant extends Persona{

    ArrayList<Double> notas = new ArrayList<>();
    private double notaMaxima ;
    private double notaMinima ;
    private double mediana ;

    public Estudiant() {

    }

    public double getNotaMinima() {
        notaMinima = Collections.min(notas);
        return notaMinima;
    }

    public double getNotaMaxima() {
        notaMaxima =   Collections.max(notas);
        return notaMaxima;
    }

    public double getMediana() {
        double suma = 0;

        for (double nota: notas) {
            suma += nota;
        }

        mediana = suma / notas.size();
        return mediana;
    }

    /*public void setNota(double nota) {
                this.nota = nota;
            }
            */
    public Estudiant (String nom){
        setNom(nom);

    }

    public void posarNota(double nota){
        try {
            if ( nota < 0.0 || nota > 10.0 ){
                throw new Exception("Error: Nota Invalida");
            } else {
                notas.add(nota);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    @Override
    public void obtenirDades() {

        try {
            if ( getDni() == null || getNom() ==  null ){
                throw new Exception("Error: Faltan Datos para Introducir");
            } else {
                System.out.println("Persona amb Nom : " + getNom() + " i dni " + getDni() +
                        " (ESTUDIANT amb la Nota maxima : " + getNotaMaxima() + " y la Nota minima : " + getNotaMinima() +
                         " y la Nota mitjana de  : " + getMediana() +  " )");
                System.out.println("====================================================================================");
                System.out.println("Notas de Estudiante");
                System.out.println("====================================================================================");

                for (double nota: notas) {
                    System.out.println(nota);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
