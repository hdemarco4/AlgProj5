import java.util.ArrayList;
import java.util.Scanner;

public class Proj5 {
    public static void main(String[] args) {
        int d = 0;

        System.out.print("number of vertices: ");
        int v = new Scanner(System.in).nextInt();

        Object[][][] dGrid = new Object[v][v][2];

        Scanner w = new Scanner(System.in);
        int[][] weights = new int[v][v];

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print("weight: ");
                int y = w.nextInt();
                weights[i][j] = y;

                if(y == -1) {
                    dGrid[i][j][0] = '-';
                    dGrid[i][j][1] = 0;
                }
                else {
                    dGrid[i][j][0] = y;
                    dGrid[i][j][1] = 0;
                }
            }
        }
        pGrid(d, dGrid);

        tableBuild(v, 1, dGrid, weights);

            for (int[] y : weights) {
                for (int z : y) {
                    System.out.print(z + " ");
                    }
                System.out.println();
            }

    }

    public static void tableBuild(int v, int d, Object[][][] dGrid, int[][] weights){
        








        pGrid(d, dGrid);
        d++;
        if(d < v){
            tableBuild(v, d, dGrid, weights);
        }
    }


    public static void pGrid(int d, Object[][][] dGrid){
        System.out.println("D " + d);
        for (Object[][] x : dGrid) {
            for (Object[] y : x) {
                for (Object z : y) {
                    System.out.print(z + " ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
