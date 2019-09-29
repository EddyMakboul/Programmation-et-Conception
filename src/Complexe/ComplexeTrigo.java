package Complexe;

public class ComplexeTrigo {

    private double rho;
    private double theta;

    public ComplexeTrigo(){}

    public ComplexeTrigo(double rho, double theta){
        this.rho=rho;
        this.theta=theta;
    }

    public void setX(double x)
    {
        this.rho = Math.sqrt(Math.pow(x,2)+ Math.pow(getY(),2));
        this.theta = Math.asin(getY()/getRho());
    }

    public double getX(){
        return rho*(Math.cos(theta));
    }

    public void setY(double y){
        this.rho = Math.sqrt(Math.pow(getX(),2)+ Math.pow(y,2));
        this.theta = Math.asin(y/getRho());
    }

    public double getY(){
        return  rho * (Math.sin(theta));
    }

    public void setRho( double newRho){
        this.rho=newRho;
    }

    public double getRho(){
        return rho;
    }

    public double getTheta() {
        return theta;
    }

    public void setTheta(double theta) {
        this.theta = theta;
    }
}
