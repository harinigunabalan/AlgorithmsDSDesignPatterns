package arrays.twodimension;

public class MatrixRotation {

	
	public static int[][] rotate(int[][] matrix, int n){
		for(int i = 0; i < n/2; i++){
		
			for(int j = 0; j<=n/2;j++){
				
				int temp = matrix[i][j];
				// rotation begins
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
				
			}
		}
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix, int n){
		for(int i = 0; i< n; i++){
			for(int j = 0; j<n ; j++){
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		int count = 1;
		int n = 5;
		int[][] matrix = new int[n][n];
		
		for(int i = 0; i< n; i++){
			for(int j = 0; j<n ; j++){
				matrix[i][j] = count++;
			}
			System.out.println();
		}
		
		
		printMatrix(matrix, n);
		System.out.println();
		matrix = rotate(matrix, n);
		System.out.println();
		printMatrix(matrix, n);
		
	}
	
}
