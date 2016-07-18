package arrays.twodimension;

public class matrix {

	
	
	public static void main(String[] args){
	
		int[][] matrix = new int[10][12];
		for(int i = 0; i < 10; i++){
			for (int j = 0; j < 8; j ++){
				matrix[i][j] = 1;
			}
		}
		System.out.println(matrix.length);
		
	}
	
}
