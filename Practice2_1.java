import java.io.*;

public class Practice2_1 {
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

        int sumDiagonal = 0;
        int sumAbove = 0;
        int sumBelow = 0;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    sumDiagonal += matrix[i][j];       
                } else if (i < j) {
                    sumAbove += matrix[i][j];          
                } else {
                    sumBelow += matrix[i][j];          
                }
            }
        }

        System.out.println("Sum of elements on diagonal: " + sumDiagonal);
        System.out.println("Sum of elements above diagonal: " + sumAbove);
        System.out.println("Sum of elements below diagonal: " + sumBelow);
    }
}
