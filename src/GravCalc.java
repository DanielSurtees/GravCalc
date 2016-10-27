
public class GravCalc {
	public static void main(String[] args) {
		
		double gravity = -9.81; //Earths Gravity in ms^2
		double initialVelocity = 0;
		double fallingTime = 10.0;
		double initialPosition = 0;
		double finalPosition = 0;
		
		finalPosition = 0.5 * (gravity * (fallingTime * fallingTime))
				+ (initialVelocity * fallingTime) + initialPosition;
		
		System.out.println("The Objects position after " 
		+ fallingTime + " seconds is " + finalPosition + " m.");
		
	}
}
