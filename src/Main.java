import java.util.List;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println(" START");
        try {
            System.out.println(circle(-6.0, 11.0, 3.14));
        } catch (NegativeValueException e) {
            e.printMessage();
            e.printStackTrace();
            System.out.println("-6.0 radius, 11.0 high, pi 3.14");
        }
        ArrayList<Double> circle = new ArrayList<>();
        circle.add(-6.0);
        circle.add(11.0);
        circle.add(3.14);
        System.out.println(circle);

        try {
            System.out.println(circle(3.0, 11.0, 3.14));
        } catch (NegativeValueException e2) {
            e2.printMessage();
            System.out.println("3.0 radius, 11.0 high, pi 3.14");
        }
        ArrayList<Double> circle2 = new ArrayList<>();
        circle2.add(3.0);
        circle2.add(11.0);
        circle2.add(3.14);
        System.out.println(circle2);

        try {
            System.out.println(circle(11.0, 11.0, 3.14));
        } catch (NegativeValueException e3) {
            e3.printMessage();
            System.out.println("11.0 radius, 11.0 high, pi 3.14");
        }
        ArrayList<Double> circle3 = new ArrayList<>();
        circle3.add(11.0);
        circle3.add(11.0);
        circle3.add(3.14);
        System.out.println(circle3);
        try{
            System.out.println(circle(-5.0, 11.0, 3.14));
        } catch (NegativeValueException e4){
            e4.printMessage();
            e4.printStackTrace();
            System.out.println("-5.0 radius, 11.0 high, pi 3.14");
        }
        ArrayList<Double> circle4 = new ArrayList<>();
        circle4.add(-5.0);
        circle4.add(11.0);
        circle4.add(3.14);
        System.out.println(circle4);
        try{
            System.out.println(circle(22.0, 11.0, 3.14));
        } catch (NegativeValueException e5){
            e5.printMessage();
            System.out.println("22.0 radius, 11.0 high, pi 3.14");
        }
        ArrayList<Double> circle5 = new ArrayList<>();
        circle5.add(22.0);
        circle5.add(11.0);
        circle5.add(3.14);
        System.out.println(circle5);
    }

    private static double circle(double radius, double high, double pi) throws NegativeValueException {

        throw new NegativeValueException(" double radius -6.0, double radius " +
                " -5.0 - " + "NegativeValueException");

    }


}





