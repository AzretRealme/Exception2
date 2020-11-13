
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println(" START");
        ArrayList<Double> circle = new ArrayList<>();
        try {
            double radius = -6.0;
            double height = 11.0;
            circle.add(-6.0);
            circle.add(11.0);

            double V = Math.PI * Math.pow(radius, 2) * height;
            System.out.println( " result = " + V);
            throw new NegativeValueException(" ERROR -6.0");
        } catch (NegativeValueException e) {
            for (double i = 0; i < circle.toArray().length; i++) {
                System.out.println(circle);
                e.printMessage();
                e.printStackTrace();
            }
        }
            ArrayList<Double> circle2 = new ArrayList<>();
            try {
                double radius = 3.0;
                double height = 11.0;

                circle2.add(3.0);
                circle2.add(11.0);

                double V = Math.PI * Math.pow(radius, 2) * height;
                System.out.println( " result = " + V);
                throw new NegativeValueException(" radius, high, pi is less tan 0");
            } catch (NegativeValueException e2) {
                for (double i = 0; i < circle2.toArray().length; i++) {
                    System.out.println(circle2);
                    e2.printMessage();

                }
            }
                ArrayList<Double> circle3 = new ArrayList<>();
                try {
                    double radius = 11.0;
                    double height = 11.0;
                    circle3.add(11.0);
                    circle3.add(11.0);
                    double V = Math.PI * Math.pow(radius, 2) * height;
                    System.out.println( " result = " + V);
                    throw new NegativeValueException(" radius, high, pi is less tan 0");
                } catch (NegativeValueException e3) {
                    for (double i = 0; i < circle3.toArray().length; i++) {
                        System.out.println(circle3);
                        e3.printMessage();
                    }
                }
                    ArrayList<Double> circle4 = new ArrayList<>();
                    try {
                        double radius = -5.0;
                        double height = 11.0;
                        circle4.add(-5.0);
                        circle4.add(11.0);
                        double V = Math.PI * Math.pow(radius, 2) * height;
                        System.out.println(" result = " + V);
                        throw new NegativeValueException(" ERROR -5.0 ");
                    } catch (NegativeValueException e4) {
                        for (double i = 0; i < circle4.toArray().length; i++) {
                            System.out.println(circle4);
                            e4.printMessage();
                            e4.printStackTrace();
                        }
                    }
                        ArrayList<Double> circle5 = new ArrayList<>();
                        try {
                            double radius = 22.0;
                            double height = 11.0;
                            circle5.add(22.0);
                            circle5.add(11.0);
                            double V = Math.PI * Math.pow(radius, 2) * height;
                            System.out.println( " result = " + V);
                            throw new NegativeValueException(" radius, high, pi is less tan 0");
                        } catch (NegativeValueException e5) {
                            for (double i = 0; i < circle5.toArray().length; i++) {
                                System.out.println(circle5);
                                e5.printMessage();

                            }

                        }

                    }
                }
