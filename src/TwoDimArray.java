import java.util.Scanner;

public class TwoDimArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows;
		int cols;
		System.out.println("-----Find maximum value in a matrix-----");
		do {
			System.out.print("Enter number of rows: ");
			rows = input.nextInt();
			System.out.print("Enter number of columns: ");
			cols = input.nextInt();
		} while (rows <= 0 || cols <= 0);


		int[][] mat = new int[rows][cols];
		inputMatrix(mat);

		int row_ind = 0;
		int col_ind = 0;
		int max = mat[0][0];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (mat[i][j] > max) {
					max = mat[i][j];
					row_ind = i;
					col_ind = j;
				}
			}
		}
		System.out.print("Maximum value in the matrix is " + max);
		System.out.print(" at row " + (row_ind + 1) + "th, column " + (col_ind + 1) + "th.");
	}

	public static void inputMatrix(int[][] mat) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < mat.length; i++) {
			System.out.println("Enter numbers in " + (i + 1) + "th row:");
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print("    Enter number at " + (j + 1) + "th column: ");
				mat[i][j] = input.nextInt();
			}
		}
	}
}
