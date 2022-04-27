package cat.ilg;

import java.util.Date;

public class ProfessorSubstitut extends Professor{

    Date dataInici ;
    Date dataFi ;

    public ProfessorSubstitut(){};

    public ProfessorSubstitut(String nom){
        setNom(nom);
    }

    void asignarSubstitucio(Date dataInici , Date dataFi){
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    public  String obtenirDades(){
        String check = "";
        try {
            if ( this.getDni() == null || this.getNom() ==  null ){
                throw new Exception("Error: Faltan Datos para Introducir");
            } else {
                check = "Persona amb nom : " + this.getNom() + " i DNI " + this.getDni() + " es el substitut des de  la data " + dataInici +
                        " fins a la data " + dataFi + "  (PROFE Substitut amb sou : " + String.format("%.3f",this.getSou()) + " )";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return check ;
    }
}
