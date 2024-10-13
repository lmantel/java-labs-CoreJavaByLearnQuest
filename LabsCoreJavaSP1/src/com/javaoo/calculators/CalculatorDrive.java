/**
 * 
 */
package com.javaoo.calculators;

/**
 * @author lmantel
 *
 */
public class CalculatorDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicCalculator bc = new BasicCalculator();
		System.out.println("5 + 7 = " + bc.add(5, 7));
		System.out.println("5 + 7 = " + bc.subtract(5, 7));
		System.out.println("5 + 7 = " + bc.divide(5, 7));
		System.out.println("5 + 7 = " + bc.multiply(5, 7));
		
		ScientificCalculator sc = new ScientificCalculator();
		System.out.println("Exponent of 20 = " + sc.exp(20));
		System.out.println("Logarithm of 100 = " + sc.log(100));
		sc.putValueIntoMemory(23.5);
		System.out.println("Value in memory is = " + sc.getValueFromMemory());
		
		TrigonometricCalculator tc = new TrigonometricCalculator();
		System.out.println("Sine of 0.523 is = " + tc.sine(0.523));
		System.out.println("Cosine of 0.523 is = " + tc.cosine(0.523));
		System.out.println("Tangent of 0.523 is = " + tc.tangent(0.523));
		System.out.println("Arcsine of 0.5 is = " + tc.arcsine(0.5));
		System.out.println("Arccosine of 0.5 is = " + tc.arccosine(0.5));
		System.out.println("Arctangent of 0.5 is = " + tc.arctangent(0.5));

	}

}
