package com.rizvi.begineer;
import java.util.Scanner;

public class DCP27PrimeChecker {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        DCP27PrimeChecker primeChecker = new DCP27PrimeChecker();
        int numberOfcandidate = inp.nextInt();
        int input[] = new int[numberOfcandidate];
        for(int i = 0; i< numberOfcandidate; i++) {
        	int candidate = inp.nextInt();
        	input[i] = candidate;
        }
        for(int i = 0; i< numberOfcandidate; i++) {
        	System.out.println(primeChecker.isPrime(input[i]));
        }
    }

    // checks whether an int is prime or not.
    String isPrime(int n) {
        // check if n is 2
        if (n == 2)
            return "Yes";
        // check if n is a multiple of 2
        if (n < 2 || n % 2 == 0)
            return "No";
        // if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return "No";
        }
        return "Yes";
    }
}