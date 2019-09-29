package Complexe;

public class Main {

    public static void main(String[] args) {

        Complexe c1 = new Complexe(2,3);
        ComplexeTrigo c2 = new ComplexeTrigo(5,0.5);
        Complexe c3 = new Complexe();

        Complexe c4 = Complexe.plus(c1,c3.instanceTrigo(c2));


        System.out.println(c4.toString());
        System.out.println(c4.toStringTrigo());
    }
}
