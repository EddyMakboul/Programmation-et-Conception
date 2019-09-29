package Compteur;
import java.util.LinkedList;

public class Compteur {

    private LinkedList<Integer> compteur;

    Compteur() {
        compteur = new LinkedList<>();
    }

    Compteur(int init) {
        compteur = new LinkedList<>();
        int flag=0;

        for(int i=0;flag==0;i++)
        {
            int temp=0;
            if(init>0)
            {
                temp=init%10;
                init=init/10;
                compteur.add(temp);
            }
            else flag++;
        }

    }

    Compteur( Compteur c){
        compteur = new LinkedList<>();

        for(int i=0;i<c.compteur.size();i++)
        {
            compteur.add(c.compteur.get(i));
        }
    }

    public void inc() {
        int flag = 0;
        for (int i = 0; flag == 0; i++) {

            if (compteur.get(i) != 9) {
                compteur.set(i, compteur.get(i) + 1);
                flag++;
            }
            else if (compteur.get(i) == 9) {
                compteur.set(i, 0);
                if (compteur.size()-1 == i) {
                    compteur.add(i + 1, 1);
                    flag++;
                }
            }
        }
    }

    public void dec() {
        int flag = 0;
        for (int i = 0; flag == 0; i++) {

            if (compteur.get(i) != 0) {
                compteur.set(i, compteur.get(i) - 1);
                if(compteur.size()-1==i && compteur.get(i)==0)
                    compteur.remove(i);
                flag++;
            } else if (compteur.get(i) == 0) {
                compteur.set(i, 9);
            }
        }
    }

    public void affiche() {
        for (int i = compteur.size()-1; i >= 0; i--) {
            System.out.print(compteur.get(i) + "");
        }
        System.out.println("");
    }

    public boolean egale(Compteur c){

        for(int i=0;i<compteur.size()-1;i++)
        {
            if(compteur.get(i)!=c.compteur.get(i))
                return false;
        }
        return true;
    }
}
