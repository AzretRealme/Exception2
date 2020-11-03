import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        System.out.println(" START");
        try{
            int result = area (3, -6, 11,-5,22,11);
            System.out.println(result);
        } catch (IllegalArgumentException e){
            System.out.println(" int a1, int b1, int i1, int i, int a, int b cannot < 0 ");

        }
        System.out.println("End");
    }
    private static int area(int a1, int b1, int i1, int i, int a, int b){
        //if(a < 0 || b < 0 || a1 < 0 || b1 < 0 || i1 < 0 || i < 0){
            ArrayList<Integer> area = new ArrayList<>();
            area.add(3);
            area.add(-6);
            area.add(11);
            area.add(-5);
            area.add(22);
            area.add(11);
            System.out.println(area);
            throw new IllegalArgumentException("int a1, int b1, int i1, int i, int a, int b is less tan 0");

        }
    }
