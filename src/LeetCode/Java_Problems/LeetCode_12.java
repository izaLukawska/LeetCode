package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/integer-to-roman/description/

public class LeetCode_12 {
	public String intToRoman(int num) {
		StringBuilder roman = new StringBuilder();
		int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] romanSymbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		for(int i = 0; i < numbers.length; i++){
			while(numbers[i] <= num){
				roman.append(romanSymbol[i]);
				num -= numbers[i];

			}
		}
		return roman.toString();
	}
}
