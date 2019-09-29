package Compteur;

public class Main {

    public static void main(String[] args) {
        Compteur compt = new Compteur(15613);
        Compteur compte = new Compteur(compt);
        compte.affiche();
    }
}
