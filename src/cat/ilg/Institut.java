package cat.ilg;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;

public class Institut {

    protected String nom ;
    ArrayList<Persona>  personas = new ArrayList<>();

    public  Institut(String nom){
        this.nom = nom ;
    }

    public void afegirPersona(Persona persona){
        this.personas.add(persona);

    }

    public void imprimirInformacio(){
        System.out.println("=======================================Personas===========================================");
        for (Persona persona : personas) {
            System.out.println(persona.obtenirDades());
        }
    }
}
