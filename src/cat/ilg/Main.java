package cat.ilg;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("=========================================Nom de Institut====================================");
        Institut institut = new Institut("Ins La Guineueta");
        System.out.println("Nom de l'institut es : " + institut.nom + "\n");



        // Professor 1
        Professor prof1 = new Professor("Marc");
        prof1.asignarDni("1234D");
        prof1.canviarSou(2.500);
        institut.afegirPersona(prof1);

        // Professor 2
        Professor prof2 = new Professor("German");
        prof2.asignarDni("85246C");
        prof2.canviarSou(3.000);
        institut.afegirPersona(prof2);

        // Professor 3
        Professor prof3 = new Professor();
        institut.afegirPersona(prof3);

        prof1.asignarDni("852369N");
        prof2.canviarSou(4.000);
        prof2.canviarSou(-1.000);


        // Estudiant 1
        Estudiant estudiant1 = new Estudiant();
        estudiant1.canviarNom("Joan");
        estudiant1.asignarDni("8466N");
        estudiant1.posarNota(7.7);
        estudiant1.posarNota(9);
        institut.afegirPersona(estudiant1);

        // Estudiant 2
        Estudiant estudiant2 = new Estudiant("Pepe");
        estudiant2.asignarDni("84615M");
        estudiant2.posarNota(11);
        estudiant2.posarNota(8);
        institut.afegirPersona(estudiant2);

        // Estudiant 3
        // Professor 3
        Estudiant estudiant3 = new Estudiant();
        estudiant3.asignarDni("963753n");
        estudiant3.asignarDni("741369n");
        institut.afegirPersona(estudiant3);


        // Professor Substitut
        ProfessorSubstitut professorSubstitut = new ProfessorSubstitut("David");
        professorSubstitut.asignarDni("9865741G");
        professorSubstitut.canviarSou(2.000);
        //String dataInici = new SimpleDateFormat(new Date(2021,1,1)) ;
        //Date dataFi = new Date(2022,5,3);

        Date dataInici = new Date(2021,01,01);
        Date dataFin = new Date(2022,04,03);
        professorSubstitut.asignarSubstitucio(dataInici,dataFin);
        institut.afegirPersona(professorSubstitut);

        professorSubstitut.asignarDni("9865472N");
        institut.imprimirInformacio();


    }
}
