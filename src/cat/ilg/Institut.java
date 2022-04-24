package cat.ilg;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;

public class Institut {

    protected String nom ;
    ArrayList<Persona> estudiants = new ArrayList<>();
    ArrayList<Persona> professors = new ArrayList<>();
    ArrayList<Persona> professorsSubstituts = new ArrayList<>();

    public  Institut(String nom){
        this.nom = nom ;
    }

    public void afegirProfe(Professor profe){
        professors.add(profe);

    }

    public void afegirEstudiant(Estudiant estudiant){
        estudiants.add(estudiant);

    }
    public void afegirProfeSubstitut(ProfessorSubstitut profe){
        professorsSubstituts.add(profe);

    }


    public void imprimirInformacio(){
        System.out.println("=======================================Professors===========================================");
        for (Persona professor : professors) {
            System.out.println(professor.obtenirDades());
        }

        System.out.println("=======================================Estudiants===========================================");
        for (Persona estudiant : estudiants) {
            System.out.println(estudiant.obtenirDades());
        }

        System.out.println("==================================Professors Substituts=====================================");
        for (Persona professorSubstitut : professorsSubstituts) {
            System.out.println(professorSubstitut.obtenirDades());
        }
    }
}
