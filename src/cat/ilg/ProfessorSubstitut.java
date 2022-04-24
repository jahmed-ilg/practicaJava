package cat.ilg;

import java.util.Date;

public class ProfessorSubstitut extends Professor{

    String dataInici ;
    String dataFi ;

    public ProfessorSubstitut(){};

    public ProfessorSubstitut(String nom){
        this.nom = nom;
    }

    void asignarSubstitucio(String dataInici , String dataFi){
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    public  String obtenirDades(){
        String check = "";
        try {
            if ( dni == null || nom ==  null ){
                throw new Exception("Error: Faltan Datos para Introducir");
            } else {
                check = "Persona amb nom : " + this.nom + " i DNI " + this.dni + " es el substitut des de  la data " + dataInici +
                        " fins a la data " + dataFi + "  (PROFE Substitut amb sou : " + String.format("%.3f",this.sou) + " )";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return check ;
    }
}
