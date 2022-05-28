package test;
import java.util.Random;

public class test {

	public static void main(String[] args) {
		
		//Create random data 
		Random random = new Random();
		
		//variable to be changed 
		int changedVariable = 100;
		System.out.println("variable to be changed currently equals " + changedVariable);
		
		//random integer 
		int randomIntOne = random.nextInt(10);
		System.out.println("random int one equals "+ randomIntOne);
		int randomIntTwo = random.nextInt(10);
		System.out.println("random int two equals "+ randomIntTwo);

		
		//basic operations 
		int add = randomIntOne + randomIntTwo;
		int subtraction = randomIntOne - randomIntTwo;
		int mult = randomIntOne * randomIntTwo;
		int div = randomIntOne / randomIntTwo;
		System.out.println("currnet value of div equals " + div);
		
		//changed value of changedVarialbe
		changedVariable = div;
		if (changedVariable == div) {
			System.out.println("change to variable occured");
		}
		else {
			System.out.println("change did not occur");
		}
		System.out.println("changedVariable now equals "+ changedVariable);
		
		//Display results
		System.out.println("Results: Addition " + add + " Subtraction " + subtraction + " Multiplcation "+ mult);

		double randomDoubOne = random.nextDouble();
		double randomDoubTwo = random.nextDouble();
		System.out.println("random double one is "+ randomDoubOne + " and " +"random double two is "+ randomDoubTwo);

		//double equations 
		double addition = randomDoubOne + randomDoubTwo;
		double subt = randomDoubOne - randomDoubTwo;
		double mul = randomDoubOne * randomDoubTwo;
		double division = randomDoubOne / randomDoubTwo;
		
		System.out.println("Results for double, Addition: " + addition + " subtraction: " + subt + " multiplcation: " + mul + " division: " + division);
	
		//Temperature conversion
		
		int intTemp = temperature(randomIntOne);
		double doubleTemp = temperature(randomDoubOne);
		
		System.out.print("The temperature conversions are ");
		System.out.println("Int temperature: " + intTemp + " Double temperature: " + doubleTemp);

	}

	public static int temperature(int celsius) {
		int waterTP = 32;
		int tempReturn = (int) ((celsius*1.8)+waterTP);
		return tempReturn;
	}
	
	
	public static double temperature(double celsius) {
		double waterTP = 32;
		double tempReturn = (celsius*1.8)+waterTP;
		return tempReturn;
	}
}

