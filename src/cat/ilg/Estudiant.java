package cat.ilg;

public class Estudiant extends Persona{
    private double nota;

    public Estudiant() {

    }


    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Estudiant (String nom){
        setNom(nom);

    }

    public void posarNota(double nota){
        try {
            if ( nota < 0.0 || nota > 10.0 ){
                throw new Exception("Error: Nota Invalida");
            } else {
                setNota(nota);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    @Override
    public String obtenirDades() {
        String toReturn = "";
        try {
            if ( getDni() == null || getNom() ==  null ){
                throw new Exception("Error: Faltan Datos para Introducir");
            } else {
                toReturn = "Persona amb Nom : " + getNom() + " i dni " + getDni() + " (ESTUDIANT amb nota : " + getNota() + " )";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return toReturn ;
    }
}
