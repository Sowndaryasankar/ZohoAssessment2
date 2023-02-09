package org.zoho;
import java.util.*;

public class Q6Matrix {
	static int[][] rotateMatrix(int[][]matrix){
		int n=matrix.length;
		int[][]rotated=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				rotated[j][n-i-1]=matrix[i][j];
			}
		}
		
	return rotated;
	}
	static int[][]rotateMatrixNTime(int[][]matrix,int times){
		int n=times%4;
		for(int i=0;i<n;i++) {
			matrix=rotateMatrix(matrix);
		}
		return matrix;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of matrix");
		int n=sc.nextInt();
		int[][] matrix=new int[n][n];
		System.out.println("Enter the values of matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][i]=sc.nextInt();
				
			}
		}
		System.out.print("Enter the number of times to ratate");
		int times=sc.nextInt();
		int[][]rotated=rotateMatrixNTime(matrix,times);
		System.out.println("rotate matrix:");
		for(int[]row:rotated) {
			System.out.println(Arrays.toString(row));
		}
		sc.close();
	}
}

