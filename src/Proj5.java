import java.util.ArrayList;
import java.util.Scanner;

public class Proj5 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> weights = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tempw = new ArrayList<Integer>();

        System.out.print("number of vertices: ");
        int v = new Scanner(System.in).nextInt();

        System.out.print("weights: ");
        Scanner w;


        for(int i = 0; i < v; i++) {
            w = new Scanner(System.in);

            while (w.hasNextInt()) {
                tempw.add(w.nextInt());
            }
            weights.add(tempw);

        }


    }







}
