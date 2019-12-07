package com.techm.arrays;

/**
 * Program for Find the sum of digits for a sequence of digits
 * @author CP00421684
 *
 */
public class SequenceSumDigits {

	static void findSumSeqDigits(int input){
		int sum = 0;
        while (input != 0) {
        int lastdigit = input % 10;
        sum += lastdigit;
        input /= 10;
        }
        System.out.println("sum of sequence digits-->"+sum);
	}
	
	public static void main(String[] args) {
		findSumSeqDigits(123456789);
	}

}
