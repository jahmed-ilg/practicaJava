package cat.ilg;

public class Professor extends Persona {

    protected double sou = 0.0;

    public Professor(){};

    public Professor (String nom){
        this.nom = nom;
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
        String check = "";
        try {
            if ( dni == null || nom ==  null ){
                throw new Exception("Error: Faltan Datos para Introducir");
            } else {
                check = "Persona amb nom : " + this.nom + " i DNI " + this.dni + " (PROFE amb sou : " + String.format("%.3f",this.sou) + " )";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return check ;
    }
}
