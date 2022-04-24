package cat.ilg;

public class Estudiant extends Persona{
    protected double nota;

    public Estudiant(){};

    public Estudiant (String nom){
        this.nom = nom;
    }

    public void posarNota(double nota){
        try {
            if ( nota < 0.0 || nota > 10.0 ){
                throw new Exception("Error: Nota Invalida");
            } else {
                this.nota = nota;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    @Override
    public String obtenirDades() {
        String check = "";
        try {
            if ( dni == null || nom ==  null ){
                throw new Exception("Error: Faltan Datos para Introducir");
            } else {
                check = "Persona amb Nom : " + nom + " i dni " + dni + " (ESTUDIANT amb nota : " + this.nota + " )";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return check ;
    }
}
