package Complexe;

public class ComplexeAll {

    private double x;
    private double y;
    private double rho;
    private double theta;

    public ComplexeAll(){}

    public ComplexeAll(double x, double y, double rho, double theta){
        this.rho=rho;
        this.theta=theta;
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRho() {
        return rho;
    }

    public void setRho(double rho) {
        this.rho = rho;
    }

    public double getTheta() {
        return theta;
    }

    public void setTheta(double theta) {
        this.theta = theta;
    }
}
