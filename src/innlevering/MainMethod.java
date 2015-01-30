//Innlevering av Simen Faugli

package innlevering;

public class MainMethod {
	public static void main(String[] args) {
		
		RationalNumber[] numbers = {
				new RationalNumber(), 
				new RationalNumber(3, 1),
				new RationalNumber(3, 5),
				new RationalNumber(3, 2),
		};
		
		//Enkelt aa legge til broeker, aldri komma etter siste broek.
		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				System.out.print("Brøk " + (i + 1) + " = "+numbers[i] + ", ");
			} else  {
				System.out.print("brøk "+ (i + 1) + " = "+numbers[i]);
				//Komma blir lagt til saa lenge det ikke er siste tall i arrayen.
				if (i + 1 < numbers.length) {
					System.out.print(", ");

				}
			} 
		}
		//Det ville ha blitt èn "if" per operator om koden var en for-loop. 
		//Derfor valgte jeg heller ganske lik utskrift.
		System.out.print("\nbrøk 3 + brøk 4 = " + numbers[2] + " + " + numbers[3]);
		System.out.println(" = " + numbers[2].add(numbers[3]));
		
		System.out.print("brøk 3 - brøk 4 = " + numbers[2] + " - " + numbers[3]);
		System.out.println(" = " + numbers[2].subtract(numbers[3]));
		
		System.out.print("brøk 3 * brøk 4 = " + numbers[2] + " * " + numbers[3]);
		System.out.println(" = " + numbers[2].multiply(numbers[3]));
		
		System.out.print("brøk 3 / brøk 4 = " + numbers[2] + " / " + numbers[3]);
		System.out.println(" = " + numbers[2].divide(numbers[3]));
	}
}
