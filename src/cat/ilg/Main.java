package cat.ilg;

public class Main {

    public static void main(String[] args) {
        System.out.println("=========================================Nom de Institut====================================");
        Institut institut = new Institut("Ins La Guineueta");
        System.out.println("Nom de l'institut es : " + institut.nom + "\n");



        // Professor 1
        Professor prof1 = new Professor("Marc");
        prof1.asignarDni("1234D");
        prof1.canviarSou(2.500);
        institut.afegirProfe(prof1);

        // Professor 2
        Professor prof2 = new Professor("German");
        prof2.asignarDni("85246C");
        prof2.canviarSou(3.000);
        institut.afegirProfe(prof2);

        // Professor 3
        Professor prof3 = new Professor();
        institut.afegirProfe(prof3);

        prof1.asignarDni("852369N");
        prof2.canviarSou(4.000);
        prof2.canviarSou(-1.000);


        // Estudiant 1
        Estudiant estudiant1 = new Estudiant();
        estudiant1.canviarNom("Joan");
        estudiant1.asignarDni("8466N");
        estudiant1.posarNota(7.7);
        institut.afegirEstudiant(estudiant1);

        // Estudiant 2
        Estudiant estudiant2 = new Estudiant("Pepe");
        estudiant2.asignarDni("84615M");
        estudiant2.posarNota(11);
        institut.afegirEstudiant(estudiant2);
/*
        // Estudiant 3
        // Professor 3
        Estudiant estudiant3 = new Estudiant();
        estudiant3.asignarDni("963753n");
        estudiant3.asignarDni("741369n");
        institut.afegirEstudiant(estudiant3);

        // Professor Substitut
        ProfessorSubstitut professorSubstitut = new ProfessorSubstitut("David");
        professorSubstitut.asignarDni("9865741G");
        professorSubstitut.canviarSou(2.000);
        professorSubstitut.asignarSubstitucio("01/01/2021","03/05/2022");
        institut.afegirProfeSubstitut(professorSubstitut);

        professorSubstitut.asignarDni("9865472N");
*/
        institut.imprimirInformacio();
    }
}
