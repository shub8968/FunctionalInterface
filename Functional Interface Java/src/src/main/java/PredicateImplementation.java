package src.main.java;

import java.net.PasswordAuthentication;
import java.util.*;
import java.util.function.Predicate;

public class PredicateImplementation {
	private static Set<PasswordAuthentication> set = new HashSet<>();

	private static class User {
		String u1 = "Bob";
		char p1[] = { 't', 'i', 'g', 'e', 'r' };
		String u2 = "Alice";
		char p2[] = { '1', '2', '3', '@' };

		public void addUser() {
			PasswordAuthentication user1 = new PasswordAuthentication(u1, p1);
			PasswordAuthentication user2 = new PasswordAuthentication(u2, p2);
			AddUser(user1);
			AddUser(user2);
		}

	}

	public static void main(String[] args) {
		User userobj = new User();
		userobj.addUser();
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter UserName ");
		String username = kb.next();
		System.out.print("Enter Password ");
		String password_ = kb.next();
		kb.close();
		char password[] = password_.toCharArray();
		PasswordAuthentication passwordObj = new PasswordAuthentication(username, password);
		Predicate<PasswordAuthentication> function = (s) -> set.stream().anyMatch(t -> 
		(s.getUserName().equals(t.getUserName())) && (Arrays.equals(s.getPassword(), t.getPassword())));
		System.out.println(function.test(passwordObj) ? "Authenticated" : "Denied");
	}

	public static void AddUser(PasswordAuthentication user) {
		set.add(user);
	}

}
