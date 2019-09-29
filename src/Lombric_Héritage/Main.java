package Lombric_Héritage;

public class Main {


    public static void main(String[] args) {
        LombricSain marco = new LombricSain(1);
        LombricSain carla = new LombricSain(2);
        marco.grandit(10);
        carla.grandit(10);
        System.out.println(marco.accouplement(carla));
        System.out.println(marco.getLongueur());
        marco.coupe();
        System.out.println(marco.getLongueur());

    }
}
