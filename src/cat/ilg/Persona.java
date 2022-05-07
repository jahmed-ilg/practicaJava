package cat.ilg;

public class Persona {

    private String dni ;
    private String nom ;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public  void canviarNom(String nom){
        setNom(nom);
    }

    public void asignarDni(String dni){
        try {
            if ( this.getDni() != null){
                throw new Exception("Error: Persona ya tiene dni asignado");
            } else {
                setDni(dni);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public  void obtenirDades(){

        try {
            if ( getDni() == null || getNom() ==  null ){
                throw new Exception("Error: Faltan Datos para Introducir");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Persona amb Nom : " + getNom() + " i dni " + getDni()) ;
    }
}
