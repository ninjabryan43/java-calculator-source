/* There are a lot of different ways you could do this.
 * This is just a simple calculator source that prints out addition, subtraction, multiplication, and division.
 * If you are new to programming, int means integer, "||" means (and), and programming is awesome
 *  ninjabryan43
 */


package calculator;



public class Calculator {
	
	// Variables
	
	static String mode = ""; // Empty string (We change this later)
	
	// Setup
	
		public static void main(String[] args) { // Main part of the calculator, this is where it adds, subtracts, multiplies, and divides the numbers.
			addnumbers(50, 50);
			subtractnumbers(50, 50);
			multiplynumbers(50, 50);
			dividenumbers(50, 50);
			exponentnumbers(5, 5);
		}
	
	// Voids
	
		public static void addnumbers(int numA, int numB) { // numA is a variable for the first number, numB is a variable for the second number.
			
			mode = "Addition"; // This really is not necesary but i do this for practice. This changes the mode to "Addition"
			
			if(mode == "Addition") { // This checks if the mode is equal to "Additionn" and if it does then it prints the sum of numA + numB.
				System.out.println("The sum of " + numA + " and " + numB + " is: " + (numA + numB)); // Adds numA and numB to get an answer
			}
			
		}
		
		public static void subtractnumbers(int numA, int numB) { // Same thing as addnumbers but with a different name (subtractnumbers)
			
			mode = "Subtraction"; // Again, not necesary but i do this for practice.
			
			if(mode == "Subtraction") { // Same as addition void 
				System.out.println("The difference of " + numA + " and " + numB + " is: " + (numA - numB)); // Subtracts numA and numB to get the answer.
			}
			
		}
		
		public static void multiplynumbers(int numA, int numB) { // Last time, same as the other voids but with different names.
			
			mode = "Multiplication";
			
			if(mode == "Multiplication") {
				System.out.println("The product of " + numA + " and " + numB + " is: " + (numA * numB));
			}
			
		}
		
		public static void dividenumbers(int numA, int numB) {
			
			mode = "Division";
			
			if(mode == "Division") {
				if(numA > numB || numA != numB) { // Makes sure that the divisor is greater than the dividend.
					System.out.println("The quotient of " + numA + " and " + numB + " is: " + (numA / numB));
				}
			else {
					System.out.println("Make sure the first number is greater than the second number. Also make sure that both numbers do not equal eachother.");
				}
				
			}
			
		}
		
		public static void exponentnumbers(int numA, int numB) {
			
			mode = "Exponents";
			
			if(mode == "Exponents") {
				System.out.println("The answer of " + numA + " to the power of " + numB + " is: " + (java.lang.Math.pow(numA, numB)));
			}
		}
		
	
}
// Simple calculator in about 90 lines of code.