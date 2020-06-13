package src.main.java;

import java.util.Scanner;
import java.util.function.Function;

public class ArmStrongNumber {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		String number = kb.next();
		kb.close();
		Function<String, String[]> function = (s) -> {
			String splitted_char[] = s.split("");
			return splitted_char;
		};
		String splitted_char[] = function.apply(number);
		Double sum = 0.0;
		for (String s : splitted_char) {

			sum = sum + Math.pow(Double.parseDouble(s), 3);
		}
		if (sum == Integer.parseInt(number)) {
			System.out.printf("%s is an Armstrong number", number);
		} else {
			System.out.printf("%s is not an Armstrong number", number);
		}
	}

}
