package com.algo;

import java.util.Random;

public class CharTest {
	private static Random rand = new Random();
	// r - 0-9
	// r - 10 -35
	public static void main(String[] args) {
		StringBuilder shortURL = new StringBuilder();
		for (int i = 0; i < 6; ++i) {
			int r = rand.nextInt(62);
			if (r < 10) {
				shortURL.append(r);
			} else if (r < 36) {
				System.out.println("(char) (r - 10 + 'a'):"+ ((char) (r - 10 + 'A')));
				shortURL.append((char) (r - 10 + 'A'));
			} else {
				System.out.println("(char) (r - 36 + 'a'):"+ ((char) (r - 36 + 'a')));
				shortURL.append((char) (r - 36 + 'A'));
			}
		}
		System.err.println(shortURL.toString());
	}
}
