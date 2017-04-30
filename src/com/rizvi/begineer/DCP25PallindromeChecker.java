package com.rizvi.begineer;

import java.util.Scanner;

/**
 * [DCP-25]: Palindrome
 * @author rizvi
 *
 */
public class DCP25PallindromeChecker {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		DCP25PallindromeChecker pallindromeChecker = new DCP25PallindromeChecker();
		int numberOfcandidate = inp.nextInt();
		String input[] = new String[numberOfcandidate];
		for (int i = 0; i < numberOfcandidate; i++) {
			String candidate = inp.next();
			input[i] = candidate;
		}
		for (int i = 0; i < numberOfcandidate; i++) {
			System.out.println(pallindromeChecker.isPhrasePalindrome(input[i]));
		}
	}
	public static String isTextPalindrome(String text) {
	    if (text == null) {
	        return "No";
	    }
	    int left = 0;
	    int right = text.length() - 1;
	    while (left < right) {
	        if (text.charAt(left++) != text.charAt(right--)) {
	            return "No";
	        }
	    }
	    return "Yes";
	}

	public static String isPhrasePalindrome(String text) {
	    String chars = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
	    return isTextPalindrome(chars);
	}
}
