package com.perito.logical;

public class Fundamental {

	public static String getNumbersInRange(int start, int end) {
		String result = "";
		if (start > end) {
			for (int i = start - 1; i > end; i--) {
				// System.out.println(i);
				result = result + i + " ";
			}
		}
		return result;
	}

	public static String getNumbersInRange(int start, int end, int gap) {
		String result = "";
		if (start < end) {
			for (int i = start + 1; i < end; i++) {
				result = result + i + " ";
				i = i + (gap - 1);
			}
		}
		return result;
	}

	public static String getFourPerLine(int num) {
		String result = "";
		for (int i = 1; i <= num; i++) {
			result = result + i + " ";
			if (i % 4 == 0) {
				result = result + "\n";
			}
		}
		return result;
	}

	public static String createStarPattern(int num) {
		String result = "";
		int temp = 1;
		for (int i = 1; i <= num; i++) {
			result = result + "*" + " ";
			if (i % temp == 0) {
				result = result + "\n";
				temp = temp + 1;
				i = 0;
				if (temp > num) {
					break;
				}
			}
		}
		return result;
	}

	/*
	 * public static String NumberPattern4(int num) { String result = ""; int temp =
	 * 1; for (int i = 1; i <= num; i++) { result = result + i + " "; if (i % temp
	 * == 0) { result = result + "\n";
	 * 
	 * temp = temp + 1; }
	 * 
	 * }
	 * 
	 * return result; }
	 */

	public static String checkPrime(int num) {
		String result = "";
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				result = "false";
				break;
			} else {
				result = "true";
			}
		}

		return result;

	}

	public static String checkPalindrome(int num) {

		String res = "";
		int revInt = 0;
		int rem = 0;
		int original = num;

		while (num != 0) {
			rem = num % 10;
			System.out.println(rem);
			revInt = revInt * 10 + rem;
			System.out.println(revInt);
			num = num / 10;
			System.out.println(num);
		}
		if (original == revInt) {
			res = "Palindrome";
		} else {
			res = "not Palindrome";
		}
		return res;
	}

	public static void main(String[] args) {
		// System.out.println(getNumbersInRange(10, 1));
		// System.out.println(getNumbersInRange(10, 30 , 2));
		// System.out.println(getFourPerLine(13));
		// System.out.println(createStarPattern(4));
		// System.out.println(NumberPattern4(5));
		// System.out.println(checkPrime(7));
		System.out.println(checkPalindrome(141));

	}

}
