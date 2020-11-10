import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NegativeValueException{

        System.out.println(" START");
        ArrayList<Double> circle = new ArrayList<>();
        try {
            circle.add(-6.0);
            circle.add(11.0);
            circle.add(3.14);

            throw new NegativeValueException(" ERROR -0.6");
        } catch (NegativeValueException e) {
            for (double d : circle) {
                System.out.println(d);

                e.printMessage();
                e.printStackTrace();
            }
        }
            ArrayList<Double> circle2 = new ArrayList<>();
            try {
                circle2.add(3.0);
                circle2.add(11.0);
                circle2.add(3.14);
                throw new NegativeValueException(" radius, high, pi is less tan 0");
            } catch (NegativeValueException e2) {
                for (double d : circle2) {
                    System.out.println(d);
                    e2.printMessage();

                }
            }
                ArrayList<Double> circle3 = new ArrayList<>();
                try {
                    circle3.add(11.0);
                    circle3.add(11.0);
                    circle3.add(3.14);
                    throw new NegativeValueException(" radius, high, pi is less tan 0");
                } catch (NegativeValueException e3) {
                    for (double d : circle3) {
                        System.out.println(d);
                        e3.printMessage();
                    }
                }
                    ArrayList<Double> circle4 = new ArrayList<>();
                    try {
                        circle4.add(-5.0);
                        circle4.add(11.0);
                        circle4.add(3.14);
                        throw new NegativeValueException(" ERROR -5.0 ");
                    } catch (NegativeValueException e4) {
                        for (double d : circle4) {
                            System.out.println(d);
                            e4.printMessage();
                            e4.printStackTrace();
                        }
                    }
                        ArrayList<Double> circle5 = new ArrayList<>();
                        try {
                            circle5.add(22.0);
                            circle5.add(11.0);
                            circle5.add(3.14);
                            throw new NegativeValueException(" radius, high, pi is less tan 0");
                        } catch (NegativeValueException e5) {
                            for (double d : circle5) {
                                System.out.println(d);
                                e5.printMessage();

                            }

                        }

                    }
                }
