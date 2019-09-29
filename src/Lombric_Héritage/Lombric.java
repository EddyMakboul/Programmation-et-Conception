package Lombric_Héritage;

public class Lombric {

    protected int longueur;

    public Lombric() { }

    public int getLongueur() {
        return longueur;
    }

    public void grandit(int n){
        this.longueur=this.longueur+n;
    }

    public Lombric accouplement(Lombric b)
    {
        if(getLongueur() >= 10 && b.getLongueur() >= 10)
        {
            return new Lombric();
        }
        return null;
    }

    public Lombric coupe(){
        this.longueur = this.longueur/2;

        return new Lombric();
    }
}
