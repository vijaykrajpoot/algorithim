package com.algo;

public class Pow {
	static int i = 0;

	public double myPow(double x, long l) {
		if (l < 0) {
			return 1 / pow(x, -l);
		} else {
			return pow(x, l);
		}
	}

	private double pow(double x, long l) {
		if (l == 0) {
			return 1.0;
		}
		if (x == 1) {
			return x;
		}
		double val = pow(x, l / 2);
		System.out.println("Val:" + val);
		if (l % 2 == 0) {
			System.err.println("l is Even:" + l + " Val:" + val);
			return val * val;
		} else {

			System.err.println("l is Odd:" + l + " Val:" + val);
			return val * val * x;
		}

	}

	public static void main(String[] args) {
		Pow pow = new Pow();
		double aa = pow.myPow(2.2, 10);
		System.out.println(" Pow:" + aa);
	}
}
