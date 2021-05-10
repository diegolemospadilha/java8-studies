package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.println("How many students for course A?");
		Scanner sc = new Scanner(System.in);

		int quantity = sc.nextInt();

		for (int i = 0; i < quantity; i++) {
			int studentCode = sc.nextInt();
			a.add(studentCode);
		}

		// B
		System.out.println("How many students for course b?");

		quantity  = sc.nextInt();

		for (int i = 0; i < quantity; i++) {
			int studentCode = sc.nextInt();
			b.add(studentCode);
		}
		
		a.addAll(b);

		// C
		System.out.println("How many students for course C?");

		quantity = sc.nextInt();

		for (int i = 0; i < quantity; i++) {
			int studentCode = sc.nextInt();
			c.add(studentCode);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		sc.close();
		System.out.println("Total students:" + a.size());

	}

}
