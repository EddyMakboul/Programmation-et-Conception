package Complexe;

public class Complexe {

    private double x;  //partie réel
    private double y;  //partie immaginaire

    public Complexe(){}

    public Complexe(double real,double img){
        this.x =real;
        this.y =img;
    }

    public double getX() {
        return x;
    }

    public void setX(double real) {
        this.x = real;
    }

    public double getY() {
        return y;
    }

    public void setY(double img) {
        this.y = img;
    }

    public void setRho(double rho){
        this.x = rho * (Math.cos(getTheta()));
        this.y = rho * (Math.sin(getTheta()));
    }
    public double getRho(){
        return Math.sqrt(Math.pow(x,2)+ Math.pow(y,2));
    }

    public void setTheta(double theta){
        this.x = getRho() * (Math.cos(theta));
        this.y = getRho() * (Math.sin(theta));
    }

    public double getTheta(){
        return Math.asin(y /getRho());
    }

    public static Complexe plus(Complexe c1,Complexe c2){
        Complexe res = new Complexe();
        res.x =c1.getX() + c2.getX();
        res.y =c1.getY() + c2.getY();
        return res;
    }

    public static Complexe fois(Complexe c1,Complexe c2){
        Complexe res = new Complexe();
        res.x = c1.getX()*c2.getX()-c1.getY()*c2.getY();
        res.y = c1.getX() * c2.getY() + c1.getY()*c2.getX();
        return res;
    }

    public Complexe instanceTrigo(ComplexeTrigo c) // prend en parametre un nombre complexe sous la forme trigonométrique et le transforme en nombre trigo sous forme z=x+iy.
    {
        Complexe complexe = new Complexe();
        complexe.x =c.getX();
        complexe.y = c.getY();
        return complexe;
    }
    public Complexe instanceTrigo(ComplexeAll c)
    {
        Complexe complexe = new Complexe();
        complexe.x =c.getX();
        complexe.y = c.getY();
        return complexe;
    }

    public String toString() {

        if (getY() < 0)
            return "z = " + getX() + " -i " + Math.abs(getY());
        else if (getY() > 0)
            return "z = " + getX() + " +i " + Math.abs(getY());
        else
            return "z = " + getX();
    }

    public String toStringTrigo(){
        return "z = "+getRho() +" e(i "+getTheta()+")";
    }
}
