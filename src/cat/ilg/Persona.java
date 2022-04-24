package cat.ilg;

public class Persona {

    protected String dni ;
    protected String nom ;


    public  void canviarNom(String nom){
        this.nom = nom;
    }

    public void asignarDni(String dni){
        try {
            if ( this.dni != null){
                throw new Exception("Error: Persona ya tiene dni asignado");
            } else {
                this.dni = dni;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public  String obtenirDades(){

        try {
            if ( dni == null || nom ==  null ){
                throw new Exception("Error: Faltan Datos para Introducir");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return "Persona amb Nom : " + nom + " i dni " + dni ;
    }
}
