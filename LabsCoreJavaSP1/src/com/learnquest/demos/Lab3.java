/**
 * 
 */
package com.learnquest.demos;

/**
 * @author Developer
 *
 */
public class Lab3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] daysOfWeek = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};
		String[] monthNames = new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
		
		///*
		System.out.println("Start of output for Excercise1: standar loop");
		for (int i= 0; i < daysOfWeek.length; i++) {
			System.out.println(daysOfWeek[i]);
		}
		
		System.out.println("Start of output for Excercise1: enhanced loop");
		for (String day: daysOfWeek) {
			System.out.println(day);
		}
		
		System.out.println("Start of output for Excercise1: reverse loop");
		for (int j=daysOfWeek.length-1; j>=0; j--) {
			System.out.println(daysOfWeek[j]);
		}
		
		System.out.println("Start of output for Excercise2: while loop");
		int number = 1;
        while (number <= 20) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
        
        System.out.println("Start of output for Excercise2: while loop with continue");
        int number2 = 1;
        while (number2 <= 20) {
            if (number2 % 2 != 0) {
                number2++;
                continue;
            }
            System.out.println(number2);
            number2++;
        }
		//*/
        
        System.out.println("Start of output for Excercise3: while loop with condition");
        for (int number3 = 1; number3 <= 100; number3++) {
            if (number3 >= 50 && number3 <= 60) {
                continue;
            }
            System.out.println(number3);
        }
        
        int counter = 1;
        while (counter <= 12) {
            switch (counter) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(monthNames[counter - 1] + " has 31 days.");
                    break;
                case 2:
                    System.out.println(monthNames[counter - 1] + " has 28 or 29 days.");
                    break;
                default:
                    System.out.println(monthNames[counter - 1] + " has 30 days.");
                    break;
            }

            counter++;
        }
        
        
        String output = "";
        int x = 2;
        switch(x){
        	case 1:
        	case 2:
        	case 3:
        		output += "one,two,three,";
        	case 4:
        		output += "four,";
        		break;
        	case 5:
        		output += "five,";
        		break;
        	default:
        		output += "six";
        		output += "six";

        }
        System.out.println(output);
		
	}

}
