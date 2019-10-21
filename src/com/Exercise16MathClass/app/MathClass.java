package com.Exercise16MathClass.app;

import java.lang.Math;

public class MathClass {

	public static void main(String[] burrito) {
		
		double number=3.88;
		double number2=5.78;
		
		
		System.out.println("Valor de e: "+Math.E);
		System.out.println("Valor de Pi: "+Math.PI);
		System.out.println("Absolute value of: -2.15- "+Math.abs(-2.15));
		System.out.println("The cube root of 27 is: "+Math.cbrt(27));
		System.out.println("The round of 3.76: "+Math.round(3.76));
		System.out.println("The round ceil of 3.4: " +Math.ceil(3.4));
		System.out.println("The round floor of 3.8: " +Math.floor(3.8));
		System.out.println("Increment of 6: "+Math.incrementExact(6));
		System.out.println("Decrement of 5: " +Math.decrementExact(5));
		System.out.println("Power valie of 3 Euler is"+Math.exp(3));
		System.out.println(String.format("Which is bigger? %f or %f: %f", number, number2, Math.max(number,number2)));
		System.out.println(String.format("Which is smaller? %f or %f: %f", number, number2, Math.min(number, number2)));
		System.out.println("Sin of 0 degrees is: "+Math.sin(0));
		System.out.println("Sin of Pi/2 degrees is: "+Math.asin(Math.PI/2));
		System.out.println("Cos of 0 degrees is: " +Math.cos(0));
		System.out.println("Cos of Pi/2 degrees is: "+Math.cos(Math.PI/2));
				
		
	}
}
