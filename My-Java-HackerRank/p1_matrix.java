import java.util.Scanner;


public class p1_matrix {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("enter the elements : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
