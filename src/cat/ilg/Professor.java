package cat.ilg;

public class Professor extends Persona {

    private double sou = 0.0;

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

    public Professor(){};

    public Professor (String nom){
        setNom(nom);
        }

    public void canviarSou(double nouSou){
        try {
            if ( nouSou > 3.000 || nouSou < 0.0 ){
                throw new Exception("Error: Sou Incorrecte");
            } else {
                this.sou = nouSou;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public  String obtenirDades(){
        String toReturn = "";
        try {
            if ( this.getDni() == null || this.getNom() ==  null ){
                throw new Exception("Error: Faltan Datos para Introducir");
            } else {
                toReturn = "Persona amb nom : " + this.getNom() + " i DNI " + this.getDni() + " (PROFE amb sou : " + String.format("%.3f",this.sou) + " )";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return toReturn ;
    }
}
