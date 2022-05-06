package cat.ilg;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProfessorSubstitut extends Professor{


    Date dataInici ;
    Date dataFin ;




    public ProfessorSubstitut(){};

    public ProfessorSubstitut(String nom){
        setNom(nom);
    }

    void asignarSubstitucio(Date dataInici , Date dataFin){
        this.dataInici = dataInici;
        this.dataFin = dataFin;
    }

    public  String obtenirDades(){
        String check = "";
        try {
            if ( this.getDni() == null || this.getNom() ==  null ){
                throw new Exception("Error: Faltan Datos para Introducir");
            } else {
                check = "Persona amb nom : " + this.getNom() + " i DNI " + this.getDni() + " es el substitut des de  la data " +
                        this.dataInici.getDate() + '/' + this.dataInici.getMonth() + '/' + this.dataInici.getYear() +
                        " fins a la data " + this.dataFin.getDate() + '/'  + this.dataFin.getMonth() + '/' +
                        this.dataFin.getYear() + "  (PROFE Substitut amb sou : " + String.format("%.3f",this.getSou()) + " )";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return check ;
    }
}
