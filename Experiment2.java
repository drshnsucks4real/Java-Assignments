import java.io.*;

public class Experiment2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of rows: ");
        int rows = Integer.parseInt(br.readLine());
        System.out.print("Enter number of columns: ");
        int cols = Integer.parseInt(br.readLine());
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements row by row (space separated):");
        for (int i = 0; i < rows; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }

        boolean symmetric = true; 

        checkSymmetry:
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break checkSymmetry;
                }
            }
        }

        if (symmetric) {
            System.out.println("Matrix is symmetric.");
        } else {
            System.out.println("Matrix is not symmetric.");
        }
    }
}
