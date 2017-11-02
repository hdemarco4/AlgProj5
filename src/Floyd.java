import java.util.Scanner;

public class Floyd {
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

                dGrid[i][j][0] = y;
                dGrid[i][j][1] = 0;
            }
        }
        pGrid(d, dGrid);
        tableBuild(v, d, dGrid, weights);
    }

    public static void tableBuild(int v, int d, Object[][][] dGrid, int[][] weights){

        for(int i = 0; i < v; i++){
            for(int j = 0; j < v; j++){
                if(i != d && j != d && i != j && (int)dGrid[i][d][0] != -1 && (int)dGrid[d][j][0] != -1){
                    if((int)dGrid[i][j][0] > (int)dGrid[i][d][0] + (int)dGrid[d][j][0] || (int)dGrid[i][j][0] == -1){
                        dGrid[i][j][0] = (int)dGrid[i][d][0] + (int)dGrid[d][j][0];
                        dGrid[i][j][1] = d+1;
                    }

                }
            }
        }

        pGrid(d+1, dGrid);
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
                    if((int)z == -1){
                        System.out.print('-' + " ");
                    }
                    else {
                        System.out.print(z + " ");
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
