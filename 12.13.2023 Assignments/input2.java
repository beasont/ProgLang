package mypack;
import java.io.*;

public class input2 {

	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
		String name = "Tristan Beason";
		int year = 0;
		float height = 0,weight = 0;

	
		try {
			System.out.println("What is your name? ");
			name = input.readLine();
			
			System.out.println("What year were you born? ");
			year = Integer.parseInt(input.readLine());
			
			System.out.println("How tall are you, in meters? ");
			height = Float.parseFloat(input.readLine());
			
			System.out.println("How much do you weigh, in kilograms? ");
			weight = Float.parseFloat(input.readLine());
			
		} catch (Exception e) {

		}
		int age = 2024 - year;
	float bmi = weight / (height * height);
	System.out.println("Your name is " + name);
	System.out.println("You are " + age);
	System.out.println("Your BMI is " + bmi);
	}

}
