package Lombric_Héritage;

public class LombricSain extends Lombric {

    private int gène;

    public LombricSain(int race)
    {
        this.longueur=1;
        this.gène=race;
    }

    public Lombric accouplement( LombricSain b)
    {
        if(gène==b.gène)
            return super.accouplement(b);
        else
            return null;
    }

    public Lombric coupe()
    {
        this.longueur= this.longueur/2;
        return new LombricSain(this.gène);

    }
}
