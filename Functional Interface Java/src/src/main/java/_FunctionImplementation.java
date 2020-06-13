package src.main.java;

import java.util.Scanner;
import java.util.function.*;

/* Function is a inbuilt functional Interface in Java-
 * 
 * public interface Function<T, R> {
 * public <R> apply(T parameter){
 * 
 * }
 * }
 */

public class _FunctionImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Simple hello name program ");
		String s = kb.next();
		kb.close();
		Function<String, String> function = (k) -> "Hello " + k;
		System.out.println(function.apply(s));

	}

}
