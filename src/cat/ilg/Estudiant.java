package cat.ilg;

import java.util.Collections;
import java.util.HashMap;

public class Estudiant extends Persona{

    HashMap<String,Double> notas = new HashMap<>();
    private double notaMaxima ;
    private double notaMinima ;

    public Estudiant() {

    }

    public double getNotaMinima() {
        notaMinima = Collections.min(notas.values());
        return notaMinima;
    }

    public double getNotaMaxima() {
        notaMaxima =   Collections.max(notas.values());
        return notaMaxima;
    }

    /*public void setNota(double nota) {
            this.nota = nota;
        }
        */
    public Estudiant (String nom){
        setNom(nom);

    }

    public void posarNota(String asignatura , double nota){
        try {
            if ( nota < 0.0 || nota > 10.0 ){
                throw new Exception("Error: Nota Invalida");
            } else {
                notas.put(asignatura,nota);
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
                        " (ESTUDIANT amb la Nota maxima : " + getNotaMaxima() + " y la Nota minima : " + getNotaMinima() + " )");
                System.out.println("====================================================================================");
                System.out.println("Notas de Estudiante");
                System.out.println("====================================================================================");
                for (String i : notas.keySet()) {
                    System.out.println("Asignatura: " + i + " ; Nota: " + notas.get(i));
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
