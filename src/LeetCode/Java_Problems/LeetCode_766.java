package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/toeplitz-matrix/description/?envType=problem-list-v2&envId=matrix&difficulty=EASY

public class LeetCode_766 {
	public boolean isToeplitzMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[i].length - 1; j++) {
				if (matrix[i][j] != matrix[i + 1][j + 1]) {
					return false;
				}
			}
		}
		return true;
	}
}